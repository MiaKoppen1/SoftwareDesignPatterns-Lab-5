package DecoratorPattern;

public class ColorDecorator extends DecorateText
    {
    private String Color;

    public ColorDecorator(Gui text, String Color)// super constructor that extends the DecorateText constructor.
        {
        super(text);// will allow the user to change the color of the text.
        this.Color = Color;
        }

    @Override
    public String GetContent()// modifying the Gui method to allow the user to change the color of the text.
        {
        return "<span style=\"color:" + Color + ";\">" + super.GetContent() + "</span>";// using the span tag and style attribute from HTML, CSS.
        }
    }
