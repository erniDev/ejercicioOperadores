import javax.swing.*;

public class ejercicio5 {
    /*
        GUILLERMO TIENE N DOLARES. LUIS TIENE LA MITAD DE LO QUE TIENE GUILLERMO.
        JUAN TIENE LA MITAD DE LO QUE POSEE GUILLERMO Y LUIS JUNTOS.
        HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO QUE TIENEN ENTRE LOS 3.
    */
    public static void main(String[] args) {
        double dolarg, dolarl, dolarj, suma;
        dolarg = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dolares tiene Guillermo"));
        dolarl = dolarg/2;
        dolarj = (dolarg+dolarl)/2;
        JOptionPane.showMessageDialog(null,"Guillermo tiene "+dolarg+" dolares "
                +"Luis "+dolarl+" dolares "+"y Juan "+ dolarj+" dolares");
        suma = dolarg+dolarl+dolarj;
        JOptionPane.showMessageDialog(null,"La suma de los dolares que tiene entre los tres es de : "+suma);
    }
}
