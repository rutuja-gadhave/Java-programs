import java.util.*;
import java.Exception.*;
public class MagicSquare1 extends Exception {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner keyboard = new Scanner (System.in);
try{
        int [] [] square = new int [4][4];
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                System.out.println("Input value for row " + (row+1) + " column " + (col+1));
                square[row][col] = keyboard.nextInt();
            }
        }

        int [] sumRow = new int [4];
        int [] sumCol = new int [4];

        int sum = 0;

        for (int row = 0; row < 4; row ++)
        {
            for (int col = 0; col < 4; col ++)
            {
                sum = sum + square[row][col];
                sumRow[row] = sum;
            }
            System.out.println("sum row " + row + "\n" + sumRow[row]);
            sum = 0;
        }

        sum = 0;

        for (int col = 0; col < 4; col ++)
        {
            for (int row = 0; row < 4; row ++)
            {
                sum = sum + square[row][col];
                sumCol[col] = sum;
            }
            System.out.println("sum columns " + col + "\n" + sumCol[col]);
            sum = 0;
        }

        int [] sumDiag = new int [4];
        sum = 0;

        for (int row = 0; row < 4; row++)
        {
            for (int col = 3; col > -1; col--)
            {
                sum = sum + square [row][col];
                sumDiag[row] = sum;
            }
            System.out.println("sum diagonal " + row + "\n" + sumDiag[row]);
            sum = 0;
        }

        int [] sumDiag2 = new int [4];
        sum = 0; 

        for (int col = 0; col < 4; col ++)
        {
            for (int row = 3; row > -1; row --)
            {
                sum = sum + square[row][col];
                sumDiag2[col] = sum;
            }
            System.out.println("sum diagonal 2 " + col + "\n" + sumDiag2[col]);
        }

        boolean bool = false;

        int k = 0; int j = 1; 
        do
        {
            if (sumRow[k] == sumRow[j])
            {
                k = j;
                j += 1;
                bool = true;
            }
            else
            {
                bool = false;
                System.out.println("Not a magic square");
                break;
            }
        } while ((k < 4) && (j >- 1));

        k = 0; j = 1;
        do
        {
            if (sumCol[k] == sumRow[j])
            {
                k = j;
                j += 1;
                bool = true;
            }
            else 
            {
                bool = false;
                System.out.println("Not a magic square");
                break;
            }
        } while ((k < 4) && (j >= -1));
}
catch(ArrayIndexOutOfBounds e)
{}

finally{

        String TorF = "";
        if (bool = true)
        {
            TorF = "is";
        }
        else if (bool = false)
        {
            TorF = "is not";
        }

        System.out.println("This " + TorF + " a magic square.");
}

    }


}
