package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import view.TarefaView;

public class TarefaController {
	
	private List<Tarefa> listaDeTarefas;
	private TarefaView tarefaView;
	
	public TarefaController() {
		listaDeTarefas = new ArrayList<>();
		tarefaView = new TarefaView();
	}
	
	public void adicionarTarefa(String nome) {
		String status;
		status = "pendente";
		Tarefa tarefa = new Tarefa(nome,status);
		listaDeTarefas.add(tarefa);
		tarefa.setStatus(status);
	}
	
	public boolean statusTarefa(String nome) {
		String status = "concluida";
		for(Tarefa i:this.listaDeTarefas) {
			if(i.getNome().equals(nome)) {
				i.setStatus(status);
				return true;
			}
		}
		System.out.println();
		System.out.println("Tarefa nao encontrada!!");
		return false;
	}
	
	public void listarTarefas() {
		tarefaView.exibirListaDeTarefas(listaDeTarefas);
	}
	
	public void removerTarefaConcluida(String nome) {
		String status = "concluida";
		for(Tarefa i: this.listaDeTarefas) {
			if(i.getNome().equals(nome)) {
				if(i.getStatus().equals(status)) {
					listaDeTarefas.remove(i);
				}
					
			}
		}
	}
	
	
	
	
	
	
}
