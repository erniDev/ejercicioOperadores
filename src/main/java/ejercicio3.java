import javax.swing.*;

public class ejercicio3 {

    /*
        HACER UN PROGRAMA QUE CALCULE E IMPRMA EL SALARIO DE UN EMPLEADO A PARTIR DE SUS HORAS SEMANALES
        TRABAJADAS Y DE SU SALARIO POR HORA
    */
    public static void main(String[] args) {
        int salario, horas;

        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite digite salario por hora "));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de horas "));
        salario *= horas;
        JOptionPane.showMessageDialog(null,"El salario semanal es: "+salario);
    }
}
