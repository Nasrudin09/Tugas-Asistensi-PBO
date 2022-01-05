package chapter4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        int [][]position = {{2,3},{2,2},{4,5},{2,1},{6,7},{2,4},{10,20}};
        String [] name = {"a","b","c","d","e","f","g"};

        Graph object = new Graph(position,name,"c");
//        object.viewData();
    }
}