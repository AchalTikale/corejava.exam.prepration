package oops.problem.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//Problem 4: Filter Even Numbers from a List
//Develop a lambda expression that filters out even numbers from a list of integers.
// The lambda should take a
// list of integers as input and return a new list containing only the even numbers.
public class FilterEvenNumberFromList
{
    public static void main(String[] args)
    {
        List<Integer>listOfNumbers=List.of(1,2,34,55,77,6,8);
        List<Integer>listOfEvenNumbers=new ArrayList<>();

        Function<List<Integer>,List<Integer>>biFunction=(x)->
        {
            for (Integer num:listOfNumbers)
            {
//                Predicate<Integer>predicate=(y)->y%2==0;
//                boolean isEven = predicate.test(num);
//                if(isEven)
//                {
//                    listOfEvenNumbers.add(num);
//                }

                if(num%2==0)
                {
                    listOfEvenNumbers.add(num);
                }
            }
            return listOfEvenNumbers;
        };
        biFunction.apply(listOfNumbers);
        System.out.println(listOfEvenNumbers);

//Predicate<Integer> isEven = n ->n%2==0;
//
//        listOfNumbers.forEach(x->
//        {
//            if(isEven.test(x))
//            {
//               listOfEvenNumber.add(x);
//           }
//
//        });



    }
}
