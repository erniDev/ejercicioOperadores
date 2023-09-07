import javax.swing.*;
import java.sql.DatabaseMetaData;
import java.util.function.Function;

public class ejercicio1 {
    /*
        LA CALIFICACION FINAL D UN ESTUDIANTE DE INFORMATICA SE CALCULA CO BASE A LAS CALIFICACIONES DE
        CUATRO ASPECTOS DE SU RENDIMIENTO ACADEMICO: PARTICIPACOPN, PRIMER EXAMEN PARCIAL , SEGUNDO EXAMEN
        PARCIAL Y EXAMEN DINAL. SABIENDO QUE LAS CALIFICACIONES ANTERIORES ENTRAN A LA CALIFICACION FINAL
        CON PONDERACIONES DEL 10%, 25%, 25% Y 40%, HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CALIFICACION
        FINAL OBTENIDA POR UN ESTUDIANTE.
    */
    public static void main(String[] args) {
        int participacion, priexamen, segexamen, examenf;
        double notaf;
        Function <Integer,Integer> calificacion = x ->{
            while (x > 50 || x < 0){
                x = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero entre 0 y 50"));
            }
            return x;
        };
        participacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota de participacion."));
        calificacion.apply(participacion);

        priexamen = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del primer examen."));
        calificacion.apply(priexamen);

        segexamen = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del segunto examen."));
        calificacion.apply(segexamen);

        examenf = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del examen final."));
        calificacion.apply(examenf);

        notaf = (participacion * .01) + (priexamen * .025) + (segexamen * .025) + (examenf * .04);
        JOptionPane.showMessageDialog(null,"La nota final del estudiante es de : "+notaf);
    }
}
