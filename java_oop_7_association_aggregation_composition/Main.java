package java_oop_7_association_aggregation_composition;

import java_oop_7_association_aggregation_composition.ornek1.*;
import java_oop_7_association_aggregation_composition.ornek2.*;
import java_oop_7_association_aggregation_composition.ornek3.*;
import java_oop_7_association_aggregation_composition.ornek4.*;
import java_oop_7_association_aggregation_composition.ornek5.*;

public class Main {

    public static void main(String[] args) {
        //Örnek 1
        CatidakiOptikSensor cos = new CatidakiOptikSensor();
        Duvar sagDuvar = new Duvar();
        AkilliPencere akilliPencere = new AkilliPencere(cos, sagDuvar);

        //Örnek 2
        Modem modem = new Modem();
        Monitor monitor = new Monitor();
        int cekirdekSayisi = 4;
        Bilgisayar bilgisayar = new Bilgisayar(monitor, modem, cekirdekSayisi);
        bilgisayar = null;

        //Örnek 3
        TokenServis tokenServis = new TokenServis();
        Kullanici[] kullanicilar = new Kullanici[100];
        KullaniciDeposu kullaniciDeposu = new KullaniciDeposu(kullanicilar);
        KullaniciServis kullaniciServis = new KullaniciServis(kullaniciDeposu);
        KullaniciDogrulamaServis kds = new KullaniciDogrulamaServis(tokenServis, kullaniciServis);
        //Örnek 4
        Oyuncu[] oyuncular = new Oyuncu[2];
        Arena arena = new Arena(oyuncular);

        //Örnek 5
        File file = new File();
        Button[] butonlar = new Button[5];
        IDE ide = new IDE(file, butonlar);
    }

}
