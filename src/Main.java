public class Main {
    public static void main(String[] args) throws Exception {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        // Membuat objek Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}
