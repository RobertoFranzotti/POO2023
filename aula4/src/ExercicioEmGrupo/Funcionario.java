package ExercicioEmGrupo;

public class Funcionario {

    //Atributos
    private String nome;
    private double salario;


    //Constructor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos
    public double calcularInss() {
        return this.salario * 0.11;
    }

    public double calcularValeTransporte() {
        return this.salario * 0.06;
    }



}