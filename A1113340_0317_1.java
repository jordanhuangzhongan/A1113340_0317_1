import java.util.Scanner;

public class A1113340_0317_1
{
    public static void main (String [] args)
    {
        System.out.println("enter n & m = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int [][] paper = new int [n][m];

        for (int row = 0; row < paper.length; row++)
       {
            for (int column = 0; column < paper[row].length; column++)
            {
                paper [row][column] = row * column;
                System.out.print(paper[row][column] + "\t");
            }

            System.out.println();
        }
    } 
}