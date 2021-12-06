package com.example.marketdataservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;


@RequestMapping("/api/exchange")
@RestController
public class ExchangeOneMarketDataController {

    private static final String url = "https://exchange.matraining.com";
    private static final String apiKey = "a73c4995-724c-4f87-8b99-c3615a17e0d5";


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/md1")
    public String getAllMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md", HttpMethod.GET, entity, String.class).getBody();
    }


    @RequestMapping(value = "/md1/aapl")
    public String getAppleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/aapl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/msft")
    public String getMicrosoftMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/msft", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/googl")
    public String getGoogleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/googl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/nflx")
    public String getNetflixMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/nflx", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/ibm")
    public String getIbmMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/ibm", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/tsla")
    public String getTelsaMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/tsla", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/orcl")
    public String getOracleMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url+"/md/orcl", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/md1/amzn")
    public String getAmazonMarketDataAPI() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url + "/md/amzn", HttpMethod.GET, entity, String.class).getBody();
    }


}
