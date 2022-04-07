package com.tokens.cko.utils;

import com.tokens.cko.model.CardData;

import java.util.*;

public class CardDataUtils {

    public static Map<String, CardData> getCardMap() {
        Map<String, CardData> card_map = new HashMap<>();
        for (CardData card : getCardList()) {
            card_map.put(card.getCard_number(), card);
        }
        return card_map;
    }

    public static List<CardData> getCardList() {
        List<CardData> card_list = new LinkedList<>();
        card_list.add(new CardData("4916301720257093", "03", "2030", "100", "n3ds", "response_code -> 20014, Invalid Card Number"));
        card_list.add(new CardData("4242424242424242", "03", "2030", "100", "n3ds", "Visa,response_code -> 10000, Approved"));
        card_list.add(new CardData("4539467987109256", "03", "2030", "100", "n3ds", "response_code -> 20014, Invalid Card Number"));
        card_list.add(new CardData("4539360659413827", "03", "2030", "100", "n3ds", "Visa,response_code -> 10000, Approved"));
        card_list.add(new CardData("378282246310005", "03", "2030", "1000", "3ds1", "Amex,REDIRECT_REQUIRED"));
        card_list.add(new CardData("4916301720257093", "03", "2030", "100", "n3ds", "response_code -> 20014, Invalid Card Number"));
        card_list.add(new CardData("4532432452900131", "03", "2030", "257", "n3ds", "VISA, response_code -> 10000, Approved"));
        card_list.add(new CardData("5133078872660100", "03", "2030", "100", "n3ds", "Mastercard, response_code -> 10000, Approved"));
        card_list.add(new CardData("4484070000035519", "03", "2030", "100", "3ds1", "Visa, REDIRECT_REQUIRED"));
        card_list.add(new CardData("5352151570003404", "03", "2030", "100", "3ds1", "Mastercard, REDIRECT_REQUIRED"));

        card_list.addAll(addMore());

        return card_list;
    }

    private static Collection<? extends CardData> addMore() {
        List<CardData> cards = new ArrayList<>();
        List<String> details = getDescriptionList();

        for(int i = 0; i<details.size(); i+=3){
            cards.add(new CardData(details.get(i),"03","2030", details.get(i+2).startsWith("Amex") ? "1000" : "100", details.get(i+1), details.get(i+2)));
        }
        return cards;
    }

