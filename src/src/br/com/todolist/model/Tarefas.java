package br.com.todolist.model;

public class Tarefas {
    private int id;
    private String titulo;
    private String descricao;
    private boolean status;

    public Tarefas() {

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return "Tarefas do momentos:\n" +
                "ID da tareda: "+ getId() +
                "\nTitulo da tareda: "+ getTitulo()+
                "\nDescrição da tareda: " + getDescricao()+
                "\nStatus da tareda: " + isStatus();
    }
}
