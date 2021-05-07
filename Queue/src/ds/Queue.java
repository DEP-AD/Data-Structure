package ds;

public class Queue {

        protected int [] queueArray;

        public void enqueue(int data){
                if(isEmpty()){
                        queueArray=new int[1];
                        queueArray[0]=data;
                }else{
                        int [] qTemp = new int[queueArray.length+1];
                        for (int i = 0; i < queueArray.length; i++) {
                                qTemp[i]=queueArray[i];
                        }
                        qTemp[qTemp.length-1]=data;
                        queueArray=qTemp;
                }
        }

        public void dequeue(){
                if(isEmpty()){
                        System.err.println("Can`t dequeue from empty queue");
                        return;
                }else if(queueArray.length==1){
                        queueArray=null;
                        return;
                }
                int [] temp=new int[queueArray.length-1];
                for (int i = 0; i < temp.length; i++) {
                        temp[i]=queueArray[i+1];
                }
                queueArray=temp;

        }

        public boolean isEmpty(){
            return queueArray==null ;
        }

        public int peek() {
                if(isEmpty()){
                        throw new RuntimeException("Queue is empty");
                }
                return queueArray[queueArray.length-1];
        }

        public int size(){
            return queueArray==null ? 0 : queueArray.length;
        }

        public void print(){
                if(isEmpty()){
                        System.out.println("[]");
                        return;
                }
                System.out.print("[");
                for (int i = queueArray.length-1; i >=0; i--) {
                        System.out.print(queueArray[i]+", ");
                }
                System.out.println("\b\b]");
        }

        public boolean contains(int number){
                if(isEmpty()){
                        return false;
                }
                for (int i = 0; i < queueArray.length; i++) {
                        if(queueArray[i]==number){
                                return true;
                        }
                }
            return false;
        }

        public void clear(){
                queueArray=null;
        }
}