    private static List<String> getDescriptionList() {
        List<String> description = new ArrayList<>();
        description.add("4485040371536584");description.add("3ds2");description.add("Visa,Authentication successful");
        description.add("5588686116426417");description.add("3ds2");description.add("Mastercard,Authentication successful");
        description.add("4539628347117863");description.add("3ds2");description.add("Visa,Not authenticated");
        description.add("5309961755464047");description.add("3ds2");description.add("Mastercard,Not authenticated");
        description.add("4024007186645015");description.add("3ds2");description.add("Visa,Authentication could not be performed");
        description.add("5234106378657904");description.add("3ds2");description.add("Mastercard,Authentication could not be performed");
        description.add("4556574722325580");description.add("3ds2");description.add("Visa,Attempted authentication");
        description.add("5558468902774508");description.add("3ds2");description.add("Mastercard,Attempted authentication");
        description.add("4275765574319271");description.add("3ds2");description.add("Visa,Authentication rejected");
        description.add("5596061690670931");description.add("3ds2");description.add("Mastercard,Authentication rejected");
        description.add("4484070000035519");description.add("3ds2");description.add("Visa,Card not enrolled");
        description.add("5352151570003404");description.add("3ds2");description.add("Mastercard,Card not enrolled");
        description.add("4820285375797526");description.add("3ds2");description.add("Visa,Issuer not enrolled");
        description.add("5424583292508738");description.add("3ds2");description.add("Mastercard,Issuer not enrolled");
        description.add("4452927588210665");description.add("3ds2");description.add("Visa,Error message during scheme communication");
        description.add("5291144083573579");description.add("3ds2");description.add("Mastercard,Error message during scheme communication");
        description.add("4556085951507152");description.add("3ds2");description.add("Visa,No associated 3DS method URL");
        description.add("5121073611487018");description.add("3ds2");description.add("Mastercard,No associated 3DS method URL");
        description.add("340282533032846");description.add("3ds2");description.add("Amex,No associated 3DS method URL");
        description.add("36747880216043");description.add("3ds2");description.add("DCI,No associated 3DS method URL");
        description.add("3528982710432481");description.add("3ds2");description.add("JCB,No associated 3DS method URL");
        description.add("4319863787850170");description.add("3ds2");description.add("CB,No associated 3DS method URL");
        description.add("5177328035476275");description.add("3ds2");description.add("CB,No associated 3DS method URL");
        description.add("4242424242424242");description.add("3ds2");description.add("Visa,Authentication successful");
        description.add("5385308360135181");description.add("3ds2");description.add("Mastercard,Authentication successful");
        description.add("4152868552773614");description.add("3ds2");description.add("Visa,Authentication attempted");
        description.add("5518832400606463");description.add("3ds2");description.add("Mastercard,Authentication attempted");
        description.add("4870527017700692");description.add("3ds2");description.add("Visa,Authentication rejected");
        description.add("5484482393204262");description.add("3ds2");description.add("Mastercard,Authentication rejected");
        description.add("4243754271700719");description.add("3ds2");description.add("Visa,Not authenticated");
        description.add("5258901507741160");description.add("3ds2");description.add("Mastercard,Not authenticated");
        description.add("4447336775378848");description.add("3ds2");description.add("Visa,Authentication could not be performed");
        description.add("5569757734785691");description.add("3ds2");description.add("Mastercard,Authentication could not be performed");
        description.add("4539929207120660");description.add("3ds2");description.add("Visa,Error message during scheme communication");
        description.add("5572408422189334");description.add("3ds2");description.add("Mastercard,Error message during scheme communication");
        description.add("4485597929486000");description.add("3ds2");description.add("Visa,No associated 3DS method URL");
        description.add("5259410220714099");description.add("3ds2");description.add("Mastercard,No associated 3DS method URL");
        description.add("372310461284948");description.add("3ds2");description.add("Amex,No associated 3DS method URL");
        description.add("36138956596288");description.add("3ds2");description.add("DCI,No associated 3DS method URL");
        description.add("3528682570029332");description.add("3ds2");description.add("JCB,No associated 3DS method URL");
        description.add("4309485283564188");description.add("3ds2");description.add("CB,No associated 3DS method URL");
        description.add("5566944761698186");description.add("3ds2");description.add("CB,No associated 3DS method URL");
        description.add("4929640381570541");description.add("3ds1");description.add("Visa,Not authenticated");
        description.add("5507979147594255");description.add("3ds1");description.add("Mastercard,Not authenticated");
        description.add("4024007177756441");description.add("3ds1");description.add("Visa,Authentication attempted");
        description.add("5407929162375891");description.add("3ds1");description.add("Mastercard,Authentication attempted");
        description.add("4916734820332269");description.add("3ds1");description.add("Visa,Authentication unavailable");
        description.add("5227027824683493");description.add("3ds1");description.add("Mastercard,Authentication unavailable");
        description.add("4539628347117863");description.add("3ds1");description.add("Visa,Card not eligible");
        description.add("5324440216201760");description.add("3ds1");description.add("Mastercard,Card not eligible");
        description.add("4929640381570541");description.add("3ds1");description.add("Visa,Not authenticated,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("5507979147594255");description.add("3ds1");description.add("Mastercard,Not authenticated,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("4024007177756441");description.add("3ds1");description.add("Visa,Authentication attempted,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("5407929162375891");description.add("3ds1");description.add("Mastercard,Authentication attempted,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("4916734820332269");description.add("3ds1");description.add("Visa,Authentication unavailable,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("5227027824683493");description.add("3ds1");description.add("Mastercard,Authentication unavailable,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("4539628347117863");description.add("3ds1");description.add("Visa,Card not eligible,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");
        description.add("5324440216201760");description.add("3ds1");description.add("Mastercard,Card not eligible,To simulate a fallback from 3DS2 to 3DS1, set the amount to 123321");

        return description;
    }

}