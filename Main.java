import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("==================================");
        System.out.println("MANIPULANDO UMA FILA CIRCULAR");
        System.out.println("==================================");


        System.out.print("\nQuantos itens haverão na fila ?: ");
        int c = scan.nextInt();
        FilaCircular novaFila = new FilaCircular(c);
        int opcao = 0;


        do {
            System.out.println("1° • Adicionar valor");
            System.out.println("2° • Remover valor");
            System.out.println("3° • Listar valores");
            System.out.println("0° • Adicionar valor");
            opcao = scan.nextInt();


            switch (opcao) {
                case 1:
                    if (!novaFila.filaCheia()) {
                        System.out.print("Digite o valor para ser inserido: ");
                        novaFila.receberValor(scan.nextInt());
                    } else  {
                        System.out.println("Lista cheia!");
                    }    
                    break;


                case 2:
                    novaFila.removerValor();
                    break;
               
                case 3:
                    novaFila.listarFila();
                    break;


                default:
                    break;
            }


        } while (opcao != 0);
    }
}
