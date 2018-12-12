package at.ac.fh_kufstein.uebung_05.Classes;

public class Fahrzeug {
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    //Konstruktor

    public Fahrzeug(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit) {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
    }

    //Methoden

    public void starten (){
        setGestartet(true);
    }

    public void stoppen () {
        setGestartet(false);
    }

    public void beschleunigen (short speed){
        if (getGestartet()==true && getGeschwindigkeit() <= 250){
        setGeschwindigkeit((short) (getGeschwindigkeit()+speed));}
        else {System.err.println("Fehler");}
    }
    public void bremsen(short speed){
        if (getGestartet()==true && getGeschwindigkeit() >0){
            setGeschwindigkeit((short) (getGeschwindigkeit()-speed));
        }
    }

    //Getter und Setter

    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean getGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
}
