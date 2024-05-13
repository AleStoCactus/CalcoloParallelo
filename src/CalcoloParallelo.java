public class CalcoloParallelo {
    public static void main(String[] args) {
        System.out.println("Deco calcolare:" + " 3*(a-1) + 2*(b-2) + 3*(c-3) ");
        double a,b,c;
        a = 2;
        b = 3;
        c = 4;
        Buffer parziali = new Buffer(a,b,c);
        Operazione1 thr1 = new Operazione1();

    }
}