//my Interpreter Pattern Example.
// implements an expression interface that tells how to intepret the situation.
// created an Expression interface, 3 concrete subclasses, and filled out the expressions directly in main.
package InterpretorPattern;

public class Main 
    {
    public static void main(String[] args)
        {
        // creating instances from the Expression interface...
        Expression Example1 = new SubtractExpression(new AddExpression(new NumberExpression(5), new NumberExpression(12)), // (5 + 12)
                              new AddExpression(new NumberExpression(7), new NumberExpression(40))// minus (7 + 40).
                              );
        System.out.println("Example 1: ...");
        System.out.println("Results from Subtracting Both Expressions = " + Example1.Interpret());

        System.out.println("  ");// new line.

        Expression Example2 = new SubtractExpression(new AddExpression(new NumberExpression(16), new NumberExpression(56)), // (16 + 56)
                              new AddExpression(new NumberExpression(32), new NumberExpression(9))// minus (32 + 9).
                                );
        System.out.println("Example 2: ...");
        System.out.println("Results from Subtracting Both Expressions = " + Example2.Interpret());

        System.out.println("  ");// new line.

        Expression Example3 = new SubtractExpression(new AddExpression(new NumberExpression(48), new NumberExpression(423)), // (48 + 423)
                              new AddExpression(new NumberExpression(-568), new NumberExpression(730))// minus (-568 + 730).
                                );
        System.out.println("Example 3: ...");
        System.out.println("Results from Subtracting Both Expressions = " + Example3.Interpret());
        }
    }
