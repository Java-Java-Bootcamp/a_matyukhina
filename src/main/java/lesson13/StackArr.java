package lesson13;

public class StackArr {

    private int size;
    private int[]stackArr;
    private int top;

    public StackArr(int s){
        size = s;
        stackArr = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public void put(int a){
        int i = ++top;
        stackArr[i] = a;
    }
    public int get(){
        if(isEmpty()){
            System.out.println("Стек пустой.");
            return 0;
        }else{
            return stackArr[top];
        }
    }
}
