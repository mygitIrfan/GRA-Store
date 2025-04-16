package my.edu.unikl.codex.potion;
import my.edu.unikl.codex.GRA_Items;

public class codex_Potion extends GRA_Items {
    private String size;
    private int quantity;
    
    public codex_Potion(String name, int value, double weight, double durability,
                        String size, int quantity)
    {
        super(name, value, weight, durability);
        this.size = size;
        this.quantity = quantity;
    }
    
    public String getSize()
    {
        return size;
    }
    
    public void setSize(String size)
    {
        this.size = size;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
