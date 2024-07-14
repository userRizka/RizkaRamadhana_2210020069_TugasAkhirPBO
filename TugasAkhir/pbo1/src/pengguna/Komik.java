package pengguna;

public class Komik extends Buku {
    // Atribut khusus untuk Komik
    private int volume;

    // Constructor
    public Komik() {
        super(); // Memanggil constructor dari superclass Buku
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }

    // Getter untuk volume
    public int getVolume() {
        return this.volume;
    }

    // Setter untuk volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Overriding method naikkanHarga
    public void naikkanHarga() {
        double kenaikan = 15000;
        this.setHarga(this.getHarga() + kenaikan);
        System.out.println("Harga Komik naik menjadi: " + this.getHarga());
    }

    // Overloading method naikkanHarga dengan parameter
    public void naikkanHarga(double kenaikan) {
        this.setHarga(this.getHarga() + kenaikan);
        System.out.println("Harga Komik naik menjadi: " + this.getHarga());
    }
}
