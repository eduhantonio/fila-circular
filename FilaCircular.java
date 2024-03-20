public class FilaCircular {
    // Atributos
    int[] dados;
    int inicio, fim, tamanho, capacidade;


    FilaCircular(int c){
        inicio = 0;
        fim = 0;
        tamanho = 0;
        capacidade = c;
        dados = new int[capacidade];
    }


    boolean filaCheia(){
        return tamanho == capacidade;
    }


    boolean filaVazia(){
        return tamanho == 0;
    }


    void receberValor(int d){
        if (filaCheia()) {
            System.out.println("A Fila está cheia !");
        } else {
            dados[fim] = d;
            tamanho++;
            fim = (fim + 1) % capacidade;
        }
    }


    void removerValor(){
        if(filaVazia()){
            System.out.println("Fila está Vázia !");
        } else {
            tamanho--;
            inicio = (inicio + 1) % capacidade;
        }
    }


    void listarFila(){
        if(filaVazia()){
            System.out.println("Fila está vazia, nada para mostrar !");
        } else {
            System.out.print("\n[");
            for (int i = 0; i < tamanho; i++){
                System.out.print(" " + dados[(inicio + i) % capacidade]);
            }
            System.out.print(" ] ");
        }
    }  
}
