import java.util.Random;

public class Producer extends Thread{
    private pStack<Character> stack;
    public Producer(pStack<Character> stack, String name){
        super(name);
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true){
            char c = (char) (Math.random()*('Z'-'A'+1)+'A');

            System.out.println("Thread "+this.getName()+" push char "+c);
            stack.push(c);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException E){
                E.printStackTrace();
            }
        }

    }
}
