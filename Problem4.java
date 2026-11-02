//Given a list of integers, find the total number of elements present in the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(12,23,34,45,56,67,78,89,90);
        long count = list.stream().count();
        System.out.println(count);
    }
}