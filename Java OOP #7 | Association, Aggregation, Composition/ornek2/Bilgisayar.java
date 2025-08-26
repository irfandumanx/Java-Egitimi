package ornek2;

public class Bilgisayar {
    private Modem modem; //association
    private Monitor monitor; //aggregation
    private Islemci islemci; //composition

    public Bilgisayar(Monitor monitor, Modem modem, int cekirdekSayisi) {
        this.monitor = monitor;
        this.modem = modem;
        this.islemci = new Islemci(cekirdekSayisi);
    }
}
