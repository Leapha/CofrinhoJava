

public class Real extends Moeda {
    	
	// Construtor da classe Real, que chama o construtor da classe Moeda com o valor fornecido
	public Real(double valor) {
        super(valor);
    }

	
	// Método sobrescrito da classe Moeda para retornar o valor de Real
    @Override
    public double converterParaReal() {
        return valor;
    }
    
    @Override
	public int hashCode() {
		return super.hashCode();
	}

    
 // Método equals sobrescrito para comparação de objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
