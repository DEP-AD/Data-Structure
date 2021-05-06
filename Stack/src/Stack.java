public class Stack {
    int index=-1;
    int [] stackArray =new int[10];

    public void push (int data){
        stackArray[index++]=data;
    }

    public void pop(){
        index--;
    }

    public boolean empty(){
        return true;
    }
}
