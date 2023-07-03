import java.util.Arrays;

public class MyQueue {
    Object [] list = new Object[10];
    public Object[] add(Object value){
        list[list.length -1] = value;
        return list;
    }
    public Object [] clear(){
        return new Object[list.length];
    }
    public int size(){
        return list.length;
    }
    public Object peek(){
        return list[0];
    }
    public Object poll(){
        Object [] newList = new Object[list.length-1];
        for (int i = 0; i < list.length; i++) {
            if (i != 1){
                newList[i] = list[i];
            }
        return list[0];
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(Arrays.toString(myQueue.add("lol")));
        System.out.println(Arrays.toString(myQueue.clear()));
        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());

    }

}
