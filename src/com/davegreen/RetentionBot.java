package com.davegreen;

import java.util.*;

public class RetentionBot
{
    SimUnit simUnit = new SimUnit("Retention");
    
    public RetentionBot(ArrayList rList)
    {
        rList.add(simUnit);
        int powerUse = simUnit.powerUse();
    
        System.out.println("Retention Bots created. " + powerUse);
    }
}
