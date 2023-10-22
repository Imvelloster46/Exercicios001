public class e003 {
    public static void main(String[] args) {
        System.out.println("Soma os valores do vetor: ");
        int valor[] = {4, 5, 6, 7, 9, 10, 15};

        int soma = 0;

         for(int i = 0; i < valor.length; i++){
            soma = soma + valor[i];
            // ou soma += valor[i];
         }
         System.out.println("A soma dos valores do vetor é: " + soma);
    }
}
