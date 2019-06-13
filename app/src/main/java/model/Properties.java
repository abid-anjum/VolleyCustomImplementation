package model;

public class Properties
{
    private String isEditable;

    private String attr;

    private String value;

    public String getIsEditable ()
    {
        return isEditable;
    }

    public void setIsEditable (String isEditable)
    {
        this.isEditable = isEditable;
    }

    public String getAttr ()
    {
        return attr;
    }

    public void setAttr (String attr)
    {
        this.attr = attr;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isEditable = "+isEditable+", attr = "+attr+", value = "+value+"]";
    }
}

