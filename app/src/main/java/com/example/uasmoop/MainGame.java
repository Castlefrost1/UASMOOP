package com.example.uasmoop;

public class MainGame {
    Castle player1 = new Castle();
    Castle player2 = new Castle();

    public MainGame()
    {
        player1.addArmies(1,1000);
        player1.addArmies(0,5000);
        player2.addArmies(1,10000);
        player1.setSkin(1);
        player2.setSkin(0);
        player1.addHeroes(1);
        player2.addHeroes(3);
    }

    public int start()
    {
        int[] player1Power = player1.heroesBoost();
        int[] player2Power = player2.heroesBoost();
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 4; i++)
        {
            sum1 = sum1 + player1Power[i];
            sum2 = sum2 + player2Power[i];
        }
        if(sum1 > sum2)
        {
            return 1;
        }
        else if(sum2 > sum1)
        {
            return 2;
        }
        return 0;
    }

}
