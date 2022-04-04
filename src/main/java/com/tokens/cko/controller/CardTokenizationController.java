package com.tokens.cko.controller;

import com.tokens.cko.model.TokenizationRequest;
import com.tokens.cko.service.CardTokenizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CardTokenizationController {

    private final CardTokenizationService cardTokenizationService;

    public CardTokenizationController(CardTokenizationService cardTokenizationService) {
        this.cardTokenizationService = cardTokenizationService;
    }

    @GetMapping("/card/tokenize/{id}")
    public String tokenizeCard(Model model, @PathVariable String id) {
        if(id != null && id.equalsIgnoreCase("NEW")){
            TokenizationRequest request = new TokenizationRequest();
            model.addAttribute("request", request);
            return "tokenize_custom";
        }
        model.addAttribute("token", cardTokenizationService.getTokenDetails(id));
        return "token";
    }

    @PostMapping("/card/tokenize")
    public String tokenizeCustomCard(Model model, @ModelAttribute("request") TokenizationRequest request) {
        model.addAttribute("token", cardTokenizationService.tokenize(request));
        return "token";
    }
}
