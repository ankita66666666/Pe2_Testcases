package com.stackroute.pe2;
//
public class StudentGrade
{
    int sum=0,avg,temp;
    double sum1;
    double avg1;
    int[] a;
    public void addStudentGrade(int[] arr)
{
       this.a = arr;
//
//       if((calculateAverage(arr)))
//        {
//          return avg;
//
//       }
//    return 0;
    }

    public int maximumGrade()
    {
        for(int i=1;i<=a.length-1;i++)
        {

                if(a[0]<a[i])
                {
                    temp=a[i];   //26
                    a[i]=a[0];  //25
                    a[0]=temp;//26
                }
            }
        return a[0];
        }


    public int minimumGrade()
    {



        for(int i=1;i<=a.length-1;i++)
        {

            if(a[0]>a[i])
            {
                temp=a[i];   //26
                a[i]=a[0];  //25
                a[0]=temp;//26
            }
        }
        return a[0];

   }
    public double calculateAverage()
    {

        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        avg1=sum1/4;
        //return avg;
        return avg1;
    }
}
