package com.davegreen;

import java.util.*;

public class V3Radiator extends V2Radiator
{
    SimUnit simUnit = new SimUnit("V3Radiator");
    
    public V3Radiator(ArrayList lgList)
    {
        super(lgList);
        
        for(int g = 0; g < 10; g ++)
        {
            lgList.add(simUnit);
            int powerUse = simUnit.powerUse();
    
            System.out.println((g + 1) + " V3Radiator SimUnit created. " + powerUse);
    
        }
    }
}
