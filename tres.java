import java.util.Scanner;
public class tres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el n�mero del d�a (1-30)");
			int dia=sc.nextInt();
		if (dia>=1 && dia<=30) {
			System.out.println("Ingrese el n�mero del mes (1-12)");
			int mes=sc.nextInt();
			if(mes>=1 && mes<=12){
				System.out.println("Ingrese el n�mero de a�o(XXXX)");
						int a�o=sc.nextInt();
					System.out.println("La fecha es CORRECTA: "+dia+"/"+mes+"/"+a�o);	
			}
		}
		
	}

}
