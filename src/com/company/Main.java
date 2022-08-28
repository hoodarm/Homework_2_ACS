package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int RESULT = 0;
        int x = 5, y = -7;
        int M = 0;

        if (y < 0)
        {
            y = -y;
            M = -1;
        }
        else
            M = 1;
        while (y > 0)
        {
            if (y % 2 == 0)
            {
                x = x + x;
                y = y / 2;
            }
            else
            {
                RESULT = RESULT + x;
                y = y - 1;
            }
        }
        if (M < 0)
        {
            RESULT = -RESULT;
        }
        System.out.println(RESULT);
    }
}
