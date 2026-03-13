package Stack;

import java.util.Arrays;

public class Main {

    int top,max;
    int a[] ;
    Main(int size){
        max=size;
        a = new int[max];
        top = -1;
    }
    void push(int ele){
        if(top==max-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        a[top]=ele;

    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Deleted Element: "+ a[top]);
        top--;
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Topmost Element: "+ a[top]);
    }
    void display(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        for(int i = top; i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();   
    }

    public static void main(String[] args) {
        Main m1 = new Main(10);
        m1.display();
        m1.push(2);
        m1.push(4);
        m1.push(9);
        m1.push(1);
        m1.display();
        
        m1.peek();
        m1.pop();
        m1.display();

        
    }
}
