import java.util.Scanner;
public class mainFaktorial03 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Faktorial03 fk = new Faktorial03();

        System.out.println("----------------------------------");
        System.out.println("PENGHITUNG FAKTORIAL");
        System.out.println("----------------------------------");
        
        System.out.print("Masukkan nilai yang akan dicari: ");
        int nilai = input.nextInt();

        System.out.println("\n--- HASIL ---");
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        System.out.println("----------------------------------");

    }
}