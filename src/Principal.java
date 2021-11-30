import lombok.Data;

import java.util.Scanner;

@Data

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nome;
        Double Peso1 = 0.15;
        Double Peso2 = 0.25;
        Double Peso3 = 0.30;
        Double Peso4 = 0.30;
        Float Nota1, Nota2, Nota3, Nota4, media = null;
        int i = 0;
        int faltas = 0;
        double mediafinal = 0;
        int bimestre = 1;

        for (i = 0; i < 15; i++) {
            System.out.println("Notas do Bimestre " + bimestre);

            System.out.println("Aluno : ");
            Nome = entrada.next();

            System.out.println("Nota de participação = ");
            Nota1 = entrada.nextFloat();
            System.out.println(Peso1 * Nota1);

            System.out.println("Nota das tarefas = ");
            Nota2 = entrada.nextFloat();
            System.out.println(Peso2 * Nota2);

            System.out.println("Nota do trabalho = ");
            Nota3 = entrada.nextFloat();
            System.out.println(Peso3 * Nota3);

            System.out.println("Nota da prova = ");
            Nota4 = entrada.nextFloat();
            System.out.println(Peso4 * Nota4);

            System.out.println("Numero de faltas " + Nome);
            faltas = entrada.nextInt();

            System.out.println("Media final : " + (Nota1 + Nota2 + Nota3 + Nota4) / 4);
            System.out.println(mediafinal);

        }
        if ((mediafinal >= 0) && (media < 4) && (faltas > 40)) {
            System.out.println("Reprovado");

        } else if ((media < 5) && (faltas <= 40)) {
            System.out.println("recuperação");

        }
        if ((media >= 7) && (faltas <= 40)) {
            System.out.println("Aprovado");

        }
    }

}
