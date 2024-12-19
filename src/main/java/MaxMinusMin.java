// import 'List' interface from Java's util package/library
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){

        // to check what type is 'nums.get(0)'
        // System.out.println(nums.get(0).getClass().getName());    // Recall: List only takes in Object/Complex data types -- NOT primitives (int, boolean, etc.)
        
        /* utilize Java's built-in Collections.sort() method from java.util library --- if this List was created using ArrayList<>() -- there's an .sort() as well ... */
        // https://stackoverflow.com/questions/20518078/how-to-sort-listinteger
        // https://www.javatpoint.com/java-list-sort-method
        java.util.Collections.sort(nums);

        // after sorting the List in ascending order, index 0 should yield lowest Integer & last index highest Integer ... 
        // & cast to primitive type 'int' as this method return is of 'int' type
        int min = nums.get(0);
        int max = nums.get(nums.size()-1);

        return(max - min);
        // return (nums.get(nums.size()-1) - nums.get(0));     // this works too
    }
}
