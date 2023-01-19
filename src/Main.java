import com.serviciodesayuno.resources.Mesa;
import com.serviciodesayuno.threads.Comensal;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int numeroMagdalenas = 15;

        Mesa mesa = new Mesa(numeroMagdalenas);

        Thread comensal1 = new Thread(new Comensal("Joel", mesa));
        Thread comensal2 = new Thread(new Comensal("Alberto", mesa));
        Thread comensal3 = new Thread(new Comensal("Dani", mesa));

        comensal1.setPriority(Thread.MAX_PRIORITY);
        comensal2.setPriority(Thread.MIN_PRIORITY);
        comensal3.setPriority(Thread.NORM_PRIORITY);

        comensal1.start();
        comensal2.start();
        comensal3.start();
    }
}