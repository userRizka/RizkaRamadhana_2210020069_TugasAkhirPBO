package pengguna;

public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    // Constructor
    public Tamu() {
        super(); // Memanggil constructor dari superclass Pengguna
        System.out.println("Object Tamu telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter untuk sisaMasaAktif
    public int getSisaMasaAktif() {
        return this.sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    // Method untuk menambah masa aktif
    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }

    // Overriding method hapus
    @Override
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    // Overriding method login
    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}
