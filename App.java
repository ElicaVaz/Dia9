
package Dia9;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        float valorCompra = leitor.nextFloat();
        
        float parcela = valorCompra/5;
        
        System.out.println("O valor de cada prestação será de R$" + parcela);
        
        
    }
}
