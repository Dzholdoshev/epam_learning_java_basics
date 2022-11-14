package chapter5_Classes.initializers;
/*
The Java compiler automatically generates the class initialization method
(an internal method with the name <clinit>) for each class:

The method is guaranteed to be called only once when the class is first used or mentioned.
Initialization expressions for class fields are inserted into the class initialization method
in the order in which they appear in the source code. As a result,
previously declared fields of this class can be used in the initialization expression of a class field.
 */
public class InitDemo3 {
    //...
    private static byte by = 17;
private static int ii  = 24 * by;

    //...
}