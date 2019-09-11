package hu.terray.andras.java10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UnmodifiableCollectionTest {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3, 4);

        try {
            List<Integer> copyList = List.copyOf(ints);

            copyList.add(5);

        } catch (UnsupportedOperationException e) {
            System.out.println("Collections copy of method returns an unmodifiable collection");
        }

        try {
            Set resultSet = ints
                    .stream()
                    .collect(Collectors.toUnmodifiableSet());

            resultSet.add(5);

        } catch (UnsupportedOperationException e) {
            System.out.println("Also there are Collector implementation results unmodifiable collections");
        }



    }
}
