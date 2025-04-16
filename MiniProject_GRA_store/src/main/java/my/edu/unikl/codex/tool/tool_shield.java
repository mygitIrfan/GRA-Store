package my.edu.unikl.codex.tool;

public class tool_shield extends codex_Tool {
    private int defense;
    private double size;
//    private String variation;
    
    public tool_shield(String name, int value, double weight, double durability,
                       int defense, double size)
    {
        super(name, value, weight, durability);
        this.defense = defense;
        this.size = size;
    }
    
    public int getDefense()
    {
        return defense;
    }
    
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    
    public double getSize()
    {
        return size;
    }
    
    public void setSize(double size)
    {
        this.size = size;
    }
}
