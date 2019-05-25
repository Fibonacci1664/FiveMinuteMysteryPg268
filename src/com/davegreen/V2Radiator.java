package com.davegreen;

import java.util.*;

public class V2Radiator
{
    SimUnit simUnit = new SimUnit("V2Radiator");
    
    
    public V2Radiator(ArrayList list)
    {
    
        for(int x = 0; x < 5; x ++)
        {
            
            list.add(simUnit);
            int powerUse = simUnit.powerUse();
    
            System.out.println((x + 1) + " V2Radiator SimUnit created. " + powerUse);
        }
    }
}
