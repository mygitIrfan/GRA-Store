package my.edu.unikl.codex.tool;

public class tool_torch extends codex_Tool {
    private double brightness, light_area;
    private int lifetime;
    
    public tool_torch(String name, int value, double weight, double durability,
                      double brightness, double light_area, int lifetime)
    {
        super(name, value, weight, durability);
        this.brightness = brightness;
        this.light_area = light_area;
        this.lifetime = lifetime;
    }
    
    public double getBrightness()
    {
        return brightness;
    }
    
    public void setBrightness(double brightness)
    {
        this.brightness = brightness;
    }
    
    public double getLightArea()
    {
        return light_area;
    }
    
    public void setLightArea(double light_area)
    {
        this.light_area = light_area;
    }
    
    public int getLifetime()
    {
        return lifetime;
    }
    
    public void setLifetime(int lifetime)
    {
        this.lifetime = lifetime;
    }
}
