package a3.project.ValidadorCPF;

import javax.swing.JOptionPane;

public class ValidadorPrincipal {
    public static void main(String[] args) {
        ValidadorCPF cpfVerfica = new ValidadorCPF();

        String CPF = JOptionPane.showInputDialog("Digite seu CPF, sem pontos e hifém, para que possa ser validado");

        cpfVerfica.validaCPF(CPF);
    }
}
