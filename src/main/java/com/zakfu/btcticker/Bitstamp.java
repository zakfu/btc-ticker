package com.zakfu.btcticker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;

public class Bitstamp {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final String quoteUrl = "https://www.bitstamp.net/api/ticker/";

    public static Quote getQuote() {
        Quote quote = new Quote();
        try {
            quote = mapper.readValue(new URL(quoteUrl), Quote.class);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return quote;
    }
}
