/*
    iRow = 4
    iCol = 4

    expected pattern :-
    %   %   %   %   %   %
    %                   %
    %                   %
    %                   %
    %                   %
    %   %   %   %   %   %
    
*/

import java.util.*;

class program215
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern ();

        pobj.Display(iValue1, iValue2);

        sobj.close();

    }
}

class Pattern
{
    public void Display(int iRow, int iCol)
    {   

        int i =0, j = 0;
        
        for(i = 1; i<=iRow; i++)
        {
           for(j=1 ; j<=iCol; j++)
                {
                    if(j==1 || j==iCol || i==1 || i==iRow) 
                    {
                        System.out.print("%\t");
                    }
                    // won't print the right pattern since else is removed
                }
            
            System.out.println();
        }
    }

}
    