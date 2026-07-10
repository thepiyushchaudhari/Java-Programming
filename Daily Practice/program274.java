import java.util. * ;
class program274
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner (System.in);
        String data = null;
        StringX strboj = new StringX(); 
        int iRet = 0; 
        
        System.out.println("Enter string :  ");
        data = sobj.nextLine();

        System.out.println("String is : "+ data);

        iRet = strboj.CountCapital(data);
        System.out.println("Number of Capital characters are : "+iRet);

        iRet = strboj.CountSmall(data);
        System.out.println("Number of Small characters are : "+iRet);

        iRet = strboj.CountDigits(data);
        System.out.println("Number of Digits characters are : "+iRet);

        iRet = strboj.CountSpace(data);
        System.out.println("Number of White Spaces are : "+iRet);

        sobj.close();

    }    
}

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0 , iCount = 0; 
        char Arr [] = str.toCharArray();

        for (i = 0; i < Arr.length; i  ++)
        {
            if (Arr[i] >= 'A' && Arr[i] <= 'Z' )
            {
                iCount++;
            }
        }
        return iCount; 
         
    }

    public int CountSmall(String str)
    {
        int i = 0 , iCount = 0; 
        char Arr [] = str.toCharArray();
        for (i = 0; i < Arr.length; i  ++)
        {
            if (Arr[i] >= 'a' && Arr[i] <= 'z' )
            {
                iCount++;
            }
        }
        return iCount; 
         
    }

    public int CountDigits(String str)
    {
        int i = 0 , iCount = 0; 
        char Arr [] = str.toCharArray();
        for (i = 0; i < Arr.length; i  ++)
        {
            if (Arr[i] >= '0' && Arr[i] <= '9' )
            {
                iCount++;
            }
        }
        return iCount; 
         
    }

    public int CountSpace(String str)
    {
        int i = 0 , iCount = 0; 
        char Arr [] = str.toCharArray();
        for (i = 0; i < Arr.length; i  ++)
        {
            if (Arr[i] == ' ' )
            {
                iCount++;
            }
        }
        return iCount;
    }
}
