
public class algoritmo_lineal {
	public static void main(String[] args) {
		
int Xi=42,a=33,m=128,c=5;
int res; 
float r;

for (int i=0; i<=50; i++)
{
	res= ((a*Xi)+c)%m;
	Xi=res;
	
	r= res/127;

	System.out.println("El resultado de la semilla es: " + res);
	System.out.println("Variable aleatoria = "+ r);
}

	}


}
