package com.example.quotes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteService {
    //method to call API endpoint which is jokes with category 'dev'
    @GET("/jokes/random?category=dev")
    Call<Quotes> getQuote();

}