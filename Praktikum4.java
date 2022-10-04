import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Praktikum4 {

  // functions untuk nomor 1
  static void CobaFor() {
    int jumlah = 0;
    for (int i = 0; i <= 10; i++)
      jumlah += i;

    System.out.println("Jumlah semua bilangan : " + jumlah);
  }

  static void CobaFor1() {
    for (double jari = 1.0; jari <= 10; jari++) {
      System.out.println("Radius = " + jari + " Luas = " + (jari * Math.PI * jari));
    }
  }

  static void CobaWhile() {
    double r = 0;

    while (r < .99d) {
      r = Math.random();
      System.out.println(r);
    }
  }

  static void CobaDoWhile() {
    double r = 0;

    do {
      r = Math.random();
      System.out.println(r);
    } while (r < .99d);

  }

  static void Faktorial() {
    long counter = 5;
    long faktorial;

    for (int i = 0; i <= counter; i++) {
      faktorial = 1;

      for (int j = 2; j <= i; j++) {
        faktorial *= j;
      }
      System.out.println(i + "!" + " adalah = " + faktorial);
    }
  }

  // functions untuk nomor 2 abc

  static int getPower(int num, int pow) {
    int hasil = num;

    for (int i = 1; i < pow; i++) {
      hasil *= num;
    }

    return hasil;
  }

  static int getPermutation(int num) {
    int faktorial = 1;

    for (int i = 0; i <= num; i++) {
      faktorial = 1;

      for (int j = 2; j <= i; j++) {
        faktorial *= j;
      }
    }
    return faktorial;
  }

  // function untuk nomor 3 ab

  static void getNumber() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // using if statement
    int input;
    String out;

    input = Integer.parseInt(JOptionPane.showInputDialog("input nilai: "));

    if (input == 1)
      out = "satu";
    else if (input == 2)
      out = "dua";
    else if (input == 3)
      out = "tiga";
    else if (input == 4)
      out = "empat";
    else if (input == 5)
      out = "lima";
    else if (input == 6)
      out = "enam";
    else if (input == 7)
      out = "tujuh";
    else if (input == 8)
      out = "delapan";
    else if (input == 9)
      out = "sembilan";
    else if (input == 10)
      out = "sepuluh";
    else
      out = "Invalid Input";

    JOptionPane.showMessageDialog(null, out);

    // using switch statement
    switch (input) {
      case 1:
        out = "satu";
        break;
      case 2:
        out = "dua";
        break;
      case 3:
        out = "tiga";
        break;
      case 4:
        out = "empat";
        break;
      case 5:
        out = "lima";
        break;
      case 6:
        out = "enam";
        break;
      case 7:
        out = "tujuh";
        break;
      case 8:
        out = "delapan";
        break;
      case 9:
        out = "sembilan";
        break;
      case 10:
        out = "sepuluh";
        break;
      default:
        out = "Invalid Input";
        break;
    }

    System.out.println(out);

  }

  // function untuk nomor 4 ab
  static void getNIM() {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String msg = "Masukkan 3 angka terakhir pada NIM : ";
    int hasil = 0;

    int NIM = 0;
    String msgEven = "";

    int NIM2 = 0;
    String msgOdd = "";

    // input using BufferedReader & JOptionPane
    try {
      System.out.println(msg);
      NIM = Integer.parseInt(br.readLine());

    } catch (Exception e) {
      System.out.println("Invalid NIM!");
    }

    NIM2 = Integer.parseInt(JOptionPane.showInputDialog(msg));

    // menjumlahkan keduanya
    hasil = NIM + NIM2;

    // cek ganjil genap
    if (NIM % 2 == 0) {
      msgEven = "NIM Genap : " + NIM + "\n" + "Hasil penjumlahan : " + hasil;
    } else {
      msgOdd = "NIM ganjil : " + NIM + "\n" + "Hasil penjumlahan : " + hasil;
    }

    if (NIM2 % 2 == 0) {
      msgEven = "NIM Genap : " + NIM2 + "\n" + "Hasil penjumlahan : " + hasil;
    } else {
      msgOdd = "NIM ganjil : " + NIM2 + "\n" + "Hasil penjumlahan : " + hasil;
    }

    // menampilkan output
    System.out.println(msgEven);
    JOptionPane.showMessageDialog(null, msgOdd);

  }

  public static void main(String[] args) {

    try {

    } catch (Exception e) {
      // TODO: handle exception
    }

    // ================================== nomor 1
    /*
     * CobaFor();
     * CobaWhile();
     * CobaDoWhile();
     * Faktorial();
     */

    // ================================== nomor 2
    // 2a
    /*
     * getPower(4, 3);
     * getPower(5, 2);
     */

    // 2b
    /*
     * System.out.println("5! + 4!: " +
     * (getPermutation(5) + getPermutation(4)));
     */

    // 2c
    /*
     * double opr = ( getPower(4, 2) + getPower(5, 1) ) /
     * (5d + getPower(4, 2));
     * 
     * System.out.println(opr);
     */

    // ================================== nomor 3
    // getNumber();

    // ================================== nomor 4
    getNIM();

    // ================================== nomor 5

    // deklarasi & inisialiasi variabel
    // input dengan bufferedreader & joptionpane
    // dijumlahkan NIM + NIM2
    // cek ganjil genap
    // print output
  }
}
