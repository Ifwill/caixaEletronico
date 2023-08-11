package view;

import java.util.List;

import model.Tarefa;

public class TarefaView {
	
	
	public void exibirListaDeTarefas(List<Tarefa> tarefas) {
		System.out.println("-------lista de tarefas -------");
		for(Tarefa tarefa : tarefas) {
			System.out.println(" -Tarefa: "+tarefa.getNome()+"\n -Status: "+tarefa.getStatus()+"\n-------------------------------");
			System.out.println();
		}
	}

}
