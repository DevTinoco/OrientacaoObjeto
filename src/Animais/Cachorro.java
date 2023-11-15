package Animais;

public class Cachorro {
   //Classe: Orientacao a objeto. 
	
	
	public String nome;
	public String cor;
	public int altura;
	public double peso;
	public int tamanhoDoRabo;
	public String estadoDeEspirito; 
	public String acao;

	// Metodos:
	public void comer() {
	
}	public void latir() {
		System.out.println("Au Au");
	}
	
	//Retorno:
	
	public String pegar() {
		return "Bolinha";
	}
	// Estado de espirito
	
	public String interagir(String acao) {
		
		//switch:
		
		switch (acao) {
		case "carinha" : this.estadoDeEspirito = "feliz"; break;
		case "vai dormir" : this.estadoDeEspirito = "bravo";break;
		case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
		default: this.estadoDeEspirito = "neutro";
		}
		
		return this.estadoDeEspirito;
		
/*	 if (acao.equals("carinho")) {
			this.estadoDeEspirito = "feliz";
		 }
		 
		 else if (acao.equals("vai dormir!")){
			 this.estadoDeEspirito = "Bravo"; 
		 }
		 else if (acao.equals("pisar na patinha!")){
			 this.estadoDeEspirito = "Triste";
		 }
			 else {
		 this.estadoDeEspirito = "neutro";
		 }
		 return estadoDeEspirito;)*/
	}
	public String pegar(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}