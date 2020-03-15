
public abstract class Moeda extends MoedaFactory {

	public static MoedaFactory CriarMoeda(Pais pais) throws IllegalAccessException {
		if(pais.equals(Pais.Brasil)) {
			return new Real();
			
		}
		if(pais.equals(Pais.EUA)) {
			return new USDolar();
		
		}
		throw new IllegalArgumentException("Pais não listado");
		
	}	

}
