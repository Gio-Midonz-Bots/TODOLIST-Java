package br.com.todolist.model;

import java.util.ArrayList;

public class GerenciadorDeTarefas extends Tarefas{


    public GerenciadorDeTarefas(int id, String titulo, String descricao, boolean status) {
        super(id, titulo, descricao, status);
    }

    void adicionarTarefas(String titulo, String descricao){

    }

    boolean removerTarefas(String titulo, String descricao){
        return false;
    }

    @Override
    void marcarComoConcluida() {
        super.marcarComoConcluida();
    }
    void listarTarefas(){

    }

    void listarTarefasConcluida(){
    }

    void listarTarefasPendentes(){

    }
}
