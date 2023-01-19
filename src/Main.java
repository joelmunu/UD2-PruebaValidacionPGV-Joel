import com.calculadoramedias.threads.SumaNotas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int TOTAL_CALIFICATIONS = 100000;

        List<Integer> califications = new ArrayList<>();

        for (int i = 0; i < TOTAL_CALIFICATIONS; i++) {
            int randomCalification = (int) (Math.random() * 10);
            califications.add(randomCalification);
        }

        SumaNotas hilo1 = new SumaNotas(1, 0, 9999, califications);
        SumaNotas hilo2 = new SumaNotas(2, 10000, 19999, califications);
        SumaNotas hilo3 = new SumaNotas(3, 20000, 29999, califications);
        SumaNotas hilo4 = new SumaNotas(4, 30000, 39999, califications);
        SumaNotas hilo5 = new SumaNotas(5, 40000, 49999, califications);
        SumaNotas hilo6 = new SumaNotas(6, 50000, 59999, califications);
        SumaNotas hilo7 = new SumaNotas(7, 60000, 69999, califications);
        SumaNotas hilo8 = new SumaNotas(8, 70000, 79999, califications);
        SumaNotas hilo9 = new SumaNotas(9, 80000, 89999, califications);
        SumaNotas hilo10 = new SumaNotas(10, 90000, 99999, califications);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
        hilo7.join();
        hilo8.join();
        hilo9.join();
        hilo10.join();

        System.out.println("El hilo " + hilo1.getNumeroHilo() + " que empezó en el índice " + hilo1.getIndiceInicial() +
                " y ha contado " + hilo1.getNotasSumadas() + ", ha sumado un total de: " + hilo1.getSumaNotas());

        System.out.println("El hilo " + hilo2.getNumeroHilo() + " que empezó en el índice " + hilo2.getIndiceInicial() +
                " y ha contado " + hilo2.getNotasSumadas() + ", ha sumado un total de: " + hilo2.getSumaNotas());

        System.out.println("El hilo " + hilo3.getNumeroHilo() + " que empezó en el índice " + hilo3.getIndiceInicial() +
                " y ha contado " + hilo3.getNotasSumadas() + ", ha sumado un total de: " + hilo3.getSumaNotas());

        System.out.println("El hilo " + hilo4.getNumeroHilo() + " que empezó en el índice " + hilo4.getIndiceInicial() +
                " y ha contado " + hilo4.getNotasSumadas() + ", ha sumado un total de: " + hilo4.getSumaNotas());

        System.out.println("El hilo " + hilo5.getNumeroHilo() + " que empezó en el índice " + hilo5.getIndiceInicial() +
                " y ha contado " + hilo5.getNotasSumadas() + ", ha sumado un total de: " + hilo5.getSumaNotas());

        System.out.println("El hilo " + hilo6.getNumeroHilo() + " que empezó en el índice " + hilo6.getIndiceInicial() +
                " y ha contado " + hilo6.getNotasSumadas() + ", ha sumado un total de: " + hilo6.getSumaNotas());

        System.out.println("El hilo " + hilo7.getNumeroHilo() + " que empezó en el índice " + hilo7.getIndiceInicial() +
                " y ha contado " + hilo7.getNotasSumadas() + ", ha sumado un total de: " + hilo7.getSumaNotas());

        System.out.println("El hilo " + hilo8.getNumeroHilo() + " que empezó en el índice " + hilo8.getIndiceInicial() +
                " y ha contado " + hilo8.getNotasSumadas() + ", ha sumado un total de: " + hilo8.getSumaNotas());

        System.out.println("El hilo " + hilo9.getNumeroHilo() + " que empezó en el índice " + hilo9.getIndiceInicial() +
                " y ha contado " + hilo9.getNotasSumadas() + ", ha sumado un total de: " + hilo9.getSumaNotas());

        System.out.println("El hilo " + hilo10.getNumeroHilo() + " que empezó en el índice " + hilo10.getIndiceInicial() +
                " y ha contado " + hilo10.getNotasSumadas() + ", ha sumado un total de: " + hilo10.getSumaNotas());

        float sumaTotalNotas = 0;

        sumaTotalNotas += hilo1.getSumaNotas();
        sumaTotalNotas += hilo2.getSumaNotas();
        sumaTotalNotas += hilo3.getSumaNotas();
        sumaTotalNotas += hilo4.getSumaNotas();
        sumaTotalNotas += hilo5.getSumaNotas();
        sumaTotalNotas += hilo6.getSumaNotas();
        sumaTotalNotas += hilo7.getSumaNotas();
        sumaTotalNotas += hilo8.getSumaNotas();
        sumaTotalNotas += hilo9.getSumaNotas();
        sumaTotalNotas += hilo10.getSumaNotas();

        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formatoDecimales = new DecimalFormat("#.00", separadoresPersonalizados);

        float media = sumaTotalNotas / 100000;
        System.out.println("La media aritmética es de " + formatoDecimales.format(media));
    }
}