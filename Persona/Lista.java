
/**
 * Write a description of class Lista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lista
{
    public static void main(String[] args){
        //Arrays
        int[] array1 = new int[10];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[9] = 15;
        
        int[] array2 = {10, 20, 30, 40, 50, 60};
        System.out.println("Tamanio de la lista es:"+ array2.length);
        
        for(int value: array2){
            System.out.print(value + ", ");
        }
        System.out.println();
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + ", ");
        }
    }
}
