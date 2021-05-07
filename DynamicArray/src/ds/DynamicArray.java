package ds;

import java.util.Arrays;

public class DynamicArray {

    private int [] dynamicArray;

    public void add(int number){
        if(isEmpty()) {
            int[] tempArray = new int[1];
            tempArray[0]=number;
            dynamicArray=tempArray;
        }else {
            int[] tempArray = new int[dynamicArray.length + 1];
            for (int i = 0; i < dynamicArray.length; i++) {
                tempArray[i] = dynamicArray[i];
            }
            tempArray[tempArray.length - 1] = number;
            dynamicArray = tempArray;
        }
    }

    public void add(int index, int number){

    }

    public void remove(int index){
        

    }

    public int get(int index){
        return 0;
    }

    public void print(){
        System.out.println(isEmpty() ? "[]" : Arrays.toString(dynamicArray));
    }

    public void clear(){
        dynamicArray=null;

    }

    public int size(){
        return isEmpty() ? 0 : dynamicArray.length;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean isEmpty(){
        return dynamicArray==null;
    }


}
