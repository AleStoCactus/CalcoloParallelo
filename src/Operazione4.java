public class Operazione4 extends Thread{
    Buffer dati;
    private double y;
    private double z;
    public Operazione4(Buffer d) {
        this.dati = d;
        this.y = dati.y;
        this.z = dati.z;
    }
    @Override
    public void run() {
        dati.t = y*z;
        System.out.println(" Ho calcolato t = " + dati.t);
    }
}
