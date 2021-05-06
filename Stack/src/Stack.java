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

    public int peek(){
        return stackArray[top];
    }

    public void clear(){
        stackArray[top]=-1;
    }

    public void print(){
        System.out.println("[ ");
        for (int i =0; i<= stackArray.length-1;i++){
            System.out.print(stackArray[top]+",");
        }
        System.out.println("/b]");
    }

}
