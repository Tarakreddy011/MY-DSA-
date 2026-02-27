import java.util.Scanner;

public class Day2Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] goods;
        int lengthofgoods;
        String yorn;
        String y = "y";

        System.out.print("enter the total nomber of item u like to add :");
        lengthofgoods = scanner.nextInt();

        scanner.nextLine();

        goods = new String[lengthofgoods];

        for(int i = 0; i < goods.length; i++){
            System.out.print("Etert the items u like to storer :");
            goods[i] = scanner.nextLine();
        }

        System.out.print( "print y to ckeck the array: and n to not ");
        yorn = scanner.nextLine();
        if (yorn.equals(y)){
            for(int j=0; j < goods.length; j++ ){
                System.out.println(goods[j]);
            }
        } else {
            System.out.print("Entered no ");
        }

    }
}
