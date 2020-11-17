package alfredo_mira_adivino;

import java.util.Random;
import java.util.Scanner;

public class Aciertos {

	public static void main(String[] args) {
		
		int n = 0,cont = 0;
		Random r = new Random();
		int abajo= 10;
		int arriba= 50;
        int x = r.nextInt(arriba-abajo) + abajo;
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nIntroduce un valor entre " + abajo + " y " + arriba );
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();

	}

}
