package exercicioEmGrupo;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[4];
        double[] pesos = new double[4];
        double[] alturas = new double[4];
       
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o nome da %dª pessoa: ", i+1);
            nomes[i] = input.nextLine();

            System.out.printf("Digite o peso da %dª pessoa (em kg): ", i+1);
            pesos[i] = input.nextDouble();

            System.out.printf("Digite a altura da %dª pessoa (em metros): ", i+1);
            alturas[i] = input.nextDouble();
        
            input.nextLine();
            
           
        }
      
        double mediaPeso = 0;
        double mediaAltura = 0;
        for (int i = 0; i < 4; i++) {
            mediaPeso += pesos[i];
            mediaAltura += alturas[i];
        }
        mediaPeso /= 4;
        mediaAltura /= 4;
      
        int indiceMaiorPeso = 0;
        for (int i = 1; i < 4; i++) {
            if (pesos[i] > pesos[indiceMaiorPeso]) {
                indiceMaiorPeso = i;
            }
        }       
        int indiceMaiorAltura = 0;
        for (int i = 1; i < 4; i++) {
            if (alturas[i] > alturas[indiceMaiorAltura]) {
                indiceMaiorAltura = i;
            }
        }    
        System.out.printf("A pessoa com maior peso é: %s\n", nomes[indiceMaiorPeso]);
        System.out.printf("A pessoa com maior altura é: %s\n", nomes[indiceMaiorAltura]);
        System.out.printf("A média de peso é: %.2f kg\n", mediaPeso);
        System.out.printf("A média de altura é: %.2f metros\n", mediaAltura);
    }

}
/*public final static void clearConsole()
{
try
{
    final String os = System.getProperty("os.name");

    if (os.contains("Windows"))
    {
        Runtime.getRuntime().exec("cls");
    }
    else
    {
        Runtime.getRuntime().exec("clear");
    }
}
catch (final Exception e)
{
    //  Handle any exceptions.
}
}
}*/