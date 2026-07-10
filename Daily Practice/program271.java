import java.util. * ;
class program271
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
        System.out.println("Number of capital characters are : "+iRet);

        iRet = strboj.CountSmall(data);
        System.out.println("Number of small characters are : "+iRet);

        sobj.close();

    }    
}

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0 , iCount = 0; 
        
        for (i = 0; i < str.length(); i  ++)
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' )
            {
                iCount++;
            }
        }
        return iCount; 
         
    }

    public int CountSmall(String str)
    {
        int i = 0 , iCount = 0; 
        
        for (i = 0; i < str.length(); i  ++)
        {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' )
            {
                iCount++;
            }
        }
        return iCount; 
         
    }
}
