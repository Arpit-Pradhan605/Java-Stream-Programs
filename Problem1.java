//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.Arrays;
import java.util.List;
public class Problem1{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,23,34,45,56,67,78,89,90);
        list.stream()
        .filter(n -> n%2==0)
        .forEach(System.out::println);
    }
}