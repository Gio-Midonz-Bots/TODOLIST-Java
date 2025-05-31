package br.com.todolist.model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Tarefas todo = new Tarefas();
        ArrayList<Tarefas> lista = new ArrayList<>();
        int opcao = 0;
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

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do tarefa: ");

            }


        }

    }
}