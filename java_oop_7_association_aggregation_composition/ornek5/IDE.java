package java_oop_7_association_aggregation_composition.ornek5;

public class IDE {
    private File file; //IDE Dosyayı kullanır - Association
    private Button[] button; //IDE butonlarla bir bütün oluşturuyor - Aggregation
    private KelimeTutucuBuffer buffer; //IDE ctrl z için kelimeleri bufferda tutar IDE ölürse buffer ölür - Composition
    public IDE(File file, Button[] button) {
        this.file = file;
        this.button = button;
        this.buffer = new KelimeTutucuBuffer();
    }

}
