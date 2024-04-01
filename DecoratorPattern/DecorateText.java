package DecoratorPattern;

// This is my base decorator class, which will reference the content object

public class DecorateText implements Gui
    {
    protected Gui text;

    public DecorateText(Gui text)
        {
        this.text = text;
        }

    public String GetContent()
        {
        return text.GetContent();
        }
    }
