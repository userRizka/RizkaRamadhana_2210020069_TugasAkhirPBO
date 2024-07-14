package pengguna;

public class Pengguna {
    // Atribut
    private int id;
    private String username;
    private String password;

    // Constructor
    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    // Method login
    public void login() {
        System.out.println("Ini method untuk Login");
    }

    // Method lupaPassword
    public void lupaPassword() {
        System.out.println("Ini method Lupa Password");
    }

    // Method daftar
    public void daftar() {
        System.out.println("Ini method Daftar user baru");
    }

    // Method hapus tanpa parameter
    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    // Method hapus dengan parameter int
    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }

    // Method hapus dengan parameter String
    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username=" + username);
    }

    // Method login dengan parameter String
    public void login(String tokenGoogle) {
        System.out.println("Ini Login menggunakan Google");
    }

    // Getter untuk id
    public int getId() {
        return this.id;
    }

    // Getter untuk username
    public String getUsername() {
        return this.username;
    }

    // Getter untuk password
    public String getPassword() {
        return this.password;
    }

    // Setter untuk id
    public void setId(int id) {
        this.id = id;
    }

    // Setter untuk username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter untuk password
    public void setPassword(String password) {
        this.password = password;
    }
}
