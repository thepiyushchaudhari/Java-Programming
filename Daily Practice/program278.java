import java.util. * ;
class program278
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner (System.in);
        String data = null;
        StringX strboj = new StringX(); 
        String sRet =null;
        
        System.out.println("Enter string :  ");
        data = sobj.nextLine();

        sRet = strboj.Update(data);

        System.out.println("Updated String is : "+ sRet);

        sobj.close();

    }    
}

class StringX
{
    public String Update (String str)
    {
        int i = 0; 

        char Arr [] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == 'A' || Arr[i] == 'a' )
            {
                Arr[i] = '_' ;
            }
        }
        String ret = new String (Arr); 

        return ret ; 

    }
}
