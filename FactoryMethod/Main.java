//Factory Method(Virtual Constructor)

public class Main
    {
    public static void main(String[] args)
        {
        BuildEnclosure Mia = new ElephantBuilder();// building a new elphant enclosure...
        Mia.VisitEnclosure();// Mia gets to visit the elephant enclosure.

        BuildEnclosure Gigi = new FishBuilder();// building a new fish dome...
        Gigi.VisitEnclosure();// Gigi gets to visit the Fish Dome.

        BuildEnclosure Angelo = new GiraffeBuilder();
        Angelo.VisitEnclosure();

        BuildEnclosure Trudy = new TigerBuilder();
        Trudy.VisitEnclosure();

        BuildEnclosure Jeweliana = new PenguinBuilder();
        Jeweliana.VisitEnclosure();
        }
    }