package ds;

public class Queue {
        int [] qArray;

        public void enqueue(int data){
                int [] qTemp = new int[qArray.length+1];
                for (int i = 0; i < qArray.length; i++) {
                        qTemp[i]=qArray[i];

                }
                qTemp[qTemp.length-1]=data;
                qArray=qTemp;
        }

        public void dequeue(){

        }

        public boolean isEmpty(){
            return qArray==null ;
        }

        public int peek() {
            return 0;
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
                        System.out.println(qArray[i]+", ");
                }
                System.out.println("\b\b]");
        }

        public boolean contains(int number){
            return false;
        }

        public void clear(){
                qArray=null;
        }
}
