package my.edu.unikl.codex.armor;
import my.edu.unikl.codex.GRA_Items;

public class codex_Armor extends GRA_Items
{
    private String size_wear;
    private int defense;
    private static String[] variation = {"Plate", "Chainmail", "Lamellar"};
    
    public codex_Armor(String name)
    {
        super(name);
    }
    
    //For Armor size
    public String getSizeWear() 
    { 
        return size_wear;
    }
    
    //For Armor defense
    public int getDefense() 
    { 
        return defense;
    }

    //For Armor size
    public void setSizeWear(String size_wear) 
    { 
        this.size_wear = size_wear;
    }
    
    //For Armor defense
    public void setDefense(int defense) 
    {
        this.defense = defense;
    }
    
    @Override
    public String toString() {
        return (
            "\n\nArmor\n=========\n" +
            "Name: " + getName() + 
            "\nWeight: " + getWeight() +
            "\nSize: " + getSizeWear() +
            "\nDefense: " + getDefense() +
            "\nDurability: " + getDurability() +
            "\nValue: " + getValue()
        );
    }
}