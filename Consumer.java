public class Consumer extends Thread{
    private pStack<Character> stack;
    public Consumer(pStack<Character> stack, String name){
        super(name);
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true){
            try{
                char c = stack.pop();
                System.out.println("Thread "+this.getName()+" pops char "+c);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

