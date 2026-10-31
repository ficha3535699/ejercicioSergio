
import java.util.Scanner;
public class salarioneto {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        
        int valorhora,horastrabajadas,salarioneto;
        double salariototal, retefuente;
        
        System.out.print("Ingrese el valor de la hora: $");
        valorhora =teclado.nextInt();
        
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horastrabajadas =teclado.nextInt();
        
        
        salarioneto =horastrabajadas*valorhora;
        System.out.println("El salario neto es: $" + salarioneto);
        
        retefuente =salarioneto*0.05;
        System.out.println("La retencion en la fuente es: $"+ retefuente);
        
        salariototal =salarioneto-retefuente;
        System.out.println("El salario total es: $" + salariototal);
        
    
    }
}
