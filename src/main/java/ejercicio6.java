import javax.swing.*;

public class ejercicio6 {
    /*
        CONSTRUIR UN PROGRAMA QUE, DADO UN NUMERO TOTAL DE HORAS, DEVUELVE EL NUMERO DE SEMANAS,
        DIAS Y HORAS QUE EQUIVALEN.
        POR EJEMPLO, DADO UN TOTAL DE 1000 HORAS DEBE MOSTRAR 5 SEMANAS, 6 DIAS Y 16 HORAS
    */
    public static void main(String[] args) {
        int semanas, dias, horas;
        horas = Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de horas"));
        semanas = horas / 168;
        horas %= 168;
        dias = horas /24;
        horas %= 24;
        JOptionPane.showMessageDialog(null,"La cantidad de semanas son: "+semanas+" dias "+ dias +" horas "+ horas);
    }
}
