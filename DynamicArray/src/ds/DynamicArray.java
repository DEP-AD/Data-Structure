package ds;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray {

    private int [] DynamicArray;

    public void add(int a){
        int [] tempArray=new int[1];
        tempArray[0]=a;
        DynamicArray=tempArray;

    }

    public void add(int a, int b){

    }

    public void remove(int index){

    }

    public int get(int index){
        return 0;
    }

    public void print(){
        System.out.println(Arrays.toString(DynamicArray));
    }

    public void clear(){
        DynamicArray=null;

    }

    public int size(){
        return DynamicArray.length;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean isEmpty(){
        return false;
    }


}
