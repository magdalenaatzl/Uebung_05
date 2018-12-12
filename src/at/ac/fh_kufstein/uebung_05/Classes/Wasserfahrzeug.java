package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug extends Fahrzeug{
    private double tiefgang;
    private short schrauben;
    private double ladung;

    //Konstruktur

    public Wasserfahrzeug(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit, double tiefgang, short schrauben, double ladung) {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
        this.tiefgang=tiefgang;
        this.schrauben=schrauben;
        this.ladung=ladung;
    }

    public void entladen() throws InterruptedException {
        setLadung(0);
        Thread.sleep(5000);
    }

    //Getter und setter
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
}
