import java.util.*;
class PairCoding
{
    static void SI()
    {
        Scanner sc=new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        float SimpleInterest = (P*R*T) / 100;

        System.out.println(SimpleInterest);
    }

    static void GCD()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=0;
        for (int i = 1; i <= n1 || i <= n2; i++)
        {
           if (n1 % i == 0 && n2 % i == 0)
           hcf = i;
        }

         System.out.println("The HCF : "+ hcf);
    }


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i;
    System.out.println(" 1: Greatest common divisor ");
    System.out.println(" 2: Simple interest ");
    System.out.println(" 3: Termination of the program ");
    System.out.println();  
            
    lp:while(true)
    {
        System.out.println("Make your choice: ");  
        
        i = sc.nextInt(); 
        switch (i)
        {
            case 1:
            GCD();
            break;
            
            case 2:
            SI();
            break;
            
            case 3:
            break lp;
            
            default:
            System.out.println("Invalid choice! Please make a valid choice. \n\n");
        }

    }
    
}
}

