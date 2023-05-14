import java.util.Scanner;

public class kalkulatorArray {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] angka = new int[3];

    for (int i = 0; i < angka.length; i++) {
      System.out.println("Masukkan angka ke-" + (i+1) + ": ");
      angka[i] = input.nextInt();
    }

    System.out.println("Pilih operasi: ");
    System.out.println("1. Penjumlahan (+)");
    System.out.println("2. Pengurangan (-)");
    int operasi = input.nextInt();

    int hasil = 0;
    if (operasi == 1) {
      for (int i = 0; i < angka.length; i++) {
        hasil += angka[i];
      }
    } else if (operasi == 2) {
      hasil = angka[0];
      for (int i = 1; i < angka.length; i++) {
        hasil -= angka[i];
      }
    } else {
      System.out.println("Operasi tidak valid.");
    }

    System.out.println("Hasil: " + hasil);

    System.out.println ("terimakasih sudah menggunakan sistem");
  }
}