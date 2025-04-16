package my.edu.unikl.codex.tool;


public class tool_grappling_hook extends codex_Tool {
    private double max_reach, grip_chance;
    
    public tool_grappling_hook(String name, int value, double weight, double durability,
                               double max_reach, double grip_chance)
    {
        super(name, value, weight, durability);
        this.max_reach = max_reach;
        this.grip_chance = grip_chance;
    }
    
    public double getMaxReach()
    {
        return max_reach;
    }
    
    public void setMaxReach(double max_reach)
    {
        this.max_reach = max_reach;
    }
    
    public double getGripChance()
    {
        return grip_chance;
    }
    
    public void setGripChance(double grip_chance)
    {
        this.grip_chance = grip_chance;
    }
}
