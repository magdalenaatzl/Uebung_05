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
    public void klimaanlageAn(){
        if (getKlimaanlage()==true){
            System.out.println("Klima läuft bereits");
        }
        else {
            setKlimaanlage(true);
        }
    }

    public boolean getKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}
