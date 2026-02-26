
import java.util.Arrays;
import java.util.Scanner;



public class DAY1Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String name[] = {"tarak", "Reddy", "comeback"};

        //System.out.println(name);

        Arrays.sort(name);
        int size = name.length;
        System.out.println("size  of array is " + size);

    
        Arrays.fill(name, "tarak");

        name[1] = "get";

        for(int i = 0;  i < name.length; i++){
            System.out.println(name[i]);
        }

        String[] fruits;
        int sizeoffruits;
        
        System.out.println("enter the # of fruits: ");
	    sizeoffruits = sc.nextInt();
	    sc.nextLine(); //for scannerbuffer in intput
	
	fruits = new String[sizeoffruits];
	
	for(int a = 0; a<fruits.length; a++){
		System.out.println("enter the fruit name: ");
		fruits[a] = sc.nextLine();
	}


    Arrays.sort(fruits);

    for(int b =0; b<fruits.length;b++){
        System.out.println(fruits[b]);
    }




    }	
}
