
/**
 * Write a description of class Strings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Strings
{
    public static void main(String[] args){
        String cadena1 = "Hola mundo"; //"odnum aloH"
        System.out.println(cadena1);
        System.out.println(cadena1.charAt(3));
        System.out.println("El tamanio de esta cadena es: "+ cadena1.length());
        
        for(int i = 0; i < cadena1.length(); i++){
            System.out.print(cadena1.charAt(i) + ", ");
        }
        
        //Ejercicio revertir cadena
        System.out.println("EJERCICIO");
        for(int i = cadena1.length()-1; i >= 0; i--){
            System.out.print(cadena1.charAt(i)+ ", ");
        }
    }
}
