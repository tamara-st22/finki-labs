import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] niza=new int[100];
        int n=sc.nextInt();
        int suma=0;

        for(int i=0;i<n;i++)
        {
            niza[i]=sc.nextInt();
        }
        System.out.print("{");
        for(int i=0;i<n;i++)
        {
            System.out.print(niza[i]);
            if(i!=n-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

        for(int i=0;i<n;i++)
        {
            suma=suma+niza[i];
        }
        double avg=(double)suma/n;

        boolean flag=false;
        System.out.print("{");
        for(int i=0;i<n;i++)
        {
            if(niza[i]>=avg)
            {
                if(flag)
                {
                    System.out.print(",");
                }
                System.out.print(niza[i]);
                flag=true;
            }
        }
        System.out.print("}");
    }
}