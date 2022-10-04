import javax.swing.JOptionPane;

public class Soal5 {

  static void forLoop() {
    int counter = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka : "));

    for (int i = 1; i <= counter; i++) {
      for (int j = counter; j >= i; j--) {
        System.out.print("*");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }

      for (int l = counter; l >= i; l--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  static void forLoop2() {
    int counter = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka : "));

    for (int i = 1; i <= counter; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int k = counter; k >= i; k--) {
        System.out.print(" ");
      }

      for (int l = 1; l <= i; l++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

  // static void getPow()
  public static void main(String[] args) {
    forLoop();
  }
}
