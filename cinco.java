import java.util.Scanner;
public class cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		for(int x=0; x<10; x++) {
			System.out.println("Ingrese el n�mero "+(x+1)+":");
			num[x]=sc.nextInt();
					}
		double auxP=0;
		int p=0;
		int n=0;
		double auxN=0;
		int auxC=0;
		for (int i=0; i<10; i++) {
			if(num[i]>0) {
				auxP+=num[i];
				p++;
			}
			if (num[i]<0) {
				auxN+=num[i];
				n++;
			}
			if (num[i]==0) {
				auxC++;
				
			}
		}
		auxP=auxP/p;
		auxN=auxN/n;
		System.out.println("La media de los n�meros positivos es: "+auxP);
		System.out.println("La media de los n�meros negativos es: "+auxN);
		System.out.println("hay: "+auxC+" ceros");


	}

}
