package com.tokens.cko.service;

import com.tokens.cko.model.*;
import com.tokens.cko.repository.CardRepository;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CardTokenizationService {

    public TokenizationCKOResponse getTokenDetails(String id) {
        return tokenize(getTokenizationRequest(CardRepository.getCardMap().get(id)));
    }

    private TokenizationRequest getTokenizationRequest(CardData cardData) {
        TokenizationRequest request = new TokenizationRequest();
        request.setNumber(cardData.getCard_number());
        request.setExpiry_month(cardData.getExpiry_month());
        request.setExpiry_year(cardData.getExpiry_year());
        request.setCvv(cardData.getCvv());
        return request;
    }

    public TokenizationCKOResponse tokenize(TokenizationRequest request) {
        TokenizationCKORequest ckoRequest = getTokenizationCKORequest(request);
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization","Bearer pk_sbox_mdloazfuguww7p6dlh7imidfry*");
        HttpEntity<TokenizationCKORequest> reqEntity = new HttpEntity<>(ckoRequest,headers);
        TokenizationResponse response = template.exchange("https://api.sandbox.checkout.com/tokens",
                HttpMethod.POST,
                reqEntity,
                TokenizationResponse.class
        ).getBody();
        response.setCard_number(ckoRequest.getNumber());
        return getTokenizationCKOResponse(response);
    }

    private TokenizationCKOResponse getTokenizationCKOResponse(TokenizationResponse response) {
        TokenizationCKOResponse ckoResponse = new TokenizationCKOResponse();

        ckoResponse.setCard_number(response.getCard_number());
        ckoResponse.setBilling_address(response.getBilling_address() != null ? response.getBilling_address().toString() : "");
        ckoResponse.setCard_category(response.getCard_category());
        ckoResponse.setType(response.getType());
        ckoResponse.setToken(response.getToken());
        ckoResponse.setExpires_on(response.getExpires_on());
        ckoResponse.setExpiry_month(response.getExpiry_month());
        ckoResponse.setExpiry_year(response.getExpiry_year());
        ckoResponse.setScheme(response.getScheme());
        ckoResponse.setLast4(response.getLast4());
        ckoResponse.setBin(response.getBin());
        ckoResponse.setCard_type(response.getCard_type());
        ckoResponse.setIssuer(response.getIssuer());
        ckoResponse.setIssuer_country(response.getIssuer_country());
        ckoResponse.setProduct_id(response.getProduct_id());
        ckoResponse.setProduct_type(response.getProduct_type());
        ckoResponse.setPhone(response.getPhone() != null ? response.getPhone().toString() : "");
        ckoResponse.setName(response.getName());

        return ckoResponse;
    }

    private TokenizationCKORequest getTokenizationCKORequest(TokenizationRequest request) {
        TokenizationCKORequest ckoRequest = new TokenizationCKORequest();
        BillingAddress address = new BillingAddress();
        Phone phone = new Phone();
        ckoRequest.setBilling_address(address);
        ckoRequest.setPhone(phone);

        ckoRequest.setNumber(request.getNumber());
        ckoRequest.setExpiry_month(
                request.getExpiry_month() != null && !request.getExpiry_month().isEmpty()
                        ? Integer.parseInt(request.getExpiry_month())
                        : 6
        );
        ckoRequest.setExpiry_year(
                request.getExpiry_year() != null && !request.getExpiry_year().isEmpty()
                        ? Integer.parseInt(request.getExpiry_year())
                        : 2030
        );
        ckoRequest.setCvv(
                request.getCvv() != null && !request.getCvv().isEmpty()
                        ? request.getCvv()
                        : "956"
        );
        ckoRequest.setName(
                request.getName() != null && !request.getName().isEmpty()
                        ? request.getName()
                        : "Satyam Kumar"
        );
        ckoRequest.getBilling_address().setAddress_line1(
                request.getAddress() != null && request.getAddress().getAddress_line1() != null && !request.getAddress().getAddress_line1().isEmpty()
                        ? request.getAddress().getAddress_line1()
                        : "70"
        );
        ckoRequest.getBilling_address().setAddress_line2(
                request.getAddress() != null && request.getAddress().getAddress_line2() != null && !request.getAddress().getAddress_line2().isEmpty()
                        ? request.getAddress().getAddress_line2()
                        : "Oranienburger"
        );
        ckoRequest.getBilling_address().setCity(
                request.getAddress() != null && request.getAddress().getCity() != null && !request.getAddress().getCity().isEmpty()
                        ? request.getAddress().getCity()
                        : "Berlin"
        );
        ckoRequest.getBilling_address().setState(
                request.getAddress() != null && request.getAddress().getState() != null && !request.getAddress().getState().isEmpty()
                        ? request.getAddress().getState()
                        : "Berlin"
        );
        ckoRequest.getBilling_address().setZip(
                request.getAddress() != null && request.getAddress().getZip() != null && !request.getAddress().getZip().isEmpty()
                        ? request.getAddress().getZip()
                        : "10117"
        );
        ckoRequest.getBilling_address().setCountry(
                request.getAddress() != null && request.getAddress().getCountry() != null && !request.getAddress().getCountry().isEmpty()
                        ? request.getAddress().getCountry()
                        : "DE"
        );
        ckoRequest.getPhone().setCountry_code(
                request.getPhone() != null && request.getPhone().getCountry_code() != null && !request.getPhone().getCountry_code().isEmpty()
                        ? request.getPhone().getCountry_code()
                        : "+49"
        );
        ckoRequest.getPhone().setNumber(
                request.getPhone() != null && request.getPhone().getNumber() != null && !request.getPhone().getNumber().isEmpty()
                        ? request.getPhone().getNumber()
                        : "1634339174"
        );
        return ckoRequest;
    }
}
