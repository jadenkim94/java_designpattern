package chapter2;

import java.util.ArrayList;

public class MyStack extends ArrayList<String> {
    public void push(String element){
        add(element);
    }

    public String pop(){
        return remove(size() -1);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("first");
        stack.push("second");
        stack.set(1, "third");

        System.out.println(stack);
        System.out.println(stack.pop()); // third
        System.out.println(stack.pop()); // second 가 나와야 stack 구조라 할 수 있는데 set 을 사용해 직접 접근 해서 stack 이 아니게 됨
    }
}
