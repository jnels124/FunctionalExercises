
/**
 * Write a description of class Exercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercises {
    /**
     * (a) Compute the sum of a List of Integer values. Must use function application 
     * and recursion only. Must not use mutation. Must not use any form of the for or 
     * while loop constructs. Must not use any form of the add, addAll, clear, remove, 
     * removeAll, retainAll, or set methods. Must not have side effects, including changing 
     * the structure of an object pointed to by a parameter. Use tail recursion if possible. 
     * 
     * @param values the values to be added
     * 
     * @return the sum of the integers
     */
    public static Integer sum(final List<Integer> values) {        
        if (i == list.size())
            return 0;
        else
            return list.get(i) + sum(list, i+1);
    
    }
    
    /**
     * (b) Compute the product of a List of Integer values. Must use function application and 
     * recursion only. Must not use mutation. Must not use any form of the for or while loop 
     * constructs. Must not use any form of the add, addAll, clear, remove, removeAll, retainAll, 
     * or set methods. Must not have side effects, including changing the structure of an object 
     * pointed to by a parameter. Use tail recursion if possible. 
     * 
     * @param values the list of integers to be multiplied
     * 
     * @return the product of integers
     */
    public static Integer product(final List<Integer> values) {
        
    }
    
    /**
     * (c) Given a non-null string and a non-empty substring, recursively compute the number of 
     * times that the substring appears in the string, without the substrings overlapping. For 
     * example, strCount("catcowcat", "cat") returns 2. Must use function application and recursion 
     * only. Must not use mutation. Must not use any form of the for or while loop constructs. Must 
     * not have side effects. Use tail recursion if possible. 
     * 
     * @param toExamine the string to be searched
     * 
     * @return the number of non-overlapping occurences of the substring in the string 
     */
    public static Integer strCount(final String toExamine, final String sub) {
        
    }
    
    /**
     * d) Given a List of Integers, determine if it is possible to choose a group of some of 
     * the values such that the group sums to a given target value. 
     * Examples: groupExists({2, 4, 9}, 11) → true
     *           groupExists({2, 4, 9}, 15) → true
     *           groupExists({2, 4, 9}, 8) → false
     *           groupExists({2, 4, 9, 2}, 8) → true
     *            
     * Must use function application and recursion only. Must not use mutation. Must not use any form 
     * of the for or while loop constructs. Must not use any form of the add, addAll, clear, remove, 
     * removeAll, retainAll, or set methods. Must not have side effects, including changing the 
     * structure of an object pointed to by a parameter. Use tail recursion if possible. 
     */
    public static boolean groupExists(final List<Integer> numbers, final int target) {
        
    }
   
}
