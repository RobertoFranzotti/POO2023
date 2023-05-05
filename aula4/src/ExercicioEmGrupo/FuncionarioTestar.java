package ExercicioEmGrupo;

import javax.swing.JOptionPane;

public class FuncionarioTestar {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ("Adriano", 3000.);

        funcionario.calcularInss();
        funcionario.calcularValeTransporte();

        JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome() 
                                    + "\nSalário: " + funcionario.getSalario() 
                                    + "\nINSS: " + funcionario.calcularInss()
                                    + "\nVale Transporte: " + funcionario.calcularValeTransporte() 
                                    + "\nSalário Líquido: " + (funcionario.getSalario() - funcionario.calcularInss() - funcionario.calcularValeTransporte()));

    }

}