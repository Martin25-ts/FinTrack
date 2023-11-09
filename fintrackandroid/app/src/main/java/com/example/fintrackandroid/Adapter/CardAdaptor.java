package com.example.fintrackandroid.Adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fintrackandroid.Holder.CardHolder;
import com.example.fintrackandroid.Model.Card;
import com.example.fintrackandroid.R;

import java.util.List;

public class CardAdaptor extends RecyclerView.Adapter<CardHolder> {

    List<Card> cardlist;

    public CardAdaptor(List<Card> cardlist) {
        this.cardlist = cardlist;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position){

        if(cardlist.get(position).getType().equals("card1")){
            holder.getRlcard().setBackgroundResource(R.drawable.card1);
        }else if(cardlist.get(position).getType().equals("card2")){
            holder.getRlcard().setBackgroundResource(R.drawable.card2);
        }else if(cardlist.get(position).getType().equals("card3")){
            holder.getRlcard().setBackgroundResource(R.drawable.card3);
            holder.getTvcardnumber().setWidth(220);
        }
        holder.getTvcardname().setText(String.valueOf(cardlist.get(position).getName()));
        holder.getTvcardnumber().setText(String.valueOf(cardlist.get(position).getNumber()));
        holder.getTvammount().setText(String.valueOf(cardlist.get(position).getAmmount()));
    }

    @Override
    public int getItemCount() {


        return cardlist.size();
    }
}
