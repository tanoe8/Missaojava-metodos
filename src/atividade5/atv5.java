package atividade5;

import java.util.Scanner;

public class atv5 {
    public atv5() {
    }

    public static void calcularMedia() {
        Scanner sc = new Scanner(System.in);
        double n1 = (double)0.0F;
        double n2 = (double)0.0F;
        double n3 = (double)0.0F;
        System.out.println("informe a 1° nota: ");
        n1 = (double)sc.nextInt();
        System.out.println("informe a 2° nota: ");
        n2 = (double)sc.nextInt();
        n3 = (n1 + n2) / (double)2.0F;
        System.out.println("média geral de: " + n3);
    }

    public static void estaAprovado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("O aluno passou? (true/false)");
        boolean aprovado = sc.nextBoolean();
        if (aprovado) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }

    public static void mostrarResultado(){
        //Dá de fazer esse código sem precisar criar 3 métodos, evitando o retrabalho
    }

    static void main() {
        calcularMedia();
        estaAprovado();
        System.out.println("RESULTADO GERAL, BASEADO NAS INFORMAÇÕES ACIMA");
    }
}