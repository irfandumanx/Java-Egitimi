package ornek3;

public class KullaniciServis {
    private KullaniciDeposu kullaniciDeposu; //aggregation

    public KullaniciServis(KullaniciDeposu kullaniciDeposu) {
        this.kullaniciDeposu = kullaniciDeposu;
    }
}
