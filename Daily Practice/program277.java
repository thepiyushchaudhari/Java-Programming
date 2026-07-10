import java.util. * ;        //inbuilt library
import Marvellous.StringX ; // user defined library
 
class program276
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

        iRet = strboj.CountSpace(data);
        System.out.println("Number of Special Symbols are : "+iRet);

        sobj.close();

    }    
}


