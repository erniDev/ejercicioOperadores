import javax.swing.*;

public class ejercicio8 {
    /*
        UNA COMPAÑIOA DE VENTA DE CARROS USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO
        DE $1000 MENSUALES, MAS COMISION DE $150 POR CADA CARRO VENDIDO, MAS EL 5% DEL
        VALOR DELA VENTA POR EL CARRO. CADA MES EL CAPTURISTA DE LA EMPRESA INGRASA EN LA
        COMPUTADORA LOS DATOS PERTINENTES. HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO
        MENSUAL DE UN VENDEDOR DADO.
    */
    public static void main(String[] args) {
        double carros, vcarro,salario;
        carros = Double.parseDouble(JOptionPane.showInputDialog("Digite cuantos carros vendio este mes "));
        vcarro = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor total de los carros que vendio este mes"));
        salario = 1000+(150*carros)+(vcarro*0.5);
        JOptionPane.showMessageDialog(null,"El salario mensual es de: "+salario);

    }
}
