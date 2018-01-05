package br.com.filomeno.meutreino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


import java.util.ArrayList;

public class ListaExerciciosActivity extends AppCompatActivity {

    public ArrayList<Exercicio> ListaExercicios;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_exercicios);

        lv = (ListView) findViewById(R.id.exerciciosLV);

        ListaExercicios = new ArrayList<>();
        Intent it = getIntent();
        ListaExercicios = (ArrayList<Exercicio>) it.getSerializableExtra("Treino");




        ListAdapter adapter = new ListAdapter(
                getApplicationContext(), R.layout.custom_list_layout, ListaExercicios
        );

        lv.setAdapter(adapter);




    }




}
