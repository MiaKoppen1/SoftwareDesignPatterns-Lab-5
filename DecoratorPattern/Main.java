package DecoratorPattern;

public class Main 
    {
    public static void main(String[] args)
        {
        Gui text = new GuiComponent1("hello there");

        Gui RedColoredText = new ColorDecorator(text, "red");
        System.out.println(RedColoredText.GetContent());

        Gui GreenColoredText = new ColorDecorator(text, "green");
        System.out.println(GreenColoredText.GetContent());

        Gui ItalicText = new ItalicDecorator(text);
        System.out.println(ItalicText.GetContent());

        Gui BoldText = new BoldDecorator(text);
        System.out.println(BoldText.GetContent());

        Gui BigText = new SizeDecorator(text, 30);
        System.out.println(BigText.GetContent());

        Gui SmallText = new SizeDecorator(text, 5);
        System.out.println(SmallText.GetContent());
        }
    }
