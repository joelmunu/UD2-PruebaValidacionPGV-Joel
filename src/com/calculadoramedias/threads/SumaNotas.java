package com.calculadoramedias.threads;

import java.util.List;

public class SumaNotas extends Thread {

    private int numeroHilo;
    private int indiceInicial;
    private int indiceFinal;
    private List<Integer> califications;

    private int sumaNotas;

    private int notasSumadas = 0;

    public SumaNotas(int numeroHilo, int indiceInicial, int indiceFinal, List<Integer> califications) {
        this.numeroHilo = numeroHilo;
        this.indiceInicial = indiceInicial;
        this.indiceFinal = indiceFinal;
        this.califications = califications;
    }

    public int getSumaNotas() {
        return sumaNotas;
    }

    public int getNumeroHilo() {
        return numeroHilo;
    }

    public int getIndiceInicial() {
        return indiceInicial;
    }

    public int getNotasSumadas() {
        return notasSumadas + 1;
    }

    @Override
    public void run() {
        for (int i = indiceInicial; i < indiceFinal; i++) {
            sumaNotas += califications.get(i);
            notasSumadas += 1;
        }
    }
}
