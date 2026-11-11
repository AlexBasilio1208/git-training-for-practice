package accenture_training;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DataTypes {
    //static variable (owned by the class)
    static int number2;
    public static void main(String[] args) {
        /*
        Types of variable declaration

        1. local/automatic variable (method, constructor, and block)
        2. Instance variables (owned by the object) DataTypes data = new DataType
        3. Class/static variable

        floating
        implicit = whether we like it or not it will happen
        explicit = it will not happen unless we do something

        example = 0.5F: we intentionally put F because we want it to be a float
        by default java in decimal is double. So we need to make an explicit move

        typecasting/ down casting - converting of one data type to another type
            example: float num1 = (float) 1234.123123;
         */

        byte number1 = 50;
        short number2 = 180;
        int number3 = 122_550 + number1 + number2;
        long number4 = (long) 1_598_808 + number3;
        long number5 = 1_500_000L;
        float number6 = 1.567890F;
        float number7 = (float) number5;
        double number8 = 534_123.23123; //widening
        float number9 = (float) number8; //narrowing

        char myChar = 'a'; //if 'aasdads' will have an error since this accepts single characters only
        String myText = "Monday";
        boolean isTrue = false; // logic 1 = true 0 = false

        //converting char to int
        int equivalentinChar = myChar; //no need to typecast since it is implicit

        //ternary operation (not a replacement. but a more compact method only) if having only 2 conditions. if more than, proceed to if else
        String message = (isTrue) ? "\n Yes, it is true" : "\nNo, it is not true"; //format (var)? "true statement": "false statement";
        System.out.println(message); //syntax for output

        boolean oneDayMillionaire = true;

        if (!oneDayMillionaire) { // "!" inverts the original value
            System.out.println("\nBuy everything you want");
        } else {
            System.out.println("\nSave first");
        }

        //String is not a primitive it is a class that is why it is in capital "S"
        String myMessage = new String("this is the updated message");

        /* Introspection (or type introspection) is the ability
        of a program to examine an object's type, properties,
        and methods at runtime
         */

        //example strings
        if (args instanceof String[]) {
            System.out.println("\n args is of type String[]");
        } else {
            System.out.println("\nargs is NOT of type String[]");
        }

        //example object
        // Objects = is the root of the class hierarch
        //oracle api for java guide
        if (args instanceof Object) {
            System.out.println("\n args is of type Object");
        } else {
            System.out.println("\nargs is NOT of type Object");
        }

        //operators

        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = false;

        if (cond1 & cond2 & !cond3) {
            System.out.println("\nTrue for all conditions" + "\n\n" + (cond1 & cond2 & !cond3));
        } else {
            System.out.println("\nFalse");
        }

        //short circuit or lazy method
        /*
        Symbols:
             AND - & or &&
             OR - | or ||
             null = !
         */
        if (cond1 && cond2){
            System.out.println("\nTrue for all AND conditions");
        } else {
            System.out.println("\nFalse");
        }

        if (cond1 | !cond2){
            System.out.println("\nTrue for all  OR conditions");
        } else {
            System.out.println("\nFalse");
        }

        //Compound Assignment
        int numberValue = 5;
        numberValue += 10; // equal to numberValue = numberValue + 10;
        System.out.println("\nThe new value is " + numberValue);

        //other compound assignments
        /*
                += add
                -= subtract
                /= divide
                %= modulo
         */

        //string concatenation
        String valueMessage = "\nThe string value is ";
        valueMessage += numberValue;
        System.out.println(valueMessage);

        //bitwise operator try to use bitwise calculator to validate
        System.out.println("\n8 | 2: " + (8 | 2)); //OR
        System.out.println("\n8 & 2: " + (8 & 2)); //AND

        //assignment codingbat.com
        // 5 problems logic 1 and all problems logic 2
        // read tpointtech.com //link: Jav Tutorial - https://www.tpointtech.com/java-tutorial

        String addedMessage = "\nThis is my added message for my GIT example";
        System.out.println(addedMessage);
    }
}