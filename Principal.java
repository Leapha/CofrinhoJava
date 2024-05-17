import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		 // Cria um Scanner para ler a entrada do usuário
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();   // Cria uma instância de Cofrinho
		
		int opcao;    // Variável para armazenar a opção do usuário
		
		
	    // Exibe o menu de opções para o usuário
		System.out.println("--------------------------");
		System.out.println("Meu Cofrinho:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido em Real");
		System.out.println("0 - Encerrar");
		System.out.println("--------------------------");
		opcao=teclado.nextInt();    // Lê a opção do usuário
		
		
		  // Loop que continua até o usuário escolher a opção de encerrar (0)
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				//Adicionar
				System.out.println("Escolha a moeda a ser adicionada:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                int escolhaMoeda = teclado.nextInt();
                System.out.print("Digite o valor da moeda a ser adicionada: ");
                double valor = teclado.nextDouble();
                
                // Adiciona a moeda ao cofrinho de acordo com a escolha do usuário
                switch (escolhaMoeda) {
                case 1:
                    cofrinho.adicionar(new Dolar(valor));
                    break;
                case 2:
                    cofrinho.adicionar(new Euro(valor));
                    break;
                case 3:
                    cofrinho.adicionar(new Real(valor));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
              
				break;
			
			case 2:
				//Remover
				System.out.println("Escolha a moeda a ser Removida:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                int selecioneMoeda = teclado.nextInt();
                System.out.print("Digite o valor da moeda a ser Removida: ");
                double valorremover = teclado.nextDouble();
                
             // Remove a moeda ao cofrinho de acordo com a escolha do usuário
                switch (selecioneMoeda) {
                case 1:
                    cofrinho.remover(new Dolar(valorremover));
                    break;
                case 2:
                    cofrinho.remover(new Euro(valorremover));
                    break;
                case 3:
                    cofrinho.remover(new Real(valorremover));
                    break;
                default:
                    System.out.println("Opção inválida.");
                }
				
			case 3:
				// listagem de moedas
				 cofrinho.listarMoedas();
				break;
				
			case 4:
				//Total convertido em real
				double totalReal = cofrinho.calcularTotalEmReal();
                System.out.println("Total em reais: R$" + totalReal);
				break;
			case 0:
				//encerrar programa
				System.out.println("--------------------------");
				 System.out.println("Encerrando...");
				 break;
			default:
				System.out.println("Opção invalida! ");
			
			}
			
			  // Exibe o menu de opções novamente após a operação
			System.out.println("--------------------------");
			System.out.println("Meu Cofrinho:");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido em Real");
			System.out.println("0 - Encerrar");
			System.out.println("--------------------------");
			opcao=teclado.nextInt();   // Lê a próxima opção do usuário
			
		}
			
	}

}
