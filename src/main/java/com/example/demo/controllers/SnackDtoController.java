package com.example.demo.controllers;

import com.example.demo.dto.SnacksDto;
import com.example.demo.services.CalculateHappiness;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meal")
public class SnackDtoController {
    //get meal options, different for morning and evening for different cats
    //post user's chosen snacks
    //get calculate levels of deliciousness and happiness for a meal and compare with min balance
    //post if choice is ok (choice is greater than min balance)
    //post weekly report about cats meals
    @RequestMapping(value = "calculate", method = RequestMethod.GET)
    public CalculateHappiness getl() {
        CalculateHappiness calculateHappiness = new CalculateHappiness();
        calculateHappiness.caltulate(SnacksDto.JELLY_SNACKS.getLevelOfDeliciousness(), SnacksDto.COOKED_UNSEASONED_CHICKEN.getLevelOfDeliciousness());
        return calculateHappiness;
    }
}
