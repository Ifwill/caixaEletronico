package principal;

import java.util.Scanner;

import controller.TarefaController;


public class Main {
	
	public static void menu() {
		System.out.println("-----------menu-----------");
		System.out.println(" 1. adicionar nova tarefa.");
		System.out.println(" 2. concluir tarefa.");
		System.out.println(" 3. listar tarefa.");
		System.out.println(" 4. remover tarefa.");
		System.out.println(" 0. sair");
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		TarefaController controller = new TarefaController();
		int menuEscolha;
		String nomeTarefa,statusTarefa;
		
		do {
			menu();
			System.out.println("escolha:");
			menuEscolha = lerDados.nextInt();
			switch(menuEscolha) {
			case 1:
				System.out.println("Tarefa:");
				nomeTarefa = lerDados.next();
				controller.adicionarTarefa(nomeTarefa);
				break;
			case 2:
				System.out.println("nome da tarefa Concluida:");
				nomeTarefa = lerDados.next();
				controller.statusTarefa(nomeTarefa);
				break;
			case 3:
				controller.listarTarefas();
				break;
			case 4:
				System.out.println("Nome da tarefa Concluida que vc deseja remover:");
				nomeTarefa = lerDados.next();
				controller.removerTarefaConcluida(nomeTarefa);					
				
			}
			
		}while(menuEscolha != 0);
		System.err.println("Saindo...");
		
		
		
	}

}
