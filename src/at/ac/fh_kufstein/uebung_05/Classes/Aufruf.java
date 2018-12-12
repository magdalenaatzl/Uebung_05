package at.ac.fh_kufstein.uebung_05.Classes;

public class Aufruf {

    public static void main(String[] args) {

        Auto bmw = new Auto ((short)4, "silber", (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, "schwarz", (short)180, (short)5, (short)8);
        Wasserfahrzeug titanic = new Wasserfahrzeug((short)0, "blau", (short)51000, (short)0, 10.54, (short)3, (short)100000);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);

    }
}
