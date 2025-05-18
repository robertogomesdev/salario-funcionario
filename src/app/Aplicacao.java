package app;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double porcentagem = sc.nextDouble();
        funcionario.salarioComBonus(porcentagem);

        System.out.println();
        System.out.println("Salário atualizado: " + funcionario);

        sc.close();
    }
}
