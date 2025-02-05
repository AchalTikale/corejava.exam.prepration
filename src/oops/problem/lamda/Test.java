package oops.problem.lamda;
interface  test1
{
    String check (String s1,String s2,String s3);
}
public class Test
{
    public static void main(String[] args)
    {
         test1 demo=(x,y,z)->x+y+z;
         System.out.println(demo.check("abc","def","efg"));

    }
}
