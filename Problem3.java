//The first program
//Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class Problem3{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(12,23,34,45,56,67,78,89,90);
        list.stream()
        .findFirst()
        .ifPresent(System.out::println);
    }
}
