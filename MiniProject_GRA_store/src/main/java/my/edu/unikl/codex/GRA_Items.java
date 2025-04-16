package my.edu.unikl.codex;

import my.edu.unikl.FileHandling.FileIOHandler;
import java.util.*;

public class GRA_Items {
    
    private static int countID = 0;
    public String name;
    private String itemID;
    private int value;
    private double weight, durability;
    private static String[] cat = {"Armor", "Weapon", "Tool", "Potion"};
    
    public GRA_Items(String name)
    {
        setName(name);
        setID(generateID());
        return;
    }
    
    public String generateID()
    {
        itemID = Integer.toString(countID++);
        return itemID;
    }
    
    public void setID(String ID)
    {
        itemID = ID;
    }
    
    public String getID()
    {
        return itemID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String item_name)
    {
        name = item_name;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int item_value)
    {
        value = item_value;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setWeight(double item_weight)
    {
        weight = item_weight;
    }
    
    public double getDurability()
    {
        return durability;
    }
    
    public void setDurability(double item_durability)
    {
        durability = item_durability;
    }
    
}
