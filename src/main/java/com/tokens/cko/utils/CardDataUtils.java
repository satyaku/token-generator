package com.tokens.cko.utils;

import com.tokens.cko.model.CardData;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardDataUtils {

    public static Map<String, CardData> getCardMap() {
        Map<String,CardData> card_map = new HashMap<>();
        for(CardData card : getCardList()){
            card_map.put(card.getCard_number(),card);
        }
        return card_map;
    }

    public static List<CardData> getCardList() {
        List<CardData> card_list = new LinkedList<>();
        card_list.add(new CardData("4916301720257093","03","2030","100", "3ds1", "description"));
        card_list.add(new CardData("4242424242424242","03","2030","100", "3ds2", "description"));
        card_list.add(new CardData("4539467987109256","03","2030","100", "3ds1", "description"));
        card_list.add(new CardData("4539360659413827","03","2030","100", "n3ds", "description"));
        return card_list;
    }
}
