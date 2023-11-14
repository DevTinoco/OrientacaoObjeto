package Animais;

public class Cachorro {
   //Classe: Orientacao a objeto. 
	
	
	public String nome;
	public String cor;
	public int altura;
	public double peso;
	public int tamanhoDoRabo;
	public String estadoDeEspirito;
	
	// Metodos:
	public void comer() {
	
}
	public void latir() {
		System.out.println("Au Au");
	}
	
	//Retorno:
	
	public String pegar() {
		return "Bolinha";
	}
	// Estado de espirito
	
	public String interagir(String acao) {
		 if (acao.equals("carinho")) {
			this.estadoDeEspirito = "feliz";
		 }
		 
		 else {
			 this.estadoDeEspirito = "neutro";
			 
		 }
		 
		 return estadoDeEspirito;
	}
	
	
	
	
}