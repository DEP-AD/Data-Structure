package ds;

public class Queue {

        int [] qArray;

        public void enqueue(int data){
                if(isEmpty()){
                        qArray=new int[1];
                        qArray[0]=data;
                }else{
                        int [] qTemp = new int[qArray.length+1];
                        for (int i = 0; i < qArray.length; i++) {
                                qTemp[i]=qArray[i];
                        }
                        qTemp[qTemp.length-1]=data;
                        qArray=qTemp;
                }
        }

        public void dequeue(){
                if(isEmpty()){
                        System.err.println("Can`t dequeue from empty queue");
                        return;
                }else if(qArray.length==1){
                        qArray=null;
                        return;
                }
                int [] temp=new int[qArray.length-1];
                for (int i = 0; i < temp.length; i++) {
                        temp[i]=qArray[i+1];
                }
                qArray=temp;

        }

        public boolean isEmpty(){
            return qArray==null ;
        }

        public int peek() {
                if(isEmpty()){
                        throw new RuntimeException("Queue is empty");
                }
                return qArray[qArray.length-1];
        }

        public int size(){
            return qArray==null ? 0 : qArray.length;
        }

        public void print(){
                if(isEmpty()){
                        System.out.println("[]");
                        return;
                }
                System.out.print("[");
                for (int i = qArray.length-1; i >=0; i--) {
                        System.out.print(qArray[i]+", ");
                }
                System.out.println("\b\b]");
        }

        public boolean contains(int number){
                if(isEmpty()){
                        return false;
                }
                for (int i = 0; i < qArray.length; i++) {
                        if(qArray[i]==number){
                                return true;
                        }
                }
            return false;
        }

        public void clear(){
                qArray=null;
        }
}
