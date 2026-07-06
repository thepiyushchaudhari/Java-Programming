/*
    iRow = 4
    iCol = 4

    expected pattern :-
    a
    b   c
    d   e   f
    g   h   i   j
    
*/


import java.util.*;

class program226
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
        
        if(iRow != iCol)// Filter for diagonal pattern
        {
            System.out.println("Invalid parameters.\nEnter same inputs for Row and Columns.");
            return;
        }
        int i =0, j = 0;
        char ch = '\0';
        
        for(i = 1,ch ='a'; i<=iRow; i++)//ch initialize
        {
           for(j=1 ; j<=i; j++, ch++) //ch increment 
                {
                    System.out.print(ch+"\t");   
                }
            
            System.out.println();
        }
    }

}

