import java.util. * ;
class program269
{
    public static void main (String A [])
    {
        Scanner sobj = new Scanner (System.in);
        String data = null;
        StringX strboj = new StringX(); 
        
        System.out.println("Enter string :  ");
        data = sobj.nextLine();

        System.out.println("String is : "+ data);
        strboj.Display(data);

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
