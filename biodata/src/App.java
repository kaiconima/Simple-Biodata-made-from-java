import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //input biodata
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda:");
        String nama = input.nextLine();
        System.out.println("Masukkan NIS Anda:");
        int NIS = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Jenis Kelamin Anda:");
        String jenisKelamin = input.nextLine();
        System.out.println("Masukkan Agama Anda:");
        String agama = input.nextLine();
        //baris akhir bagian inout data

        // Hasil input pengguna
        System.out.println("\n====== Data Anda =======");
        System.out.println("Nama: " + nama);
        System.out.println("NIS: " + NIS);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Agama: " + agama);
        System.out.println("===== Terima Kasih =====");
        // end line Hasil input pengguna
        
        input.close();
    }
}
