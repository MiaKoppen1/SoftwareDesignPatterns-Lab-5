package DecoratorPattern;

// my first concrete component class of the Gui class.

public class GuiComponent1 implements Gui
    {
    private String Content;// string to store the content (text)

    public GuiComponent1(String content)
        {
        this.Content = content;
        }

    public String GetContent()// uses the GetContent method from the Gui class.
        {
        return Content;// will retrieve the content.
        }
    }
