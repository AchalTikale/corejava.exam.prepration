package oops.problem.lamda;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
//Sum of Two Integers
//Create a lambda expression that calculates the sum of two integers.
// The lambda should take two integers as input and return their sum.
@FunctionalInterface
interface sumOfTwoNumber
{
    int sum(int num1,int num2);
}
public class SumOfTwoInteger
{
    public static void main(String[] args)
    {
        //by using normal lambda
        sumOfTwoNumber addition=(x,y)->x+y;
        System.out.println(addition.sum(5,6));

        //by using biFunction predefined interface
        BiFunction<Integer,Integer,Integer> sumUsingBiFunction=(num1,num2)->
                num1+num2;

        System.out.println(sumUsingBiFunction.apply(2,3));

        //by using biConsumer predefined interface
        BiConsumer<Integer,Integer>sumUsingBiConsumer=(x,y)-> System.out.println(x+y);
        sumUsingBiConsumer.accept(5,5);


    }


}
