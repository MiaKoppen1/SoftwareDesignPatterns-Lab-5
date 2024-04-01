package DecoratorPattern;

public class ItalicDecorator extends DecorateText
    {
    public ItalicDecorator(Gui text)// super constructor that extends the DecorateText constructor.
        {
        super(text);// allows the user to make the text italic.
        }

    public String GetContent()// modifying the Gui method to make the text italic.
        {
        return "<i>" + super.GetContent() + "</i>";// using HTML italic tags, makes the text italic.
        }
    }
