package learnjava.lfu;
import learningjava.fifo.*;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter cache size");

        int cacheSize = sc.nextInt();
        // LeastFrequentlyUsedCache cache  = new LeastFrequentlyUsedCache(cacheSize);
        // LFUusingPQ cache =new LFUusingPQ(cacheSize);
        FirstInfirstOutCache cache =new FirstInfirstOutCache(cacheSize);
        String className = cache.getClass().getSimpleName();
        System.out.println("Working with "+className);

        long key,value;
        while(true) {
            System.out.println("1:get ,2:put, 3:exit");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter key");
                    key = sc.nextLong();
                    System.out.println(cache.getValue(key));
                    break;


                case 2:

                    System.out.println("Enter key and value");
                    key = sc.nextInt();
                    value = sc.nextInt();

                    cache.putValue(key, value);
                    break;


                case 3:
                    System.out.println("Exiting");
                    return;



            }
        }


    }
}
