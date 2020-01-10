
public class Hello {
	
	public static void main(String args[]){
	
	float salarioMinimo, qtdeKw;
	
		salarioMinimo = Float.parseFloat(args[0]);
		qtdeKw		  = Float.parseFloat(args[1]);
		
		float valorKw = salarioMinimo/700;
		float valorTotal = m * qtdeKw;
		
		float desc = valorTotal * 0.9f; 
		
		System.out.println("Valor 1 Kw R$"+ valorKw);
		System.out.println("Valor Total R$"+ valorTotal);
		System.out.println("Valor com 10% de desconto R$"+ desc);
/*	int v1, v2;
		
		v1 = Integer.parseInt(args[0]);
		v2 = Integer.parseInt(args[1]);
		
		int res = v1 + v2;
		System.out.println("Valor somado= "+ res);
		
	}
*/
}
}
