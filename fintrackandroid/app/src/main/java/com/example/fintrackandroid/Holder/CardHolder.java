package com.example.fintrackandroid.Holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fintrackandroid.R;

public class CardHolder extends RecyclerView.ViewHolder {

    private RelativeLayout rlcard;
    private TextView tvcardname, tvcardnumber, tvammount;


    public CardHolder(@NonNull View itemView) {
        super(itemView);


        rlcard = itemView.findViewById(R.id.rlcard);
        tvcardname = itemView.findViewById(R.id.tvcardname);
        tvcardnumber = itemView.findViewById(R.id.tvcardnumber);
        tvammount = itemView.findViewById(R.id.tvammount);

    }

    public RelativeLayout getRlcard() {
        return rlcard;
    }

    public TextView getTvcardname() {
        return tvcardname;
    }

    public TextView getTvcardnumber() {
        return tvcardnumber;
    }

    public TextView getTvammount() {
        return tvammount;
    }

    public void setRlcard(RelativeLayout rlcard) {
        this.rlcard = rlcard;
    }

    public void setTvcardname(TextView tvcardname) {
        this.tvcardname = tvcardname;
    }

    public void setTvcardnumber(TextView tvcardnumber) {
        this.tvcardnumber = tvcardnumber;
    }

    public void setTvammount(TextView tvammount) {
        this.tvammount = tvammount;
    }
}
