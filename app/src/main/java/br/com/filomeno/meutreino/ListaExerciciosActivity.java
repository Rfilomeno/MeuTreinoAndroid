package br.com.filomeno.meutreino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListaExerciciosActivity extends AppCompatActivity {

    public ArrayList<Exercicio> ListaExercicios = new ArrayList<Exercicio>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_exercicios);


        Intent it = getIntent();
        ListaExercicios = (ArrayList<Exercicio>) it.getSerializableExtra("Treino");


    }




}
