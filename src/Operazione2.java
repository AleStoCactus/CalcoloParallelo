public class Operazione2 extends Thread {
    Buffer dati;
    private double b;
    public Operazione2(Buffer buffer) {
        this.dati = buffer;
        this.b = dati.b;
    }

    public void run() {
        dati.y = 2*(b-2);
        System.out.println(" Ho calcolato y = " + dati.y);
    }
}
