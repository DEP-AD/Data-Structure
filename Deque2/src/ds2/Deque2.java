package ds2;
import ds.Queue;

public class Deque2 extends Queue {
    {

        public  void enqueueRear(int data){
        if(isEmpty()){
            int [] dequeTemp = new int[1];
            dequeTemp[0]=queueArray[0];
            queueArray=dequeTemp;
        }
        int [] dequeTemp = new int[queueArray.length+1];
        for (int i = 0; i < queueArray.length; i++) {
            dequeTemp[i+1]=queueArray[i];
        }
        dequeTemp[0]=data;
        queueArray=dequeTemp;

    }

        public void dequeueFront(){
        if(isEmpty()){
            System.err.println("Can`t dequeue from empty queue");
            return;
        }else if(queueArray.length==1){
            queueArray=null;
            return;
        }
        int [] dequeTemp = new int[queueArray.length+1];
        for (int i = 0; i < queueArray.length; i++) {
            dequeTemp[i]=queueArray[i++];
        }
        queueArray=dequeTemp;

    }


    }
