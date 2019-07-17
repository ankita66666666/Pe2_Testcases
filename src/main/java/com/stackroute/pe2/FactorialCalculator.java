package com.stackroute.pe2;

public class FactorialCalculator
{
    public int intFactorial(int number)
    {
      int sum=0;
      if(number<=12)
      {
          for(int i=1;i<=number;i++)
          {
              sum=sum*i;
          }
          return 1;
      }
      else
      {
          return -1;
      }
    }

    public int longFactorial(long number)
    {
        long sum=0;
        if(number<=20)
        {
            for(int i=1;i<=number;i++)
            {
                sum=sum*i;
            }
            return 1;
        }
        else
        {
            return -1;
        }

    }

}
