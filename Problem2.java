//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.Arrays;
import java.util.List;

public class Problem2{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(12,23,15,19,56,46,89,18);
        list.stream()
            .map(String::valueOf)
            .filter(n -> n.startsWith("1"))
            .forEach(System.out::println);
    }
}