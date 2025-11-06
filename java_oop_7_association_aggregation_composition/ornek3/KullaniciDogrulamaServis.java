package java_oop_7_association_aggregation_composition.ornek3;

public class KullaniciDogrulamaServis {
    //Yazılım geliştirmede "servis" terimi genellikle belirli bir işlevi veya hizmeti sağlayan bileşeni ifade eder.
    private TokenServis tokenServis; //association
    private KullaniciServis kullaniciServis; //association
    private ServisCalismaSuresi servisCalismaSuresi; //composition

    public KullaniciDogrulamaServis(TokenServis tokenServis, KullaniciServis kullaniciServis) {
        this.tokenServis = tokenServis;
        this.kullaniciServis = kullaniciServis;
        this.servisCalismaSuresi = new ServisCalismaSuresi("kullanici dogrulama", 0);
    }

    public boolean dogrula() {
        //http header ile gelen tokene bak
        //header var ise tokenservisi kullanarak çözümle
        //elde edilen id ile kullanıcıyı kullaniciservisden, aggregationla bağlı olduğu kullanicideposunu kullanarak al.
        //kullanıcı banlanmadıysa vs vs true diğer türlü false döndür
        return true;
    }
}
