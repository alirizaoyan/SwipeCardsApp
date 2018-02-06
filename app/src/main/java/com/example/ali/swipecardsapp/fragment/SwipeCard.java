package com.example.ali.swipecardsapp.fragment;

import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.ali.swipecardsapp.R;
import com.example.ali.swipecardsapp.adapter.CardAdapter;
import com.example.ali.swipecardsapp.model.Model;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ali on 31.1.2018.
 */

public class SwipeCard extends Fragment implements View.OnClickListener{
    private SwipeCardsView swipeCardsView;
    private List<Model> modelList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.swipe_card,container,false);

        ImageButton begenButonu =(ImageButton) v.findViewById(R.id.begen);
        ImageButton cancelButonu = (ImageButton) v.findViewById(R.id.cancel);
        cancelButonu.setOnClickListener(this);
        begenButonu.setOnClickListener(this);
        swipeCardsView = (SwipeCardsView) v.findViewById(R.id.swipeCardsView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);
        getData();

        return v;
    }
    private void getData() {
        modelList.add(new Model("Kedi","https://i.ytimg.com/vi/4HGRIFivKQo/maxresdefault.jpg"));
        modelList.add(new Model("Köpek","https://www.petzimo.com/class/INNOVAEditor/assets/blog/kopek-tasmasi-secimi.jpg"));
        modelList.add(new Model("Balık","http://www.ortodokslartoplulugu.org/wp-content/uploads/2016/11/BalikM.jpg"));

        CardAdapter cardAdapter = new CardAdapter(modelList,getActivity());
        swipeCardsView.setAdapter(cardAdapter);
    }

    public void doRightOut() {
        swipeCardsView.slideCardOut(SwipeCardsView.SlideType.RIGHT);
    }
    public void doLeftOut() {
        swipeCardsView.slideCardOut(SwipeCardsView.SlideType.LEFT);
    }

    @Override
    public void onClick(View view) {
        int id= view.getId();
        if(id == R.id.begen){
            doRightOut();
        }
        if(id == R.id.cancel){
            doLeftOut();
        }
    }
}
