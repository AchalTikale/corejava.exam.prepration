package oops.problem.lamda.customFunctional.InterfacesForDataProcessing;

import java.util.List;
import java.util.stream.Collectors;

public class DataProcessing
{
    public  static List<Integer> applyProcessor(DataProcessor processor,List<Integer> data)
    {
        return processor.process(data);
    }
    public static void main(String[] args)
    {
        List<Integer>integerList=List.of(1,3,5,8,2,9);

        DataProcessor DoublingProcessor=x->x.stream().map(y->y*2).collect(Collectors.toList());
        List<Integer> list1 = applyProcessor(DoublingProcessor,integerList);
        System.out.println(list1);

        DataProcessor FilteringProcessor=x->x.stream().filter(y->y<8).collect(Collectors.toList());
        List<Integer> list2 = FilteringProcessor.process(integerList);
        System.out.println(list2);

    }
}
