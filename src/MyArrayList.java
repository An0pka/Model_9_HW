import java.util.Arrays;

public class MyArrayList {
    Object [] list = new Object[10];
    public Object[] add(Object value){
        list[list.length -1] = value;
    return list;
    }
    public Object[] remove(int index){
        Object [] newList = new Object[list.length-1];
        for (int i = 0; i < list.length; i++) {
            if (i != index){
                newList[i] = list[i];
            }

        }return newList;
    }
    public Object [] clear(){
        return new Object[list.length];
    }
    public int size(){
        return list.length;
    }
    public Object get(int index){
        return list[index];
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println(Arrays.toString(myArrayList.add("lol")));
        System.out.println(Arrays.toString(myArrayList.remove(9)));
        System.out.println(Arrays.toString(myArrayList.clear()));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(4));
    }
}
