package Animais;

public class Animais {

	public static void main(String[] args) {

		//Objeto, variavel de referencia
		
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.nome = "Puho";
		cachorro1.cor = "Black";
		cachorro1.altura = 35;
		cachorro1.peso = 5.5;
		cachorro1.tamanhoDoRabo = 5;
		
		cachorro1.latir();
		System.out.println("O cachorro pegou uma " + cachorro1.pegar());
		
		
		System.out.println("O cachorro esta " + cachorro1.interagir(acao "carinho"));
		
		
		
		
		
	}

}
