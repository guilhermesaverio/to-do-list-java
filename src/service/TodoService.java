package service;

import model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public void concluirTarefa(int indice) {
        if (indice < 1 || indice > tarefas.size()) {
            System.out.println("Índice inválido!");
            return;
        }
        tarefas.get(indice - 1).concluir();
    }

    public void removerTarefa(int indice) {
        if (indice < 1 || indice > tarefas.size()) {
            System.out.println("Índice inválido!");
            return;
        }
        tarefas.remove(indice - 1);
    }
}
