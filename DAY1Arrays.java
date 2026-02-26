
import java.util.Arrays;



public class DAY1Arrays {
    public static void main(String[] args) {
    
        String name[] = {"tarak", "Reddy", "comeback"};

        //System.out.println(name);

        Arrays.sort(name);
        int size = name.length;
        System.out.println("size  of array is " + size);

    
        name[1] = "get";

        for(int i = 0;  i < name.length; i++){
            System.out.println(name[i]);
        }

        

    }
    
}
