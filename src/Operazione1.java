public class Operazione1 extends Thread {
    Buffer dati;
    private double a;
    public Operazione1(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
    }

    public void run() {
        dati.x = 3*(a-1);
        System.out.println(" Ho calcolato x = " + dati.x);
    }
}
