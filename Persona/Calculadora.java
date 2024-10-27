import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] arg){
        
        String cadena1 = "hola ";
        String cadena2 = "mundo";
    
        System.out.println(cadena1 + cadena2);
        
        //la suma de 5 + 10 = 15
        int num1 = 5;
        int num2 = 10;
        
        System.out.println(num1 + num2+" = "+num1+" + "+num2 + " = "+num1+num2);
        
        //Introducir valores por consolar
        //Crea una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Ingresar un valor por consolar
        System.out.println("Ingrese un nombre, y edad, apellido");
        String nombre = sc.next();
        int edad = sc.nextInt();
        String apellido = sc.next();
    
        System.out.println(nombre + " "+edad+" "+apellido);
        
        if(edad >= 18){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
    }
}
