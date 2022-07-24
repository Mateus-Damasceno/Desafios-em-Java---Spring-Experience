// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){
 
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
	     
	   // TODO: complete os espaços em branco com sua solução para o problema
      
            double media = ((2.0*a)+(3.0*b)+(5.0*c))/10.0;
          
              System.out.println(String.format("%,.1f", media));

              
            cont++;
            }
           
            
            
          
            
        
    }
}
