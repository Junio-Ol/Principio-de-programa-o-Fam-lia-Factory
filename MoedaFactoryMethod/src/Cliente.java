
public class Cliente {

	public static void main(String[] args) {
	
		Paises pa = new Brasil();
		Simbolos simb= pa.criaSimbolos();
		System.out.println(simb.simbolo());

		Paises pa1 = new EstadosUnidosDaAmerica();
		Simbolos simb2= pa1.criaSimbolos();
		System.out.println(simb2.simbolo());
		

	}

}
