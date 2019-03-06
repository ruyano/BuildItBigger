package com.example.jokeslib;

import java.util.ArrayList;
import java.util.Random;

public class Joke {

    private static Joke mInstance;
    private ArrayList<String> jokes;

    public static Joke getInstance() {
        if (mInstance == null)
            mInstance = new Joke();
        return mInstance;
    }

    public String getJoke() {
        if (jokes == null)
            initJokes();
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    private void initJokes() {
        jokes = new ArrayList<>();
        jokes.add(joke1);
        jokes.add(joke2);
        jokes.add(joke3);
        jokes.add(joke4);
        jokes.add(joke5);
        jokes.add(joke6);
        jokes.add(joke7);
        jokes.add(joke8);
        jokes.add(joke9);
        jokes.add(joke10);
        jokes.add(joke11);
        jokes.add(joke12);
        jokes.add(joke13);
        jokes.add(joke14);
        jokes.add(joke15);
    }

    private static final String joke1 = "Por que a aranha é o animal mais carente do mundo?\n\nPorque ela é um aracNEEDYOU.";
    private static final String joke2 = "Por que o pinheiro não se perde na floresta?\n\nPorque ele tem uma pinha (UM MAPINHA).";
    private static final String joke3 = "Sabe como é a piada do pintinho caipira?\n\nPIR.";
    private static final String joke4 = "O que o pagodeiro foi fazer na igreja?\n\nFoi cantar PÁ GOD";
    private static final String joke5 = "A plantinha foi ao hospital, mas não foi atendida. Por quê?\n\nPorque lá só tinha médico de PLANTÃO";
    private static final String joke6 = "Vocẽ conhece a piada do Pônei?\n\nPÔ NEM EU. KKK";
    private static final String joke7 = "Qual é a fórmula da água benta?\n\nH DEUS O.";
    private static final String joke8 = "Qual é o rei dos queijos?\n\nÉ o REIQUEIJÃO";
    private static final String joke9 = "O que o pato falou pra pata?\n\nVEM QUÁ";
    private static final String joke10 = "O que é, o que é: Maconha enrolada em jornal?\n\nBASEADO EM FATOS REAIS.";
    private static final String joke11 = "Por que a velhinha não usa relógio?\n\nPorque ela é SEM HORA(SENHORA).";
    private static final String joke12 = "O que a vaca disse pro boi? TE AMUUUUUU...";
    private static final String joke13 = "Havia dois caminhões voando. Um caiu. Por que o outro continuou voando?\n\nPorque era CAMINHÃO-PIPA";
    private static final String joke14 = "Por que a FORmiga tem quatro patas?\n\nPorque se tivesse cinco se chamaria FIVEmiga";
    private static final String joke15 = "Quando os americanos comeram carne pela primeira vez?\n\nQuando chegou CRISTÓVÃO COM LOMBO.";

}
