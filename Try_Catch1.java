//This program is created by Aryaan Rabara 21CE112
//Github link:Github Link:  https://github.com/21CE112/21CE112_JAVA_PRAC4.git
//Question:Write a program to show the try - catch block to catch the different types of exception.
public class Try_Catch1{

    public static void main(String[] args) {
        int a=0;
        int b=15;
        
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
            System.out.println("This program is created by Aryaan Rabara 21CE112");
                    }
                    
    }
}