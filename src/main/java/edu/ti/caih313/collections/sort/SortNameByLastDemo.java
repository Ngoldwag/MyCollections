package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.NameByLast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNameByLastDemo {
    public static void main(String...args) throws IllegalAccessException {
        NameByLast nameArray[]={
                new NameByLast("John","Smith"),
                new NameByLast("Karl","Ng"),
                new NameByLast("Jeff","Smith"),
                new NameByLast("Tom","Rich"),
                new NameByLast("Bob","Smith"),
                new NameByLast("Jane","Doe"),
                new NameByLast("Tony","Stork"),
                new NameByLast("Bo","Peep")

        };
        List<NameByLast> nameList = Arrays.asList(nameArray);
        Collections.sort(nameList);
        System.out.println("\n");
        System.out.println("Print sorted naemList");
        PrintGeneric<NameByLast> nameSortDemo = new PrintGeneric<>();
        nameSortDemo.printCollection(nameList);
    }
}
