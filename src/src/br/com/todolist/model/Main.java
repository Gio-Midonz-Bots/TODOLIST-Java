package br.com.todolist.model;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        int opcao = -1;

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
                    input.nextLine();
                    System.out.println("------------ADICIONAR TAREFAS------------");
                    System.out.println("Informe o titulo: ");
                    String titulo = input.nextLine();
                    System.out.println("Informe a descricao: ");
                    String descricao = input.nextLine();

                    boolean status = false;

                    gerenciador.adicionarTarefas(titulo,descricao,status);
                    System.out.println("Tarefas adicionadas com sucesso!" );
                    break;

                case 2:
                    System.out.println("------------REMOVER TAREFAS------------");
                    System.out.println("Informe o ID do Tarefa que deseja remover: ");
                    int id = input.nextInt();
                    input.nextLine();
                    gerenciador.removerTarefas(id);

                    boolean removida = gerenciador.removerTarefas(id);
                    if (removida) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada. Verifique o ID.");
                    }
                    break;

                case 3:
                    System.out.println("------------LISTAR TAREFAS------------");
                    gerenciador.listarTarefas();
                    break;
                case 4:
                    System.out.println("------------LISTAR TAREFAS CONCLUIDAS------------");
                    gerenciador.listarTarefasConcluida();
                    break;

                case 5:
                    System.out.println("------------LISTAR TAREFAS PENDENTES------------");
                    gerenciador.listarTarefasPendentes();
                    break;

                case 6:
                    System.out.println("vocÊ saiu do programa!");
                    break;

                case 0:
                    System.out.println("vocÊ saiu do programa!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }

        input.close();
    }
}