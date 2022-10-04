import javax.swing.JOptionPane;


public class QuizKalkulatorSuhu {
  static void kalkulatorSuhu() { 
    double celcius = 0,
        farenheit = 0, 
        kelvin = 0,
        reamur = 0;

    int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai: "));
    
    switch(input) { 
      case 1: 
        celcius = Double.parseDouble(JOptionPane.showInputDialog("Celcius"));
        getCelcius(celcius);
        break;
      case 2: 
        farenheit = Double.parseDouble(JOptionPane.showInputDialog("farenheit"));
        getFarenheit(farenheit);
        break;
      case 3: 
        kelvin = Double.parseDouble(JOptionPane.showInputDialog("kelvin"));
        getKelvin(kelvin);
        break;
      case 4: 
        reamur = Double.parseDouble(JOptionPane.showInputDialog("reamur"));
        getReamur(reamur);
        break;
      default: 
        System.out.println("Invalid Option");
    }
  }

  static void getCelcius(double c) { 
    double toReamur, toFarht, toKelvin;

    toReamur = 4d / 5d * c;
    toFarht = (9d / 5d  * c) + 32d;
    toKelvin = 273d + c;

    String msg = "C to R : " + toReamur + "\n"
               + "C to F : " + toFarht + "\n"
               + "C to K : " + toKelvin;

    JOptionPane.showMessageDialog(null, msg);
  }

  static void getFarenheit(double f) {  
    double toReamur, toCelc;

    toReamur = 4d / 9d * ( f - 32d );
    toCelc = 5d / 9d * ( f - 32d );

    String msg = "F to R : " + toReamur + "\n"
               + "F to C : " + toCelc;

    JOptionPane.showMessageDialog(null, msg);
  }

  static void getKelvin(double k) { 
    double toReamur, toCelc;

    toReamur = 4d / 5d * ( k - 273d );
    toCelc = k - 273d;

    String msg = "K to R : " + toReamur + "\n"
               + "K to C : " + toCelc;

    JOptionPane.showMessageDialog(null, msg);
  }

  static void getReamur(double r) { 
    double toFarht, toCelc, toKelvin;

    toCelc = 5d / 4d * r;
    toFarht = (9d / 4d * r) + 32d;
    toKelvin = (5d / 4d * r) + 273d;

    String msg = "R to C : " + toCelc + "\n"
               + "R to F : " + toFarht + "\n" 
               + "R to K : " + toKelvin;

    JOptionPane.showMessageDialog(null, msg);
  }

  public static void main(String[] args) {
    kalkulatorSuhu();
  }
}
