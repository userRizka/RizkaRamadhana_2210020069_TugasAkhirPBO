package pengguna;

public class Bebas {
    // Atribut
    private int id;
    private String nama;
    private double nilai;

    // Constructor
    public Bebas() {
        System.out.println("Object Bebas telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter untuk id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nilai
    public double getNilai() {
        return this.nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    // Method naikkanNilai tanpa parameter
    public void naikkanNilai() {
        this.nilai += 10;
        System.out.println("Nilai Bebas naik menjadi: " + this.nilai);
    }

    // Method naikkanNilai dengan parameter
    public void naikkanNilai(double kenaikan) {
        this.nilai += kenaikan;
        System.out.println("Nilai Bebas naik menjadi: " + this.nilai);
    }

    public static void main(String[] args) {
        // Membuat objek Bebas
        Bebas bebas = new Bebas();
        bebas.setId(1);
        bebas.setNama("Objek Bebas");
        bebas.setNilai(80);

        // Menggunakan getter untuk mengambil dan mencetak atribut
        System.out.println("ID: " + bebas.getId());
        System.out.println("Nama: " + bebas.getNama());
        System.out.println("Nilai: " + bebas.getNilai());

        // Menggunakan method naikkanNilai
        bebas.naikkanNilai();
        bebas.naikkanNilai(20);
    }
}
