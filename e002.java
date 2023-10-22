import java.util.Scanner;
public class e002 {
    public static void main(String[] args){
        System.out.println("Dessa vez, o programa pede 5 numeros inteiros e armazena os dados inseridos: ");
        Scanner sc = new Scanner(System.in);

        int valor[] = new int[5];

        for(int i = 0; i < valor.length; i++){
            System.out.println("Informe o " + (i + 1) + "° valor: ");
            valor[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\nOs valores informados foram: \n");
        for(int i = 0; i < valor.length; i++){
            System.out.println(" O " + (i + 1) + "° valor foi: " + valor[i]);
        }
        sc.close();
    }
}
