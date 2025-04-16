package my.edu.unikl.codex.weapon;

public class weapon_staff extends codex_Weapon {
    private String element, attack_type;
    private double range, blast_area;
            
    public weapon_staff(String name)
    {        
        super(name);
    }
    
    public String getElement()
    {
        return element;
    }
    
    public void setElement(String element)
    {
        this.element = element;
    }
    
    public String getAttackType()
    {
        return attack_type;
    }
    
    public void setAttackType(String attack_type)
    {
        this.attack_type = attack_type;
    }
    
    public double getRange()
    {
        return range;
    }
    
    public void setRange(double range)
    {
        this.range = range;
    }
    
    public double getBlastArea()
    {
        return blast_area;
    }
    
    public void setBlastArea(double blast_area)
    {
        this.blast_area = blast_area;
    }
    
    @Override
    public String toString() {
        return (
            """
               
            
            Staff
            ==========""" +
            "\nName: " + getName() + 
            "\nWeight: " + getWeight() +
            "\nLength: " + getLength() +
            "\nDamage: " + getDamage() +
            "\nAttack Type: " + getAttackType() +
            "\nRange: " + getRange() +
            "\nBlast Area: " + getBlastArea() +
            "\nMod: " + getMod() +
            "\nDurability: " + getDurability() +
            "\nValue: " + getValue()
        );
    }
}
