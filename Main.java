import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
    //Algaritimo de decisão
    
        int numero1 = 20;
        double numero2 = 0.5;
        System.out.println("Escolha um número entre 1 e 2:" );
Scanner teclado = new Scanner(System.in);
double escolha = teclado.nextDouble(); 

if (escolha == 1 ) {
       System.out.println(numero1);
}else if (escolha == 2 ) {
    System.out.println(numero2);
}else{
    System.out.println("é entre UM E DOIS ANIMAL");
}

teclado.close();

}
}