package at.ac.fh_kufstein.uebung_05.Classes;

public class Auto extends Fahrzeug{
    //Attribute
    private boolean klimaanlage;
    private short airbags;

    //Konstruktor
    public Auto(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit, boolean klimaanlage, short airbags) {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
        this.klimaanlage=klimaanlage;
        this.airbags=airbags;
    }

}
