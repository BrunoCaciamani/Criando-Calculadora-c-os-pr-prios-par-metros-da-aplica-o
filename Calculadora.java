public class Calculadora{
	
	public static void main(String args[]){
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[2]);
		
		String operacao = args[1];
		
		double res = 0;
		
		switch(operacao){
			default:
			System.out.println("Operação Inválida");
			break;
			case "+":
				res = x + y;
				System.out.println("O resultado da soma é: " + res);
				break;
			case "-":
				res = x - y;
				System.out.println("O resultado da subtração é: " + res);
				break;
			case "x":
			case "X":
				res = x * y;
				System.out.println("O resultado da multiplicação é: " + res);
				break;
			case ":":
			case "/":
				if(y == 0){
					System.out.println("Não é possível dividir por zero");
				}else{
					res = x / y;
					System.out.println("O resultado da divisão é: " + res);
				}
				break;
				
		}
		
	}
	
}