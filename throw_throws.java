//This program is created by Aryaan Rabara 21CE112
//Github Link:  https://github.com/21CE112/21CE112_JAVA_PRAC4.git
//Questions:Write a program to to generate user defined exception using “throw” and “throws” keyword.
public class throw_throws {
    //The Keyword throws is used to throw an error by a function. 
    //and the keyword throw is used to throw the specific error by that function 
    public void error(int a,int b) throws ArithmeticException,ClassNotFoundException
    {
        if(b==0)
        {
        throw new ArithmeticException("Can't divide by 0");
        }
        else
        {
            throw new ClassNotFoundException("Class not found");
        }
    }
    public static void main(String[] args) {
        throw_throws t = new throw_throws();
        int a = 15;
        int b = 3;
        try
        {
            t.error(a, b);
        }
        catch(ArithmeticException e)
        {
           System.out.println(e.getMessage()); 
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.out.println("This program is created by Aryaan Rabara 21CE112");
        }
    }
}
