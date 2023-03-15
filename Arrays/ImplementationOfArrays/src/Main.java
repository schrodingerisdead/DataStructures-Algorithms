//Some basic Array functions
/* In Java, all arrays are dynamically allocated. (discussed below)
Arrays are stored in contiguous memory [consecutive memory locations].
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
The size of an array must be specified by int or short value and not long.
The direct superclass of an array type is Object.
Every array type implements the interfaces Cloneable and java.io.Serializable.
This storage of arrays helps us randomly access the elements of an array [Support Random Access].
The size of the array cannot be altered(once initialized).  However, an array reference can be made to point to another array.
 */

/*The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want.
The syntax is also slightly different:
 */

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}