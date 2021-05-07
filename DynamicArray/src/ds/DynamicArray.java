package ds;

import java.util.Arrays;

public class DynamicArray {

    private int [] dynamicArray;

    public void add(int number){
        add(size(),number);
       /** if(isEmpty()) {
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
        }*/
    }

    public void add(int index, int number){
        if(index>size() || index<0){
            throw new RuntimeException("Invalid array index");

        }
        //method 1
        /**int [] tempArray=new int[size()+1];
        for (int i = 0; i < index; i++) {
            tempArray[i]=dynamicArray[i];
        }
        tempArray[index]=number;
        for (int i = index+1; i < tempArray.length; i++) {
                tempArray[i] = dynamicArray[i-1];
        }
        dynamicArray=tempArray;*/


        //method 2
        int [] tempArray=new int[size()+1];
        for (int i = 0; i < tempArray.length; i++) {
            if(i<index) {
                tempArray[i] = dynamicArray[i];
            }else if(i==index) {
                tempArray[index] = number;
            }else tempArray[i]=dynamicArray[i-1];
        }
        dynamicArray=tempArray;

    }

    public void remove(int index){
        if(index>=size() || index<0){
            throw new RuntimeException("Invalid array index");
        }
        int [] tempArray = new int[size()-1];
        //method 1
        /**for (int i = 0; i < size(); i++) {
            if(i<index){
                tempArray[i]=dynamicArray[i];
            }else if(i==index){
                continue;
            }else{
                tempArray[i-1]=dynamicArray[i];
            }
        }*/

        //method 2
        for (int i = 0; i < tempArray.length; i++) {
            if(i<index)
            tempArray[i]=dynamicArray[i];
            else if(i>=index)
                tempArray[i]=dynamicArray[i+1];
        }
        dynamicArray=tempArray;
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
