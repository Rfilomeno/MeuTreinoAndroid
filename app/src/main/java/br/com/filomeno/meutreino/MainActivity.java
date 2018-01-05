package br.com.filomeno.meutreino;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Exercicio> ListaExercicios = new ArrayList<Exercicio>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void TreinoA(View v){

        Exercicio e1 = new Exercicio("Corrida", "Esteira", "15 min", "-", "6 / 9", "-", R.drawable.esteira);
        Exercicio e2 = new Exercicio("Supino", "20", "3", "10", "30Kg", "6",R.drawable.supinomaquina);
        Exercicio e3 = new Exercicio("Fly/Peck Deck", "25", "3", "10", "20Kg", "6",R.drawable.flypeckdeck);
        Exercicio e4 = new Exercicio("Mesa Flexora", "10", "3", "10", "25Kg", "1/3",R.drawable.mesaflexora);
        Exercicio e5 = new Exercicio("Tríceps Polia", "62", "3", "10", "10Kg", "-",R.drawable.tricepspolia);
        Exercicio e6 = new Exercicio("Cadeira Abdutora", "4", "3", "10", "40Kg", "2",R.drawable.cadeiraabdutora);
        Exercicio e7 = new Exercicio("Desenvolvimento Maq.", "50", "3", "10", "10Kg", "7",R.drawable.desenvolvimentomaquina);
        Exercicio e8 = new Exercicio("Abd. Ponte (DV)", "-", "3", "-", "15 seg", "-",R.drawable.abdponte);
        ListaExercicios.add(e1);
        ListaExercicios.add(e2);
        ListaExercicios.add(e3);
        ListaExercicios.add(e4);
        ListaExercicios.add(e5);
        ListaExercicios.add(e6);
        ListaExercicios.add(e7);
        ListaExercicios.add(e8);

        Intent i = new Intent(MainActivity.this, ListaExerciciosActivity.class);
        i.putExtra("Treino", ListaExercicios);
        startActivity(i);

    }

    public void TreinoB(View v){

        Exercicio e1 = new Exercicio("Corrida", "Esteira", "15 min", "-", "6 / 9", "-", R.drawable.esteira);
        Exercicio e2 = new Exercicio("Puxada Maq.", "32", "3", "10", "30Kg", "6", R.drawable.puxadamaquina);
        Exercicio e3 = new Exercicio("Remada Maq.", "30", "3", "10", "25Kg", "6/7", R.drawable.remadamaquina);
        Exercicio e4 = new Exercicio("Cadeira Extensora", "2", "3", "10", "30Kg", "4/2/4", R.drawable.cadeiraextensora);
        Exercicio e5 = new Exercicio("Rosca Direta", "62", "3", "10", "10Kg", "-", R.drawable.roscadireta);
        Exercicio e6 = new Exercicio("Cadeira Adutora", "5", "3", "10", "40Kg", "5", R.drawable.cadeiraadutora);
        Exercicio e7 = new Exercicio("Remada Alta", "62", "3", "10", "10Kg", "-",R.drawable.remadaalta);
        Exercicio e8 = new Exercicio("Gêmeos Sentado", "7", "3", "10", "30Kg", "6", R.drawable.gemeossentado);
        Exercicio e9 = new Exercicio("Abd. Supra", "-", "3", "15", "-", "-", R.drawable.abdsupra);
        ListaExercicios.add(e1);
        ListaExercicios.add(e2);
        ListaExercicios.add(e3);
        ListaExercicios.add(e4);
        ListaExercicios.add(e5);
        ListaExercicios.add(e6);
        ListaExercicios.add(e7);
        ListaExercicios.add(e8);
        ListaExercicios.add(e9);

        Intent i = new Intent(MainActivity.this, ListaExerciciosActivity.class);
        i.putExtra("Treino", ListaExercicios);
        startActivity(i);

    }
}
