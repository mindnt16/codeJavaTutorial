import java.util.ArrayList;
public class ArrayLiseDemo1 {
    public static void main(String[] args) {
        ArrayList nameList = new ArrayList<>();
        nameList.add("Ball");
        nameList.add("Java");
        nameList.add("Micro");
        System.out.println("The ArrayLits has "+nameList.size()+" objects stored in it. ");
        for(int index = 0; index < nameList.size(); index++){
            System.out.println(nameList.get(index));
        }
    }
}
