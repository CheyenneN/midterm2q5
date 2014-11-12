package midterm2q5;

class ComboItem
{
    private int key;
    private String textValue;

    public ComboItem(int key, String value)
    {
        this.key = key;
        this.textValue = value;
    }

    @Override
    public String toString()
    {
        return textValue;
    }

    public int getKey()
    {
        return key;
    }

    public String getValue()
    {
        return textValue;
    }
}