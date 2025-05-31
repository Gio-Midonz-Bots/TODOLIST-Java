package br.com.todolist.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        int opcao = 1;

        while(opcao != 0){
            System.out.println("MENU TO-DO LIST");
            System.out.println("1 - Adicionar Tarefas");
            System.out.println("2 - Remover Tarefas");
            System.out.println("3 - Listar Tarefas");
            System.out.println("4 - Listar Tarefas concluidas");
            System.out.println("5 - Listar Tarefas Pendentes");
            System.out.println("6 - Marcar tarefas como concluidas");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("você está no caso um");
                    break;

                case 2:
                    System.out.println("VocÊ está no caso dois");
                    break;

                case 3:
                    System.out.println("vocÊ saiu do programa!");
                    break;
                case 4:
                    System.out.println("você está no caso um");
                    break;

                case 5:
                    System.out.println("VocÊ está no caso dois");
                    break;

                case 6:
                    System.out.println("vocÊ saiu do programa!");
                    break;

                case 0:
                    System.out.println("vocÊ saiu do programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        input.close();
        }

    }
}