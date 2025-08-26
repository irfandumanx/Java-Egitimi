import ornek1.AkilliPencere;
import ornek1.CatidakiOptikSensor;
import ornek1.Duvar;
import ornek2.Bilgisayar;
import ornek2.Modem;
import ornek2.Monitor;
import ornek3.*;
import ornek4.Arena;
import ornek4.Oyuncu;
import ornek5.Button;
import ornek5.File;
import ornek5.IDE;

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
