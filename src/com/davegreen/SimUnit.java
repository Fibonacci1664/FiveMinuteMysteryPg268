package com.davegreen;

public class SimUnit
{
    String botType;
    
    public SimUnit(String type)
    {
        botType = type;
    }
    
    public int powerUse()
    {
        if("Retention".equals(botType))
        {
            return 2;
        }
        else
        {
            return 4;
        }
    }
}
