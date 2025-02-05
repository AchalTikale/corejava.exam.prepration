package oops.problem.lamda;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Problem 2: Check if String is Empty
//Design a lambda expression that checks if a given string is empty.
// The lambda should take a string as input and return a boolean indicating whether the string is empty.
public class CheckingStringIsEmpty
{
    public static void main(String[] args)
    {

        Predicate<String> stringPredicate=(s)->s.isEmpty();
        boolean test = stringPredicate.test("");
        System.out.println("The given String is empty?:"+test);



    }
}
