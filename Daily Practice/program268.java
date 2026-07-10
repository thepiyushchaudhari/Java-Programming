import java.util. * ;
class program268
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner (System.in);
        String str = null;
        program280 strboj = new program280(); 
        
        System.out.println("Enter string :  ");
        str = sobj.nextLine();

        System.out.println("String is : "+ str);
        strboj.Display(str);

        sobj.close();

    }    
}

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recieved String is : "+str);
    }
}
