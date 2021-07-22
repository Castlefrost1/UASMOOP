package com.example.uasmoop;

public class Castle {
    int[] armies = {0,0,0,0};
    int[] heroesBoost = {0,0,0,0};
    int skin;

    public void addArmies(int type, int number)
    {
        armies[type] = armies[type] + number;
    }

    public int addHeroes(int type)
    {
        int sum = 0;
        for(int i : heroesBoost)
        {
            sum = sum + i;
        }
        if(sum >= 200)
        {
            return 0;
        }

        heroesBoost[type] = heroesBoost[type] + 20;
        return 1;
    }

    public void setSkin(int skin)
    {
        this.skin = skin;
    }

    private int armiesBoost()
    {
        return armies[skin] + ((armies[skin] * 20) / 100);
    }

    public int[] heroesBoost()
    {
        int[] armiesTmp = armies;
        int[] heroesBoost = {0,0,0,0,0};
        for(int i = 0;i < 4;i++)
        {
            armiesTmp[i] = armiesTmp[i]  + ((armiesTmp[i] * heroesBoost[i]) / 100);
        }
        armiesTmp[skin] = armiesTmp[skin] + armiesBoost();

        return armiesTmp;
    }

}
