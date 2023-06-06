import java.util.Scanner;
class stringRep
{
    private String str;
    private int n;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the string:");
        str= sc.nextLine();
        n= str.length();
    }

    String find()
    {
        String newstr= "", highstr=""; int max=-1;
        for (int k=0; k<n; k++)
        {
            for (int i=k; i<n; i++)
            {
                char ch= str.charAt(i);
                int count=1;
                for (int j=0; j<newstr.length(); j++)
                    if (newstr.charAt(j)==ch)
                    {
                        count=0;
                        break;
                }
                if (count==0)
                    break;
                else
                    newstr+= ch;
            }
            int a= newstr.length();
            if (a>max)
            {    max= a;
                highstr=newstr;
            }
            newstr="";
        }
        return highstr;
    }

    public static void main()
    {
        stringRep obj= new stringRep();
        obj.input();
        System.out.println("\n"+obj.find());
    }
}
