import java.util. * ;
class program281
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner (System.in);
        String data = null;
        StringX strboj = new StringX(); 
        String sRet =null;
        
        System.out.println("Enter string :  ");
        data = sobj.nextLine();

        sRet = strboj.ToUpperX(data);
        System.out.println("Updated String is : "+ sRet);

        sRet = strboj.ToLowerX(data);
        System.out.println("Updated String is : "+ sRet);

        sRet = strboj.Toggle(data);
        System.out.println("Updated String is : "+ sRet);

        sobj.close();

    }    
}

class StringX
{
    public String ToUpperX (String str)
    {
        int i = 0; 

        char Arr [] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char) (Arr[i] - 32);   
            } 
        }
        return new String (Arr);  

    }

    public String ToLowerX (String str)
    {
        int i = 0; 

        char Arr [] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char) (Arr[i] + 32);   
            } 
        }
        return new String (Arr);  

    }

    public String Toggle (String str)
    {
        int i = 0; 

        char Arr [] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char) (Arr[i] + 32);   
            } 

            else        //---ISSUE---
            {
                Arr[i] = (char) (Arr[i] - 32);
            }
        }
        return new String (Arr);  

    }
}
