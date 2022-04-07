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

    public static List<CardData> getAllCards(String type, String scheme) {
        if(type != null && !type.isEmpty()){
            if(type.equalsIgnoreCase("3ds1")){
                return getCardList("3ds1",scheme);
            }else if(type.equalsIgnoreCase("3ds2")){
                return getCardList("3ds2",scheme);
            }else {
                return getCardList("n3ds",scheme);
            }
        }

        if(scheme != null && !scheme.isEmpty()) {
            return getCardListForScheme(scheme);
        }
        return card_list;
    }

    private static List<CardData> getCardListForScheme(String scheme) {
        List<CardData> cards = new LinkedList<>();
        if(scheme.equalsIgnoreCase("Other")){
            for(CardData card : card_list){
                if(!card.getDescription().startsWith("Visa")
                        && !card.getDescription().startsWith("Mastercard")
                        && !card.getDescription().startsWith("Amex")){
                    cards.add(card);
                }
            }
        }else{
            for(CardData card : card_list){
                if(card.getDescription().startsWith(scheme)){
                    cards.add(card);
                }
            }
        }
        return cards;
    }

    private static List<CardData> getCardList(String type, String scheme) {
        List<CardData> cards = new LinkedList<>();
        for(CardData card : card_list){
            if(card.getType().equalsIgnoreCase(type)){
                cards.add(card);
            }
        }
        if(scheme != null && !scheme.isEmpty()){
            for(CardData card : cards){
                if(card.getDescription().startsWith(scheme)){
                    cards.remove(card);
                }
            }
        }
        return cards;
    }
}
