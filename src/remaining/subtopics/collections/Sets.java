package remaining.subtopics.collections;



import java.lang.reflect.Method;
import java.util.*;


class SetExecution{

    public void allMethods(Object obj ){
        Class c =obj.getClass();
        Method[] methods = c.getMethods();

        for (Method method : methods) {
            System.out.print(method.getName()+",");

        }

    }

    public void execute(Set<Integer> obj)  {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1:addMultiple values  2:contain(value)?  3:remove(value) 4:clear 5:size 6:printValues  7:exit");
              Integer value;

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter number of values ");
                    int n= sc.nextInt();
                    while(n!=0)
                    {
                            obj.add(sc.nextInt());
                        n--;
                    }


                    continue;

                case 2:
                    System.out.println("check if value is there ");
                    value= sc.nextInt();
                    if(obj.contains(value))
                        System.out.println("yes");
                    else
                        System.out.println("no");

                    continue;
                case 3:
                    System.out.println("enter key ");
                    value= sc.nextInt();
                    obj.remove(value);
                    continue;

                case 4:
                    obj.clear();
                    continue;

                case 5:
                    System.out.println(obj.size());
                    continue;

                case 6:
                    for(int k: obj)
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
public class Sets {

    Sets(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose  a Set you want to test ");
        System.out.println("1:HashSet \t 2:LinkedHashSet \t 3:TreeSet ");
        int choice = sc.nextInt();
        SetExecution ex = new SetExecution();
        switch (choice) {
            case 1:
                Set<Integer> set = new HashSet<>();
//              ex.allMethods(map);
                ex.execute(set);
                break;
            case 2:
                Set<Integer> lset = new LinkedHashSet<>();
                ex.execute(lset);

                break;

            case 3:
                Set<Integer> tset = new TreeSet<>();
                ex.execute(tset);
                break;


            default:
                System.out.println("enter a valid choice ");
                break;

        }
    }


}

