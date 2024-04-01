
package InterpretorPattern;

public class NumberExpression implements Expression
    {
    private int Number;

    public NumberExpression(int Number)// super constructor for the NumberExpression subclass.
        {
        this.Number = Number;
        }

        @Override
        public int Interpret()// implemented the Interpret method so that it returns an integer.
            {
            return Number;
            }
    }