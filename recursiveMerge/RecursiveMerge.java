
package recursivemerge;



import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class RecursiveMerge {

    public static void main(String[] args)
    {
        Integer[] numbers = new Integer[100];
        Random rand = new Random();
       
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(numbers));
      
        List<Integer> result = MergeSort.mergeSort(Arrays.asList(numbers));

        System.out.println("Sorted List");

        for(Integer each : result) System.out.print(each + ", ");

        System.out.println();

    } 	
}
