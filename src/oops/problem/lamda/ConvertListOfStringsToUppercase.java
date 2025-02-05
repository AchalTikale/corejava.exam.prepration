package oops.problem.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
//Problem 3: Convert List of Strings to Uppercase
//Formulate a lambda expression that converts all strings in a list to uppercase.
// The lambda should
// take a list of strings as input and return a new list with all strings in uppercase
public class ConvertListOfStringsToUppercase
{
    public static void main(String[] args)
    {
        List<String>stringListWithLowerCase=List.of("achal","pitambar","tikale");
        List<String>stringListWithUpperCase=new ArrayList<>();

            Function<List<String>,List<String>>biusingFunction=(x)->
            {
                for(String str:stringListWithLowerCase)
                {
                    stringListWithUpperCase.add(str.toUpperCase());
                }

              return  stringListWithUpperCase;
            };
            biusingFunction.apply(stringListWithLowerCase);
            System.out.println(stringListWithUpperCase);


        //or
        //List<String> listOfStrings = new ArrayList<String>();
        //        listOfStrings.add("apple");
        //        listOfStrings.add("mango");
        //        listOfStrings.add("orange");
        //        List<String> listOfStringsUpper = new ArrayList<String>();
        //
        //        Function<List<String>, List<String>> function = listOfString ->
        //        {
        //            for (String str : listOfString) {
        //                listOfStringsUpper.add(str.toUpperCase());
        //            }
        //
        //            return listOfStringsUpper;
        //
        //        };
        //        function.apply(listOfStrings);
        //        System.out.println(listOfStringsUpper);

    }
}
