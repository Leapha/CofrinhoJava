public class Dolar extends Moeda{
    
	
	 // Construtor da classe Dolar, que chama o construtor da classe Moeda com o valor fornecido
	 public Dolar(double valor) {
        super(valor);
    }

 
// Método sobrescrito da classe Moeda para converter o valor de Dólar para Real
    @Override
    public double converterParaReal() {
        // Supondo que 1 dólar equivale a 5 reais
        return valor * 5;
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
