package model;

public class Metadata
{
    private String take;

    private String totalObjects;

    private String skip;

    public String getTake ()
    {
        return take;
    }

    public void setTake (String take)
    {
        this.take = take;
    }

    public String getTotalObjects ()
    {
        return totalObjects;
    }

    public void setTotalObjects (String totalObjects)
    {
        this.totalObjects = totalObjects;
    }

    public String getSkip ()
    {
        return skip;
    }

    public void setSkip (String skip)
    {
        this.skip = skip;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [take = "+take+", totalObjects = "+totalObjects+", skip = "+skip+"]";
    }
}

