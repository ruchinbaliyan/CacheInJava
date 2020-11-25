package remaining.subtopics.collections;



import java.lang.reflect.Method;
import java.util.*;


class Execution{

    public void allMethods(Object obj ){
        Class c =obj.getClass();
        Method[] methods = c.getMethods();

        for (Method method : methods) {
            System.out.print(method.getName()+",");

        }

    }

    public void execute(Map<Integer, Integer> obj)  {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1:Put(k,v) 2:Get(key) 3:Remove(key) 4:clear 5:PrintAll 6:printkeys  7:exit");
            Integer key;
            Integer value;

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter value and key ");
                     key = sc.nextInt();
                     value = sc.nextInt();
                    obj.put(key, value);
                    continue;

                case 2:
                    System.out.println("enter key");
                    key = sc.nextInt();
                    System.out.println(obj.get(key));
                    continue;
                case 3:
                    System.out.println("enter key ");
                    key= sc.nextInt();
                    obj.remove(key);
                    continue;

                case 4:
                    obj.clear();
                    continue;

                case 5:
                    System.out.println(obj);
                    continue;

                case 6:
                   for(int k: obj.keySet())
                       System.out.print(k+"\t");

                   continue;


                case 7:
                    return;


                default:
                    System.out.println("enter a valid choice");
                    continue;

            }

        }
    }


        }
public class Maps {

    Maps(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose  a Map you want to test ");
        System.out.println("1:HashMap \t 2:LinkedHashMap \t 3:TreeMap ");
        int choice = sc.nextInt();
        Execution ex = new Execution();
        switch (choice) {
            case 1:
                Map<Integer, Integer> map = new HashMap<>();
//              ex.allMethods(map);
                ex.execute(map);
                break;
            case 2:
                Map<Integer, Integer> lmap = new LinkedHashMap<>();
                ex.execute(lmap);


                break;

            case 3:
                Map<Integer, Integer> tmap = new TreeMap<>();
                ex.execute(tmap);
                break;


            default:
                System.out.println("enter a valid choice ");
                break;

        }
    }


    }

