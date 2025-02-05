package oops.problem.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

//Problem 5: Sort List of Strings Alphabetically
//Create a lambda expression that sorts a list of strings in alphabetical order.
// The lambda should take a list of strings as input and return a new list sorted alphabetically.
public class SortingListOfStringsAlphabetically
{
    public static void main(String[] args)
    {

        List<String> stringList=new ArrayList<>();
        stringList.add("Yamina");
        stringList.add("Dadu");
        stringList.add("Achal");
        stringList.add("Zooni");
        stringList.add("Shoheb");

        List<String>newSortedlist=new ArrayList<>();
        Function<List<String>,List<String>>sortedList=x->
        {
            for(String s:stringList)
            {
                newSortedlist.add(s);

            }
            Collections.sort(newSortedlist);
            return newSortedlist;

        }  ;
        sortedList.apply(stringList);
        System.out.println(newSortedlist);

    }
}
