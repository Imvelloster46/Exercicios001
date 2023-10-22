public class e001{
public static void main(String[] args){
    System.out.println("Construindo um vetor com 25 valores: ");
    // Declarando um vetor de 25 ints.
    int valores[];

    // Construindo um array.
    valores = new int[25];

    for(int i = 0; i < valores.length; i++){
        valores[i] = (i + 1);
    }
    for(int i = 0; i < valores.length; i++){
        System.out.println(valores[i]);
    }
}
}