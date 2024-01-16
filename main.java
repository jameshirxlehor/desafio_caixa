
public class Main
{
	public static void main(String[] args) {
	    double saqueDigitado = 2650;
	    
	    int notaCem = 5;
	    int notaCinquenta = 8;
	    int notaVinte = 6;
	    int notaDez = 9;
	    double saldoCaixa = notaCem*100 + notaCinquenta*50 + notaVinte*20 + notaDez*10;
	    
	    if(saqueDigitado <= saldoCaixa){
	    while(saqueDigitado > 0){
	        saldoCaixa = notaCem*100 + notaCinquenta*50 + notaVinte*20 + notaDez*10;
	        

	        if(saqueDigitado%10 != 0){
	           System.out.println("Valor informado não é multiplo de 10, 20, 50 ou 100");
	           break;
	        
	        }else{
	                
	        if(notaCem > 0 && saqueDigitado%10 == 0 && saqueDigitado >= 100){
	            saqueDigitado = (saqueDigitado - 100);
	            notaCem--;
	             System.out.println("Nota de 100");
	            
	        } else if(notaCinquenta > 0 && saqueDigitado%10 == 0 && saqueDigitado >= 50){
	            saqueDigitado = saqueDigitado - 50;
	            notaCinquenta--;
	             System.out.println("Nota de 50");
	            
	        }else if(notaVinte > 0 && saqueDigitado%10 == 0 && saqueDigitado >= 20){
	            saqueDigitado = saqueDigitado - 20;
	            notaVinte--;
	             System.out.println("Nota de 20");
	            
	        }else if(notaDez > 0 && saqueDigitado%10 == 0 && saqueDigitado >= 10){
	            saqueDigitado = saqueDigitado - 10;
	            notaDez--;
	             System.out.println("Nota de 10");
	            
	        }
	        }
	      
	        
	    }
	    }else{
	           System.out.println("Notas insuficiêncientes para realizar o saque");
	                
	       }
	    System.out.println("\nNotas disponíveis no caixa: ");
		System.out.println("Notas de 100 = "+ notaCem +"\nNotas de 50 = " + notaCinquenta + " \nNotas de 20 = " + notaVinte + " \nNotas de 10 = " + notaDez);
	    System.out.println("\nValor total disponivel no caixa = " + saldoCaixa);
	    
	}
}
