package model;

public class AppInfo
{
    private Metadata metadata;

    private Objects[] objects;

    public Metadata getMetadata ()
    {
        return metadata;
    }

    public void setMetadata (Metadata metadata)
    {
        this.metadata = metadata;
    }

    public Objects[] getObjects ()
    {
        return objects;
    }

    public void setObjects (Objects[] objects)
    {
        this.objects = objects;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [metadata = "+metadata+", objects = "+objects+"]";
    }
}
