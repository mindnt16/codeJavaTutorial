import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_PSIZE = 4 ;
        int [ ] numbers = new int[ARRAY_PSIZE];
        getValues(numbers);
        System.out.println("Her are the number taht you entered : ");
        showArray(numbers);

    }
    public static void getValues(int[ ] array){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter aseries of " +array.length+ " number. ");
        for(int index = 0; index <  array.length; index++){
            System.out.print("Enter number " +(index + 1) + " : ");
            array[index] = in.nextInt();
           
        }
    }
    public static void showArray(int[ ] array){
        for(int index = 0; index <array.length; index++){
            System.out.println(array[index]+ " ");
        }
    }
}
