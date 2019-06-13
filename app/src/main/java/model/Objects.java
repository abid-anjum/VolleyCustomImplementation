package model;

public class Objects
{
    private String lastActionTimestamp;

    private String created;

    private String description;

    private String label;

    private String objectId;

    private Properties[] properties;

    private String objectType;

    public String getLastActionTimestamp ()
    {
        return lastActionTimestamp;
    }

    public void setLastActionTimestamp (String lastActionTimestamp)
    {
        this.lastActionTimestamp = lastActionTimestamp;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    public String getObjectId ()
    {
        return objectId;
    }

    public void setObjectId (String objectId)
    {
        this.objectId = objectId;
    }

    public Properties[] getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties[] properties)
    {
        this.properties = properties;
    }

    public String getObjectType ()
    {
        return objectType;
    }

    public void setObjectType (String objectType)
    {
        this.objectType = objectType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lastActionTimestamp = "+lastActionTimestamp+", created = "+created+", description = "+description+", label = "+label+", objectId = "+objectId+", properties = "+properties+", objectType = "+objectType+"]";
    }
}

