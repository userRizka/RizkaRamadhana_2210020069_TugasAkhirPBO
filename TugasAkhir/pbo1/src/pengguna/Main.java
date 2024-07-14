package pengguna;

public class Main {
    public static void main(String[] args) {
        // Membuat object Pengguna
        Pengguna pengguna = new Pengguna();
        
        // Menggunakan setter untuk mengisi atribut Pengguna
        pengguna.setId(1);
        pengguna.setUsername("user123");
        pengguna.setPassword("password123");

        // Menggunakan getter untuk mengambil dan mencetak atribut Pengguna
        System.out.println("ID Pengguna: " + pengguna.getId());
        System.out.println("Username Pengguna: " + pengguna.getUsername());
        System.out.println("Password Pengguna: " + pengguna.getPassword());

        // Memanggil method login, lupaPassword, dan daftar
        pengguna.login();
        pengguna.lupaPassword();
        pengguna.daftar();

        // Membuat object Buku
        Buku buku = new Buku();

        // Menggunakan setter untuk mengisi atribut Buku
        buku.setId(1);
        buku.setJudul("Belajar Java");
        buku.setHarga(100000);

        // Menggunakan getter untuk mengambil dan mencetak atribut Buku
        System.out.println("ID Buku: " + buku.getId());
        System.out.println("Judul Buku: " + buku.getJudul());
        System.out.println("Harga Buku: " + buku.getHarga());

        // Memanggil method naikkanHarga
        buku.naikkanHarga();
        buku.naikkanHarga(20000);

        // Membuat object Komik
        Komik komik = new Komik();

        // Menggunakan setter untuk mengisi atribut Komik
        komik.setId(2);
        komik.setJudul("One Piece");
        komik.setHarga(50000);
        komik.setVolume(95);

        // Menggunakan getter untuk mengambil dan mencetak atribut Komik
        System.out.println("ID Komik: " + komik.getId());
        System.out.println("Judul Komik: " + komik.getJudul());
        System.out.println("Harga Komik: " + komik.getHarga());
        System.out.println("Volume Komik: " + komik.getVolume());

        // Memanggil method naikkanHarga dari class Komik (overridden dari Buku)
        komik.naikkanHarga();
        komik.naikkanHarga(10000);
    }
}
