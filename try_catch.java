//This program is created by Aryaan Rabara 21CE112
//Github link:Github Link:  https://github.com/21CE112/21CE112_JAVA_PRAC4.git
/*Question:Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions.
 Each ‘catch’ block handles a different type of exception.
  For example the exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’.
 Display a message in the ‘finally’ block.*/
public class try_catch{

    public static void main(String[] args) {
        int a=0;
        int b=15;
        int array[] = new int[5];
        /*the try block will perform the task provided inside it.
        and if there is any error then the catch block will catch it,
        and do whatever is written in catch block.*/
        
        try {
            a = b/a;
        } catch (ArithmeticException e) {
            System.out.println(e);
            a = 5;
            b=15;
            a = b/a;
            System.out.println(a);
          
                    }
                    try {
        
                        array[6] = 10;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                        array[4] = 10;
                        System.out.println(array[4]);
                    }
                     //if the code execute or not but finally block always be execute.
                    finally{
                        System.out.println("This program is created by Aryaan Rabara 21CE112");

                    }
    }
}