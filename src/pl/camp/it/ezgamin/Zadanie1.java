package pl.camp.it.ezgamin;

public class Zadanie1 {
    public static void main(String[] args) {
        int o = 110;
        int a = 100;
        int c =50;

        //wzor(o, a, c);
        //petla(o, a, c);
        rekurencja(o, a, c);
    }

    public static void wzor(int o, int a, int c) {
        int diff = Math.abs(a - o);
        if(diff < c) {
            if(a > o) {
                o = o + diff + c - diff/2;
                c = c - diff;
                a += c/2;
                if(c%2 != 0) {
                    o++;
                }
            } else {
                a = a + diff + c - diff/2;
                c = c - diff;
                o += c/2;
                if(c%2 != 0) {
                    o++;
                }
            }
        } else {
            if(a > o) {
                o += c;
            } else {
                a += c;
            }
        }
        System.out.println("Pomarancze: " + o);
        System.out.println("J: " + a);
        System.out.println("R: " + Math.abs(a - o));
    }

    public static void petla(int o, int a, int c) {
        while (c > 0) {
            if(a > o) {
                o++;
                c--;
            } else {
                a++;
                c--;
            }
        }
        System.out.println("Pomarancze: " + o);
        System.out.println("J: " + a);
        System.out.println("R: " + Math.abs(a - o));
    }

    public static void rekurencja(int o, int a, int c) {
        if(c == 0) {
            System.out.println("Pomarancze: " + o);
            System.out.println("J: " + a);
            System.out.println("R: " + Math.abs(a - o));
        } else if(a > o) {
            rekurencja(++o, a, --c);
        } else {
            rekurencja(o, ++a, --c);
        }
    }
}
