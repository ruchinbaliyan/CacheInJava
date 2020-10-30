package remaining.subtopics.collections;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Choose  a collection you want to test ");
        System.out.println("1:Map \t 2:Set \t 3:List \t 4:Queue");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                Maps m =new Maps();
                break;


            case 2:
                Sets s =new Sets();
                break;

            case 3:
            case 4:
            default:

        }

    }

}
