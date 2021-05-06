public class Stack {
    int top=-1;
    int [] stackArray =new int[10];

    public void push (int data){
        stackArray[top++]=data;
    }

    public void pop(){
        top--;
    }

    public boolean empty(){
        top=-1;
        return true;
    }


}
