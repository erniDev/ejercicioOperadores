import javax.swing.*;
import java.util.function.Function;

public class ejercicio4 {
    /*
        HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE 3 CALIFICACIONES
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3, suma;
        Function<Integer,Integer> calificacion = x ->{
            while (x > 50 || x < 0){
                x = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero entre 0 y 50"));
            }
            return x;
        };
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primera nota"));
        calificacion.apply(nota1);

        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segunda nota"));
        calificacion.apply(nota2);

        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite tercera nota"));
        calificacion.apply(nota3);

        suma = nota1+ nota2+ nota3;


        JOptionPane.showMessageDialog(null,"La suma de las notas es: "+suma);    }

}
