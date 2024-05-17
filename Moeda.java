import java.util.Objects;

abstract public class Moeda {
     // Atributo protegido que armazena o valor da moeda
	 protected double valor;

	 
	  // Construtor da classe Moeda que inicializa o valor da moeda
	    public Moeda(double valor) {
	        this.valor = valor;
	    }

	    
	    // Método abstrato que deve ser implementado pelas subclasses para converter a moeda para real
	    public abstract double converterParaReal();

	    
	    // Método sobrescrito da classe Object para retornar uma representação em string da moeda
	    @Override
	    public String toString() {
	        return getClass().getSimpleName() + ": " + valor;
	    }

	    
	    // Getter para obter o valor da moeda
		public double getValor() {
			return valor;
		}

		
		 // Método sobrescrito da classe Object para gerar o hash code da moeda
		@Override
		public int hashCode() {
			return Objects.hash(valor);
		}

		
	    // Método sobrescrito da classe Object para comparar se duas moedas são iguais
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Moeda other = (Moeda) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}
		
}
