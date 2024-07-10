// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b & a>c){
            System.out.println(a);
            
        }else if(b>a && b>c){
            System.out.println(b+ "b");
        }else{
            System.out.println(c);
        }
    }
}
