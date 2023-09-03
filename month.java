import java.util.*;
class month
{
    public static void main(String args[])
    {
        int n=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Month Number(1-12) :");
        n=s.nextInt();
        switch (n) {
            case 1:
                System.out.println("Month is Jan");
                break;
            case 2:
                System.out.println("Month is feb");
                break;
            case 3:
                System.out.println("Month is march");
                break;
            case 4:
                System.out.println("Month is april");
                break;
            case 5:
                System.out.println("Month is may");
                break;
            case 6:
                System.out.println("Month is Jun");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is aug");
                break;
            case 9:
                System.out.println("Month is sep");
                break;
            case 10:
                System.out.println("Month is oct");
                break;
            case 11:
                System.out.println("Month is nov");
                break;
            case 12:
                System.out.println("Month is dec");
                break;
            default:
                System.out.println("invalid choice..");
                break;
        }
    }
}