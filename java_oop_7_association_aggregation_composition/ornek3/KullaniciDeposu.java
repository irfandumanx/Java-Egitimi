package java_oop_7_association_aggregation_composition.ornek3;

public class KullaniciDeposu {

    private Kullanici[] kullanici; //aggregation

    public KullaniciDeposu(Kullanici[] kullanici) {
        this.kullanici = kullanici;
    }
}
