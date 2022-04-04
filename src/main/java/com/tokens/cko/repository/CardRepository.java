package com.tokens.cko.repository;

import com.tokens.cko.model.CardData;
import com.tokens.cko.utils.CardDataUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardRepository {

    private static Map<String, CardData> card_map = CardDataUtils.getCardMap();

    private static List<CardData> card_list = CardDataUtils.getCardList();

    public static Map<String, CardData> getCardMap() {
        return card_map;
    }

    public static List<CardData> getAllCards(String type) {
        if(type != null && !type.isEmpty()){
            if(type.equalsIgnoreCase("3ds1")){
                return getCardList("3ds1");
            }else if(type.equalsIgnoreCase("3ds2")){
                return getCardList("3ds2");
            }else {
                return getCardList("n3ds");
            }
        }
        return card_list;
    }

    private static List<CardData> getCardList(String type) {
        List<CardData> cards = new LinkedList<>();
        for(CardData card : card_list){
            if(card.getType().equalsIgnoreCase(type)){
                cards.add(card);
            }
        }
        return cards;
    }
}
