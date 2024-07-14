package pengguna;

public class Buku {
    // Atribut
    private int id;
    private String judul;
    private double harga;

    // Constructor
    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter untuk id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk judul
    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk harga
    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method naikkanHarga tanpa parameter
    public void naikkanHarga() {
        this.harga += 10000;
        System.out.println("Harga Buku naik menjadi: " + this.harga);
    }

    // Method naikkanHarga dengan parameter
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga Buku naik menjadi: " + this.harga);
    }
}
