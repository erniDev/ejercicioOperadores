import javax.swing.*;

import static java.lang.Math.pow;

public class ejercicio2 {
    /*
        HACER UN PROGRAMA QUE CALCULE (a+b)al cuadrado = a al cuadrado + b al cuadrado + 2ab
    */
    public static void main(String[] args) {
        double a, b, respuesta;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite b"));
        respuesta = pow(a,2) + pow (b,2) + 2*a*b;
        JOptionPane.showMessageDialog(null,"La respuesta es: "+respuesta);
    }
}
