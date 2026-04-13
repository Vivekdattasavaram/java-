import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = 0;
        int item;
        System.out.println("***GRR Hotel***");
        System.out.println("\nGRR Menu Card");
        System.out.println("1.Fried Rice  ");
        System.out.println("2.Fried Noodles ");
        System.out.println("3.Biriyani ");
        System.out.println("4.Juices ");
        System.out.println("5.Water Bottle");
        System.out.println("\n Enter the choice(1-5): ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("1.Chicken rice - 120rs \n 2.Gobi Rice - 90rs \n 3.Egg rice - 100rs");
                System.out.println("Enter the Item(1-3): ");
                item = sc.nextInt();
                switch(item){
                    case 1: price = 120;
                    break;
                    case 2: price = 90;
                    break;
                    case 3: price = 100;
                    break;
                    default: System.out.println("Invalid item"); 
                    return;
                }
                break;
            case 2:
                System.out.println("1.Chicken Noodles - 120rs \n 2.Gobi Noodles - 90rs \n 3.Egg Noodles - 100rs");
                System.out.println("Enter the Item(1-3): ");
                item = sc.nextInt();
                switch(item){
                    case 1: price = 120;
                    break;
                    case 2: price = 90;
                    break;
                    case 3: price = 100;
                    break;
                    default: System.out.println("Invalid item"); 
                    return;
                }
                break;
            case 3:
                System.out.println("1.Chicken Biriyani -120rs \n 2.Egg Biriyani - 90rs");
                System.out.println("Enter the item: ");
                item = sc.nextInt();
                switch(item){
                    case 1: price = 120;
                    break;
                    case 2: price = 90;
                    break;
                    default: System.out.println("Invalid item");
                    return;
                }
                break;
            case 4:
                 System.out.println("1.Lemon Juice -30rs \n 2.Mango shake - 60rs \n 3.Water melon - 50rs");
                System.out.println("Enter the item: ");
                item = sc.nextInt();
                switch(item){
                    case 1: price = 30;
                    break;
                    case 2: price = 60;
                    break;
                    case 3: price = 50;
                    break;
                    default: System.out.println("Invalid item");
                    return;
                }
                break;
                default:System.out.println("Invalid choice");
                return;
        }
        System.out.println("\nenter quantity: ");
       int  quantity=sc.nextInt();
       int total = price*quantity;
       System.out.println("Total Bill= "+total+ "rs");
       System.out.println("***Thank You***");
    } 
}
