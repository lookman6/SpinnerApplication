package com.example.myapplication4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cls_Fruit_Adapter extends BaseAdapter {


    private Context context;
    private ArrayList<Fruit> TabFruit = new ArrayList<Fruit>();

    public Cls_Fruit_Adapter(Context context, ArrayList<Fruit> Tab){
        this.TabFruit = Tab;
        this.context=context;
    }

    @Override
    public int getCount() {
        return TabFruit.size();
    }

    @Override
    public Object getItem(int position) {
        return TabFruit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = LayoutInflater.from(context);//.getLayoutInflater();
        View v = li.inflate(R.layout.customrow,null);// au lieu de null on
// peut utiliser (ViewGroup)findViewById(R.id.lineargoup)

        TextView txtNom = (TextView) v.findViewById(R.id.txtNom);
        TextView txtDesc = (TextView) v.findViewById(R.id.txtDesc);
        ImageView imgIcone = (ImageView) v.findViewById(R.id.imgIcone);
        txtNom.setText(TabFruit.get(position).Nom());
        txtDesc.setText(TabFruit.get(position).Description());

        int resId = context.getResources().getIdentifier(TabFruit.get(position).NomIcon(),"drawable",context.getPackageName());
        imgIcone.setImageResource(resId);


        return v;

    }


}
