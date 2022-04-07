package com.tokens.cko.service;

import com.tokens.cko.model.CardData;
import com.tokens.cko.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardDataService {

    public List<CardData> getAllCards(String type, String scheme) {
        return CardRepository.getAllCards(type, scheme);
    }
}
