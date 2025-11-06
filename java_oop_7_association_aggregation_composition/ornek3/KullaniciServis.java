package java_oop_7_association_aggregation_composition.ornek3;

public class KullaniciServis {
    private KullaniciDeposu kullaniciDeposu; //aggregation

    public KullaniciServis(KullaniciDeposu kullaniciDeposu) {
        this.kullaniciDeposu = kullaniciDeposu;
    }
}
