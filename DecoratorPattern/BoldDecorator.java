package DecoratorPattern;

public class BoldDecorator extends DecorateText
    {
    public BoldDecorator(Gui text)// super constructor extending DecorateText.
        {
        super(text);// allows the user to modify the text to make it bold.
        }

    public String GetContent()
        {
        return "<b>" + super.GetContent() + "</b>";// using HTML bold tags, changes to text to bold.
        }
    }
