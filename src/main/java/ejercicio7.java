import javax.swing.*;

import static java.lang.Math.*;

public class ejercicio7 {
    /*
        CONSTRUIR UN PROGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RASICES DE LA ECUACION DE SEGUNDO
        GRADO DE COEFICIENTES REALES O CUADRATICA
    */
    public static void main(String[] args) {
        double a, b, c, x1,x2,ac;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite c"));
        ac = 4 * a * c;
        if (pow(b, 2) >= ac) {
            ac = sqrt(pow(b,2)- ac);
            x1 = (-b + ac)/(2*a);
            x2 = (-b - ac)/(2*a);
            JOptionPane.showMessageDialog(null, "Las respuestas son: " + x1 + "  "+x2 );
        }
        else{
            JOptionPane.showMessageDialog(null,"La ecuacion no se puede resolver");
        }
    }
}
