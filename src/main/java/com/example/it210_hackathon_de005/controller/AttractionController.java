package com.example.it210_hackathon_de005.controller;

import com.example.it210_hackathon_de005.dto.AttractionDTO;
import com.example.it210_hackathon_de005.model.Attraction;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class AttractionController {
    private final List<Attraction> attractions= new ArrayList<>(
            Arrays.asList(
                    new Attraction(1L,"Vịnh Hạ Long","Quảng Ninh","Danh lam thắng cảnh cấp quốc gia",5.0,"#"),
                    new Attraction(2L,"Phố Cổ Hội An","Quảng Nam","Danh lam thắng cảnh cấp quốc gia",4.8,"#"),
                    new Attraction(3L,"Cố Đô Huế","Thừa Thiên Huế","Danh lam thắng cảnh cấp quốc gia",4.7,"#")
            )
    );
    @GetMapping("/attraction-list")
    public String GetAttractionList(Model model){
        model.addAttribute("attractions",attractions);
        return  "attraction-list";
    }
    @GetMapping("/add")
    public String AddAttraction(Model model){
        model.addAttribute("attraction",new AttractionDTO());
        return "attraction-form";
    }
    @PostMapping("/attraction-form")
    public String Save(@Valid @ModelAttribute(name = "attraction") AttractionDTO attractionDTO,
                       BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "attraction-form";
        }
        Attraction attraction = new Attraction();
        attraction.setId(attractionDTO.getId());
        attraction.setName(attractionDTO.getName());
        attraction.setLocation(attractionDTO.getLocation());
        attraction.setDescription(attractionDTO.getDescription());
        attraction.setRating(attractionDTO.getRating());
        attraction.setCoverImage(attractionDTO.getCoverImage());
        attractions.add(attraction);
        return   "redirect:/attraction-list";
    }

    @GetMapping("/delete/{id}")
    public String Delete(@PathVariable("id") Long id){
        attractions.removeIf(attraction -> attraction.getId().equals(id));
        return   "redirect:/attraction-list";
    }
}
