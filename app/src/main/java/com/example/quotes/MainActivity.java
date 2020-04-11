package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    public TextView text, quote;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //change title of app in the header bar
        setTitle("Chuck Norris Programming Quotes!");

        //define views in the layout
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        quote = findViewById(R.id.quote);

        //on click listener for button to generate a quote
        button.setOnClickListener(v -> {

            //define retrofit service with base url and interface class
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https:/api.chucknorris.io")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            QuoteService service = retrofit.create(QuoteService.class);

            //call and response objects
            Call<Quotes> quoteCall = service.getQuote();

            //enqueue method to resolve NetworkOnMainThreadException (haven't learnt Async tasks yet)

            quoteCall.enqueue(new Callback<Quotes>() {
                @Override
                public void onResponse(Call<Quotes> call, Response<Quotes> response) {
                    //to get only the quote value from json object
                   String quoteString = response.body().getValue();
                   //set quote box in layout to the quote string
                    quote.setText(quoteString);
                }

                @Override
                public void onFailure(Call<Quotes> call, Throwable t) {

                }

            });

        });

    }
}


