package DecoratorPattern;

//this is a concrete decorator that extends the DecorateText class. It will modify the size of the text using HTML.

public class SizeDecorator extends DecorateText
    {
    private int size;

    public SizeDecorator(Gui text, int size)// super constructor that extends the DecorateText constructor.
        {
        super(text);// will allow the user to change the size of the text.
        this.size = size;
        }

    @Override
    public String GetContent()// modifying the Gui method to make the text larger or smaller.
        {
        return "<span style=\"font-size:" + size + "px;\">" + super.GetContent() + "</span>";// using the span tag and style attribute from HTML,CSS.
        }
    }
