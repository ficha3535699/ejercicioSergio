
import java.util.Scanner;
public class salarioneto {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        
        int valorhora,horastrabajadas,salarioneto;
        double salariototal, retefuente;
        
        System.out.println("ingrese el valor de la hora");
        valorhora =teclado.nextInt();
        
        System.out.println("ingrese la cantidad de horas trabajadas");
        horastrabajadas =teclado.nextInt();
        
        
        salarioneto =horastrabajadas*valorhora;
        System.out.println("el salario neto es:" + salarioneto);
        
        retefuente =salarioneto*0.05;
        System.out.println("la retencion en la fuente es:"+ retefuente);
        
        salariototal =salarioneto-retefuente;
        System.out.println("el salario total es:" + salariototal);
        
    
    }
}
