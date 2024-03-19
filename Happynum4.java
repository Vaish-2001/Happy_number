class Happynum4
 {
  /*happy number is positive integer that,
   which is replaced by the sum of square of its digit,
   eventually reaching 1
  */
  public static void main(String[]args)
   {
    int a=13;
    int sum=0;
    ab:while(a>0||sum>9)
       {
        if(a==0)
         {
          a=sum;
          sum=a;
         }
       bc:while(a>0)
         {
          int rem=a%10;
          sum=(rem*rem)+sum;
          a=a/10;
         }
      }
      if(sum==1||a==1)
      {
       System.out.println("the num is happy num");
      }
      else
      {
       System.out.println("the num is not happy num");
      }
   }//it is not happy num
 }