import java.util.Scanner;

/**
 * Created by zemoso on 19/7/17.
 */
public class MainClass
{

    public static void main(String[] args) {

        SList sl = new SList<String>();

        System.out.println(sl);

        SListIterator<String> sLIter = sl.iterator();

//
        int a;
        Scanner sc = new Scanner(System.in);
        String input;
        outer:while(true){
            System.out.println("enter 1 to insert element :1");
            System.out.println("enter 2 to remove element :2");
            System.out.println("enter 3 to move to next element");
            System.out.println("enter 4 to check it has element :4");
            System.out.println("enter 5 to get the element at specific position:5");
            System.out.println("enter 6 to print the elemnt of list:6");
            System.out.println("enter anythings else to get out");
            a= sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("enter the  elemnt you want to be inserted in the list");
                    //sc.next();
                    input = sc.nextLine();

                    sLIter.insert(input);
                    break;
                case 2:
                    System.out.println("removed");
                    sLIter.remove();
                    break;
                case 3:
                    sLIter.Next();
                    break;
                case 4:
                    System.out.println(sLIter.hasNext());
                    break;
                case 5:{
                    System.out.println("enter the position to excess that element (only integer less than no in list)");
                    a=sc.nextInt();
                    sc.nextLine();
                    System.out.println(sLIter.currentElement(a));
                    break;}
                case 6:
                    System.out.println("list: " + sl);
                    break;
                default:
                    System.out.println("you are out");
                    break outer;

            }

        }

    }
}

