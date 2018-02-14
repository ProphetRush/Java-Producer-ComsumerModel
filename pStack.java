import java.util.LinkedList;

public class pStack<T>{
    private LinkedList<T> os = new LinkedList<>();
    private final int maxSize = 200;


    public synchronized void push(T t) {
        while(os.size()>maxSize){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        os.addLast(t);

    }


    public synchronized T pop() throws Exception {
        while(os.isEmpty()){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notifyAll();
        T t = peek();
        os.removeLast();

        return t;
    }


    public T peek() throws Exception {
       if(os.isEmpty()) throw new Exception("Stack is Empty.");
       return os.getLast();
    }


    public Boolean empty() {
        return os.isEmpty();
    }


    public int search(Object o) {
        return os.size()-os.indexOf(o);
    }
}
