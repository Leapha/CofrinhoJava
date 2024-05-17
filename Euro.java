public class Euro extends Moeda {
    
	
	// Construtor da classe Euro, que chama o construtor da classe Moeda com o valor fornecido
	public Euro(double valor) {
        super(valor);
    }

	
	// Método sobrescrito da classe Moeda para converter o valor de Euro para Real
    @Override
    public double converterParaReal() {
        // Supondo que 1 euro equivale a 6 reais
        return valor * 6;
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
