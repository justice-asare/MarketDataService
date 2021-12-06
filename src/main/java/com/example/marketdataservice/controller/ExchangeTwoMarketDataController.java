package com.example.marketdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RequestMapping("/api/exchange")
@RestController
public class ExchangeTwoMarketDataController {

    private static final String url = "https://exchange2.matraining.com";
//    private static final String apiKey = "a73c4995-724c-4f87-8b99-c3615a17e0d5";


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/md2")
    public String getAllMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/aapl")
    public String getAppleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/aapl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/msft")
    public String getMicrosoftMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/msft", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/googl")
    public String getGoogleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/googl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/ibm")
    public String getIbmMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/ibm", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/tsla")
    public String getTelsaMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/tsla", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/orcl")
    public String getOracleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/orcl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md2/amzn")
    public String getAmazonMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/amzn", HttpMethod.GET, entity, String.class).getBody();
    }


}
