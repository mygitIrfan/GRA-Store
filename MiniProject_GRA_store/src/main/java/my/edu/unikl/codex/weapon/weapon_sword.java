package my.edu.unikl.codex.weapon;

import java.util.*;


public class weapon_sword extends codex_Weapon {
    private int damage_cut, damage_pierce;
    
    public weapon_sword(String name)
    {
        super(name);
    }
    
    public int getDamageCut()
    {
        damage_cut = (int)(getDamage()*0.75);
        return damage_cut;
    }
    
    public void setDamageCut(int sword_damage_cut)
    {
        damage_cut = sword_damage_cut;
    }
    
    public int getDamagePierce()
    {
        damage_pierce =(int)(getDamage()*0.25);
        return damage_pierce ;
    }
    
    public void setDamagePierce(int sword_damage_pierce)
    {
        damage_pierce = sword_damage_pierce;
    }
    
    @Override
    public String toString() {
        ArrayList<Object> swordList = new ArrayList<>(Arrays.asList());
        Collections.addAll(swordList, getID(), getName(), getValue(), getWeight(),
                getDurability(), getMod(), getDamage(),getLength());
        String _csv = swordList.toString()
            .replace("[", "")
            .replace("]", "")
            .replace(" ", "");
        
        return _csv;
    }
}


//        StringBuilder str = new
        
//            """
//            
//            
//            Sword
//            ==========""" +
//            "\nName: " + getName() + 
//            "\nWeight: " + getWeight() +
//            "\nLength: " + getLength() +
//            "\nDamage: " + getDamage() +
//            "\nDamage (cut): " + getDamageCut() +
//            "\nDamage (pierce): " + getDamagePierce() +
//            "\nMod: " + getMod() +
//            "\nDurability: " + getDurability() +
//            "\nValue: " + getValue()
                
            
//        );