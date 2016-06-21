package Exercicio20;

public class Agenda {
	private Contato[] agenda = new Contato[100];
	
	private int totalDeContatos = 0;
	
	public void addContato(Contato contato) {
		// ineficiente
		/*for (int i = 0; i < this.agenda.length; i++) {
			if (this.agenda[i].equals(null)) {
				this.agenda[i] = contato;
				break;
			}
		}*/
		// mais eficiente
		this.agenda[this.totalDeContatos] = contato;
		this.totalDeContatos++;
	}
	
	public void removeContato(Contato contato) {
		for (int i = 0; i < agenda.length; i++) {
			if(this.agenda[i] == contato) {
				this.agenda[i] = null;
				break;
			}
		}
	}
	
	public void imprimeContatos(){
		if (this.totalDeContatos == 0) {
			System.out.println("[]");
		}
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("[" + this.agenda[i].getNome() + ", " + this.agenda[i].getTelefone() + "]");
		}
	}
}
