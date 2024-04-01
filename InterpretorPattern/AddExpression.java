
package InterpretorPattern;

public class AddExpression implements Expression
    {
    private Expression FirstExpression, SecondExpression;

    public AddExpression(Expression FirstExpression, Expression SecondExpression)// super constructor for my Add Expression class.
        {
        this.FirstExpression = FirstExpression;
        this.SecondExpression = SecondExpression;
        }

        public int Interpret()// implemented the Interpret method to add both of the expressions. 
            {
            return FirstExpression.Interpret() + SecondExpression.Interpret();
            }
    }