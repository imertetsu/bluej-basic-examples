
/**
 * Write a description of class Prueba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    public static void main(String[] args){
        /**
         * Tipos de datos mas utilizados
        */
        byte num = (byte) 128;
        System.out.println(num);
        short num1 = (short)32768;
        int num2 = 10;
        long num3 = 10;
        
        double y = 10.2;
        float floatNumber = 11.63f;
        String cadena = "Hola Mundo";
        boolean esPar = true;
        char caracterA = 'A';
        int[] array1 = new int[10];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        
        int[] array2 = {2,3,4,5,6,7,8,19};
        
        System.out.println(num + " " + cadena); // --> print(variable)
        System.out.println(esPar);
        System.out.println(caracterA);
        System.out.println("Tamanio array1: " + array1.length);
        System.out.println("Tamanio array2: " + array2.length);
        
        mostrarArreglo(array1);
        mostrarArreglo(array2);
        /*
        for(int value: array2){
            System.out.println(value);
        }   
        */
    }
    
    public static void mostrarArreglo(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
