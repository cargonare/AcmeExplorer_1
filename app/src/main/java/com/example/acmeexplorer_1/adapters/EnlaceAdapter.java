package com.example.acmeexplorer_1.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.acmeexplorer_1.Enlace;
import com.example.acmeexplorer_1.R;

import java.util.List;

public class EnlaceAdapter extends BaseAdapter {

    List<Enlace> enlaces;
    Context context;

    public EnlaceAdapter(List<Enlace> enlaces, Context context) {
        this.enlaces = enlaces;
        this.context = context;
    }

    @Override
    public int getCount() {
        return enlaces.size();
    }

    @Override
    public Object getItem(int i) {
        return enlaces.size();
    }

    @Override
    public long getItemId(int i) {
        return enlaces.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Enlace enlace=enlaces.get(i);

        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.enlace_item,viewGroup,false);
        }

        CardView cardView=view.findViewById(R.id.cardView);
        TextView textView=view.findViewById(R.id.textView);
        ImageView imageView=view.findViewById(R.id.imageView2);
        textView.setText(enlace.getDescripcion());
        imageView.setImageResource(enlace.getRecursoImageView());
        cardView.setOnClickListener(view1 -> context.startActivity(new Intent(context,enlace.getClase())));

        return view;
    }
}
