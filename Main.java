import java.io.File;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        pStack<Character> stack = new pStack<>();
        new Producer(stack, "Producer 1").start();
        new Producer(stack, "Producer 2").start();
        new Producer(stack, "Producer 3").start();
        new Producer(stack, "Producer 4").start();
        new Consumer(stack, "Consumer 1").start();
        new Consumer(stack, "Consumer 2").start();
        new Consumer(stack, "Consumer 3").start();
        new Consumer(stack, "Consumer 4").start();
        new Consumer(stack, "Consumer 5").start();
        new Consumer(stack, "Consumer 6").start();
    }


}
