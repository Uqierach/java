import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.cert.TrustAnchor;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Mahasiswa {
  int nilai;
  String nama;

  public Mahasiswa(String nama, int nilai) {
    this.nama = nama;
    this.nilai = nilai;
  }

  public static void main(String[] args) {

    Mahasiswa[] mhs = {
        new Mahasiswa("Adi", 70),
        new Mahasiswa("Budi", 65),
        new Mahasiswa("Caca", 90),
        new Mahasiswa("Deny", 75),
    };

    int[] nilaiMhs = {
        mhs[0].nilai,
        mhs[1].nilai,
        mhs[2].nilai,
        mhs[3].nilai,
    };

    String pesan = "";
    String[] arrMessage = {};

    for (int i = 0; i < mhs.length; i++) {
      int nilai = mhs[i].nilai;
      String nama = mhs[i].nama;

      if (nilai < 46) {
        pesan = nama + " = " + "D";
      } else if (nilai < 56) {
        pesan = nama + " = " + "C";
      } else if (nilai < 66) {
        pesan = nama + " = " + "C+";
      } else if (nilai < 76) {
        pesan = nama + " = " + "B";
      } else if (nilai < 86) {
        pesan = nama + " = " + "B+";
      } else if (nilai < 100) {
        pesan = nama + " = " + "A";
      }

      JOptionPane.showMessageDialog(null, pesan);

    }

    Arrays.sort(nilaiMhs);
    String terkecil = "Terkecil = " + nilaiMhs[0];
    String tertinggi = "Tertinggi  = " + nilaiMhs[3];

    // System.out.println(message);
    // JOptionPane.showMessageDialog(null, terkecil);
    // JOptionPane.showMessageDialog(null, tertinggi);
    String channel = "4";
    switch (channel) {
      case "1":
        System.out.println("1");
        break;
      case "2":
        System.out.println("2");
        break;
      case "3":
        System.out.println("3");
        break;
      // case "4":
      // System.out.println("4");
      // break;

      default:
        break;
    }

    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

    int A = 0;
    int B = 0;

    try {
      System.out.println("Masukkan angka A: ");
      A = Integer.parseInt(dataIn.readLine());

      System.out.println("Masukkan angka B: ");
      B = Integer.parseInt(dataIn.readLine());
    } catch (Exception e) {
      // TODO: handle exception
    }

    System.out.println("Nilai A = " + A);
    System.out.println("Nilai B = " + B);
    System.out.println(A + B);

    


  }
}