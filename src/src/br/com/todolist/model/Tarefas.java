package br.com.todolist.model;

public class Tarefas {
    private int id;
    private String titulo;
    private String descricao;
    private boolean status;

    public Tarefas(int id,String titulo,String descricao,boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    boolean isStatus() {
        return status;
    }

    void marcarComoConcluida(){
        this.status = true;
    }

    @Override
    public String toString() {
        return "\nTarefas do momentos:\n" +
                "ID da tareda: "+ getId() +
                "\nTitulo da tareda: "+ getTitulo()+
                "\nDescrição da tareda: " + getDescricao()+
                "\nStatus da tareda: " +(status ? "Concluída" : "Pendente");
    }
}
