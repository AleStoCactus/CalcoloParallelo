public class Operazione5 extends Thread{
    Buffer dati;

    private double x;
    private double t;
    public Operazione5(Buffer d) {
        this.dati = d;
        this.x = dati.y;
        this.t = dati.z;
    }
    @Override
    public void run() {
        dati.k = x+t;
        System.out.println(" Ho calcolato k = " + dati.k);
    }
}
