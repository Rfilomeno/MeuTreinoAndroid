package br.com.filomeno.meutreino;

import android.media.Image;

import java.io.Serializable;

/**
 * Created by rodrigofilomeno on 05/01/2018.
 */

public class Exercicio implements Serializable {

    public String Nome;
    public String Maquina;
    public String Series;
    public String Repeticoes;
    public String Carga;
    public String Assento;
    public int Img;

    public Exercicio(String nome, String maquina, String series, String repeticoes, String carga, String assento, int img) {
        Nome = nome;
        Maquina = maquina;
        Series = series;
        Repeticoes = repeticoes;
        Carga = carga;
        Assento = assento;
        Img = img;
    }
}
