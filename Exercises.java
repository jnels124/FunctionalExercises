import java.util.List;
/**
 * This is a class consisting of functional programming exercises
 * 
 * @author (Jesse Nelson) 
 * @version (December 1, 2012 : Windows 8(x64) java 1.7 U9)
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
        return values.size() == 0 ? 
               0 : head(values) + sum(nextList(values));
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
        return values.size() == 0 ? 
               1 : head(values) * product(nextList(values));            
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
        return toExamine.indexOf(sub) == -1 ? 
               0 : 1 + strCount(toExamine.substring(toExamine.indexOf(sub) + sub.length()), sub);
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
     * 
     */
    public static boolean groupExists(final List<Integer> numbers, final int target) {
      return target == 0  || (head(numbers) != null) &&
             (groupExists(nextList(numbers), target) || 
              groupExists(nextList(numbers), target-head(numbers)));
    }
    
    /**
     * Retrieve the head of the list
     * 
     * @param numbers list of numbers
     * 
     * @return the head of the list
     */
    private static Integer head(final List<Integer> numbers) {
      return numbers == null || numbers.isEmpty() ? 
             null : numbers.get(0);
    }
    
    /**
     * Gets the next list
     * 
     * @param numbers list of numbers
     * 
     * @return a new list with the 2nd element of numbers as the head
     */
    private static List<Integer> nextList(final List<Integer> numbers) {
      return numbers.size() < 1 ? 
             null : numbers.subList(1, numbers.size());
    }
   
}
