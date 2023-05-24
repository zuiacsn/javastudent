package 顺序表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OrderList {
    int size = 0;
    int capacity = 10;
    int [] arr;

    public OrderList(int value){
        capacity = value;
        arr = new int[capacity];
    }

    public boolean isFull(){
        return capacity == size;
    }

    public void addCapacity(){
            arr = Arrays.copyOf(arr,capacity*2);
    }
}

class Test{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str1 = "";

        list.toString();
     }
}