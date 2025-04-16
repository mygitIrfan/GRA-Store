package my.edu.unikl.codex.weapon;

/**
 *
 * @author .null
 */
public class weapon_bow extends codex_Weapon {
    private int arrow;
    private double range;
    
    
    public weapon_bow(String name, int value, double weight, double durability,
                      String mod, int damage, double length,
                      int arrow, double range)
    {
        super(name, value, weight, durability, mod, damage, length);
        this.arrow = arrow;
        this.range = range;
    }
    
    public int getArrow()
    {
        return arrow;
    }
    
    public void setArrow(int arrow)
    {
        this.arrow = arrow;
    }
    
    public double getRange()
    {
        return range;
    }
    
    public void setRange(double range)
    {
        this.range = range;
    }
    
    @Override
    public String toString() {
        return (
            """
               
            
            Bow
            ==========""" +
            "\nName: " + getName() + 
            "\nWeight: " + getWeight() +
            "\nLength: " + getLength() +
            "\nDamage: " + getDamage() +
            "\nRange: " + getRange() +
            "\nArrow: " + getArrow() +
            "\nMod: " + getMod() +
            "\nDurability: " + getDurability() +
            "\nValue: " + getValue()
        );
    }
}
