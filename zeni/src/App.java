import java.util.Scanner;

class Menghitung_luas_lingkaran {
    public static void main(String[] args) {

        // Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double luas, phi = 3.14;
        int r;

        // Input nilai jari-jari
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();

        // Menghitung luas lingkaran
        luas = phi * r * r;

        // Tampilkan hasil
        System.out.println("Luas Lingkaran = " + luas);
    }
}

class Menghitung_luas_persegi_panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang : " + luas);
    }
}