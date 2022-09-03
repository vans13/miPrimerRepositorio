
package empleado;

import java.util.Scanner;
public class Salario {
    public static void main(String[] args){
        
        calculaSueldo();
    }
    public static void calculaSueldo() {
        Scanner sc=new Scanner(System.in);
        float horasE, horasN;
        boolean continua=true;
        String nombre;
        
        while(continua){
            
            System.out.println("Nombre del Empleado");
            nombre=sc.next();
            System.out.println("Horas Normales");
            horasN=sc.nextFloat();
            System.out.println("Horas Extras");
            horasE=sc.nextFloat();
            Empleado obj=new Empleado(nombre, horasN, horasE);
            float sueldo=obj.calcular();
            System.out.println("El sueldo es= "+sueldo);
            System.out.println("¿Desea calcular otro nombre? s/n");
            continua=(sc.next()=="s");
        }
    }
}
