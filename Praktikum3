public class Praktikum_3 {
    public static void main(String[] args) {
        //operator
        int angka1 = 15;
        int angka2 = 4;

        System.out.println("Hasil tambah: " + (angka1 + angka2));
        System.out.println("Hasil kurang: " + (angka1 - angka2));
        System.out.println("Hasil kali: " + (angka1 * angka2));
        System.out.println("Hasil bagi: " + (angka1 / angka2));
        System.out.println("Sisa bagi: " + (angka1 % angka2));

        // Menampilkan hasil increment dan decrement
        angka1++;
        angka2--;
        System.out.println("Setelah ++angka1: " + angka1);
        System.out.println("Setelah angka2--: " + angka2);

        int nilai1 = 7;
        int nilai2 = 10;

        System.out.println("Apakah sama? = " + (nilai1 == nilai2));
        System.out.println("Apakah tidak sama? = " + (nilai1 != nilai2));
        System.out.println("Apakah nilai1 lebih besar? = " + (nilai1 > nilai2));
        System.out.println("Apakah nilai1 lebih kecil? = " + (nilai1 < nilai2));
        System.out.println("Lebih besar atau sama? = " + (nilai1 >= nilai2));
        System.out.println("Lebih kecil atau sama? = " + (nilai1 <= nilai2));
        
        boolean benar = true;
        boolean salah = false;

        System.out.println("Hasil benar && salah = " + (benar && salah));
        System.out.println("Hasil benar || salah = " + (benar || salah));
        System.out.println("Kebalikan dari benar = " + (!benar));

        int x = 8;
        int y = 0;

        // Mencegah error saat pembagian
        boolean aman = (y != 0) && (x / y > 1);
        System.out.println("Apakah aman dibagi? " + aman);
        
        //operator assignment
        int nilai = 20;

        nilai += 10; // Tambah 10
        nilai -= 5;  // Kurang 5
        nilai *= 2;  // Kali 2
        nilai /= 5;  // Bagi 5
        nilai %= 3;  // Sisa bagi 3

        System.out.println("Nilai akhir: " + nilai);
        
        //operator ternary
        int nilaiUjian = 72;
        String hasil = (nilaiUjian >= 75) ? "Lulus" : "Tidak Lulus";

        int angka3 = 18, angka4 = 22;
        int terbesar = (angka3 > angka4) ? angka3 : angka4;

        System.out.println("Status: " + hasil);
        System.out.println("Angka terbesar: " + terbesar);
        
        //operator bit
        int bil1 = 9;  // 1001
        int bil2 = 5;  // 0101

        System.out.println("bil1 & bil2 = " + (bil1 & bil2));
        System.out.println("bil1 | bil2 = " + (bil1 | bil2));
        System.out.println("bil1 ^ bil2 = " + (bil1 ^ bil2));
        System.out.println("~bil1 = " + (~bil1));
        System.out.println("bil1 << 1 = " + (bil1 << 1));
        System.out.println("bil2 >> 1 = " + (bil2 >> 1));

        //input/output
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println();
        
        //outputprintf
        String nama = "fidi";
        int umur = 19;
        double tinggi = 172.1f;
        
        System.out.printf("Halo nama saya %s, umur %d, tinggi %.1f cm\n", nama, umur, tinggi);
        
        //input scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM anda : ");
        String nim = scanner.nextLine();
        System.out.println("Nim anda adalah : " + nim);
        
        System.err.print("Masukkan umur : ");
        try{
            int umurUser = scanner.nextInt();
            System.out.println("Umur : " + umurUser + " tahun");
        } catch (Exception e) {
            System.out.println("Anda salah input");
        }
        
        //
        String strUmur = "19";
        int intUmur = Integer.parseInt(strUmur);
        System.out.println("strUmur yang telah dikonversi : " + intUmur);
        
        int value = 235;
        String strValue = Integer.toString(value);
        System.out.println("intValue yang telah dikonversi : " + strValue);
        
        //enumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        
        Hari hariIni = Hari.RABU;
        
        if (hariIni == Hari.RABU) {
            System.out.println("Hari ini adalah hari RABU");
            System.out.println("Dan besok adalah hari " + Hari.KAMIS);
        }
    }
}
