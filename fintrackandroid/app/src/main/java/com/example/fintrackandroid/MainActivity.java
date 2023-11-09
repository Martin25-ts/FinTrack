package com.example.fintrackandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fintrackandroid.Adapter.CardAdaptor;
import com.example.fintrackandroid.Model.Card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // List of card
        List<Card> listcard = new ArrayList<Card>();
        listcard.add( new Card("1", "Mandiri", "qwerty123", "250267890263726","'36000" ,"card1", new Date(), new Date()));
        listcard.add( new Card("2", "BCA", "qwerty123", "12914378977383", "9000000","card2", new Date(), new Date()));
        listcard.add( new Card("3", "Linkaja", "qwerty123", "082246078543", "8000000000","card3", new Date(), new Date()));


        rvcard = findViewById(R.id.rvcard);
        rvcard.setHasFixedSize(true);
        rvcard.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,
                false));

        CardAdaptor cardadaptor = new CardAdaptor(listcard);


        rvcard.setAdapter(cardadaptor);


    }
}