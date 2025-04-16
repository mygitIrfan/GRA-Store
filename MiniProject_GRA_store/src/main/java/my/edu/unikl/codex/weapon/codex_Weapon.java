package my.edu.unikl.codex.weapon;
import my.edu.unikl.codex.GRA_Items;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import my.edu.unikl.FileHandling.FileIOHandler;

public class codex_Weapon extends GRA_Items
{
    private String mod;
    private int damage;
    private double length;
    private static String[] type = {"Sword", "Bow", "Staff"};
    
    public codex_Weapon(String name)
    {
        super(name);
    }
    
    public String getMod()
    {
        return mod;
    }
    
    public void setMod(String mod)
    {
        this.mod = mod;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
}