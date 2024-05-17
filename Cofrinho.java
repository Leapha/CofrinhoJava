
import java.util.ArrayList;

public class Cofrinho {
    
	// Declaração de um ArrayList para armazenar objetos do tipo Moeda
		ArrayList<Moeda> moedas;

        // Construtor da classe Cofrinho que inicializa o ArrayList de moedas
       public Cofrinho(){
           moedas = new ArrayList<>();
       }
         // Método para adicionar uma moeda ao cofrinho
       public void adicionar(Moeda moeda) {
           moedas.add(moeda);
       }
       public void listarMoedas() {
           System.out.println("Total de moedas no Cofrinho:");
           for (Moeda moeda : moedas) {
               System.out.println("- " + moeda.getClass().getSimpleName() + ": " + moeda.getValor());
           }
       }
       // Método para calcular o valor total das moedas em Reais
       public double calcularTotalEmReal() {
           double total = 0;
           // Itera sobre cada moeda e soma seu valor convertido para Reais
           for(Moeda moeda : moedas) {
               total += moeda.converterParaReal();
           }
           return total;
       }
       
       // Declaração de um objeto para valor a ser removido
       Object valorremover;  
       
       
         // Métodos para remover as moedas do tipo Euro, Real, Dolar
       public void remover(Dolar dolar) {
           moedas.remove(dolar);
       }
       public void remover(Euro euro) {
           moedas.remove(euro);
           
       }
       public void remover(Real real) {
           moedas.remove(real);
           
       }
       
}
