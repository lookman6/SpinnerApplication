package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtAddNom, edtAddDescription;
    private ListView lstFruit;
    private ArrayList<Fruit> arrayFruits;
    private Cls_Fruit_Adapter C_Fruit;
    private Button but;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAddNom = (EditText) findViewById(R.id.txtnom);
        edtAddDescription = (EditText) findViewById(R.id.txtdesc);
        ListView lstFruit = (ListView) findViewById(R.id.lstfruits);


        but = (Button) findViewById(R.id.button);
        arrayFruits=new ArrayList<>();
        arrayFruits.add(new Fruit("banane","Best Fruit","banane"));

        C_Fruit = new Cls_Fruit_Adapter(this,arrayFruits);
        lstFruit.setAdapter(C_Fruit);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fruit fr = new Fruit(edtAddNom.getText().toString(),edtAddDescription.getText().toString(), edtAddNom.getText().toString());
                arrayFruits.add(fr);
                C_Fruit.notifyDataSetChanged();// Permet de rafraichir la ListView avec
// le nouveau contenu de BaseAdapter
            }
        });


    }
}