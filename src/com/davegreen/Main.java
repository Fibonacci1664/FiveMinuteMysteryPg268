package com.davegreen;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        
        for(int z = 0; z < 20; z ++)
        {
            System.out.println((z + 1));
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}
