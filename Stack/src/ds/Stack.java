package ds;

public class Stack {

        private int [] stackArray;

        public void push (int data){
            if(isEmpty()){
                stackArray=new int[1];
                stackArray[0]=data;
            }else{
                int [] temp = new int[stackArray.length+1];
                for (int i = 0; i < stackArray.length; i++) {
                    temp[i]=stackArray[i];
                }
                temp[temp.length-1]=data;
                stackArray=temp;
            }

        }

        public void pop(){
            if(isEmpty()){
                System.err.println("Can`t pop from empty stack");
                return;
            }else if(stackArray.length==1){
                stackArray=null;
                return;
            }
            int [] temp=new int[stackArray.length-1];
            for (int i = 0; i < temp.length; i++) {
                temp[i]=stackArray[i];
            }
            stackArray=temp;
        }

        public boolean isEmpty(){
            return stackArray==null;
        }

        public int size(){
            return isEmpty() ? 0 : stackArray.length;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            return stackArray[stackArray.length-1];
        }

        public void clear(){
            stackArray = null;
        }

        public void print(){
            if(isEmpty()){
                System.out.println("[]");
                return;
            }
            System.out.print("[");
            for (int i = stackArray.length-1; i>=0;i--){
                System.out.print(stackArray[i]+", ");
            }
            System.out.println("\b\b]");

        }

        public boolean contains(int number){
            if(isEmpty()){
                return false;
            }

            for (int i = 0; i < stackArray.length; i++) {
                if(stackArray[i]==number){
                    return true;
                }
            }
            return false;
        }

}
