package principal;

import javax.swing.*;
import model.Matimatics;

public class Principal {

    public static void main(String[] args) {

        Matimatics mat1 = new Matimatics();

        mat1.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:")));
        mat1.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:")));
        int n = 0;

        try {

            n = mat1.getN1() / mat1.getN2();
            JOptionPane.showMessageDialog(null, "A Divisão é: " + n);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "A Divisão é: NULA");
        }

    }

}
