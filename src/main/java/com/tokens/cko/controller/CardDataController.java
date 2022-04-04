package com.tokens.cko.controller;

import com.tokens.cko.service.CardDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardDataController {

    private final CardDataService cardDataService;

    public CardDataController(CardDataService cardDataService) {
        this.cardDataService = cardDataService;
    }

    @GetMapping("/cards")
    public String listCards(Model model, @RequestParam(required = false) String type){
        model.addAttribute("cards", cardDataService.getAllCards(type));
        return "cards";
    }
}
