
package InterpretorPattern;

public class SubtractExpression implements Expression
    {
    private Expression FirstExpression, SecondExpression;

    public SubtractExpression(Expression FirstExpression, Expression SecondExpression)// super constructor for the SubtractExpression subclass.
        {
        this.FirstExpression = FirstExpression;
        this.SecondExpression = SecondExpression;
        }

        public int Interpret()// implemented the Interpreter method to subtract the second expression from the first.
            {
            return FirstExpression.Interpret() - SecondExpression.Interpret();
            }
    }