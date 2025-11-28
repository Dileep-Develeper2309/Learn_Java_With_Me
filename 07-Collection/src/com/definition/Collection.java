package com.definition;

public class Collection {
    public static void main(String[] args) {
        String def = """
                If we want to represent group of objects the we should go for
                collection.
                """;

        String collectionInterfaces = """
                1) Collection (I)
                2) List (I)
                3) Set (I)
                4) SortedSet(I)
                5) NavigableSet(I)
                6) Queue(I)
                7) Map(I)
                8) SortedMap(I)
                9) NavigableMap(I)
                """;

        String collection = """
                Collection is the root interface of collection framework.
                Collection Interface defines the Most Common Methods which are Applicable for any
                Collection Object.
                """;

        String listInterface = """
                List is the child interface of Collection.
                If we want to represent group of objects where duplicates are allowed and insertion
                order is preserved the we must use List interface.
                """;

        String setInterface = """
                Set is the child interface of Collection.
                If we want to represent group of objects where duplicates are not allowed we must
                use Set.
                Insertion order is not preserved in Set.
                """;

        String sortedSetInterface = """
                SortedSet is the Child Interface of Set.
                If we want to Represent a Group of Individual Objects Without Duplicates According to
                Some Sorting Order then we should go for SortedSet.
                """;

        String navigateSetInterface = """
                NavigateSet is the Child Interface of SortedSet.
                It defines Several Methods for Navigation Purposes.
                """;

        String queueInterface = """
                Queue is the Child Interface of Collection.
                If we want to Represent a Group of Individual Objects Prior to Processing then we
                should go for Queue.
                """;

        String mapInterface = """
                Map is Not Child Interface of Collection.
                If we want to Represent a Group of Objects as Key- Value Pairs then we should go for
                Map Interface.
                Duplicate Keys are Not allowed but Values can be Duplicated.
                """;

        String sortedMap = """
                SortedMap is the Child Interface of Map.
                If we want to Represent a Group of Objects as Key- Value Pairs according to Some
                Sorting Order of Keys then we should go for SortedMap.
                Sorting should be Based on Key but Not Based on Value.
                """;

        String navigableInterface = """
                Navigable is the Child Interface of SortedMap.
                It Defines Several Methods for Navigation Purposes.
                """;

        System.out.println(def);
        System.out.println(collectionInterfaces);
        System.out.println(collection);
        System.out.println(listInterface);
        System.out.println(setInterface);
        System.out.println(sortedSetInterface);
        System.out.println(navigateSetInterface);
        System.out.println(mapInterface);
        System.out.println(sortedMap);
        System.out.println(navigableInterface);

    }
}
