public class Operazione3 extends Thread {
    Buffer dati;
    private double c;
    public Operazione3(Buffer buffer) {
        this.dati = buffer;
        this.c = dati.c;
    }

    public void run() {
        dati.z = 3*(c-3);
        System.out.println(" Ho calcolato z = " + dati.z);
    }
}
