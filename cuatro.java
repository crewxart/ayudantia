import java.util.Scanner;
import java.util.Random;
public class cuatro {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand = new Random();
		int x= rand.nextInt(999) + 1;
		int n;
		System.out.println("Ingrese un n�mero entre 1 y 999: ");
	    n= sc.nextInt();
		do {
	    
	    if (n<x) {System.out.println("El n�mero a descubrir es MAYOR");
	    n=sc.nextInt();
	    }
	    if (n>x) {System.out.println("El n�mero a descubrir es MENOR");
	    n=sc.nextInt();
}
	    
		}while(x != n);
		System.out.println("Has acertado! El n�mero es: "+x);

	    
	}
}
