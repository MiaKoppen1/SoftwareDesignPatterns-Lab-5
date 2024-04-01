// My abstract class for building each enclosure (concrete creators)

public abstract class BuildEnclosure
    {
    // The Factory Method to build an enclosure...
    public abstract Zoo BuildAnEnclosure();

    public void VisitEnclosure()
        {
        Zoo enclosure = BuildAnEnclosure();
        enclosure.visit();
        }

    }