package br.com.todolist.model;

import java.util.ArrayList;


public class GerenciadorDeTarefas{


    private ArrayList<Tarefas> lista = new ArrayList<>();


    public GerenciadorDeTarefas() {

    }

    void adicionarTarefas(String titulo, String descricao, boolean status) {
       int ID = lista.size() + 1;

       Tarefas tarefas = new Tarefas(ID,titulo,descricao,status);
       lista.add(tarefas);
    }

    boolean removerTarefas(int ID){
        for(int i=0; i<lista.size();i++){
            Tarefas tarefas = lista.get(i);
            if(tarefas.getId()==ID){
                lista.remove(i);
        return true;
            }
        }
        return false;
    }

    void listarTarefas(){
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for(Tarefas tarefas : lista){
            System.out.println(tarefas);
        }
    }

    void listarTarefasConcluida(){
    for (Tarefas tarefas : lista){
            if (tarefas.isStatus()==true){
                System.out.println(tarefas);
            }
        }
    }


    void listarTarefasPendentes(){
        for (Tarefas tarefas : lista){
            if (tarefas.isStatus()==false){
                System.out.println(tarefas);
            }
        }
    }


}
