public class test2
{
  public String Sum(int n)
  {
    if (n <= 1){
      return "1:"+n;
    }
    if (n < 7){
      return "1:"+n;
    }
    if (n == 7){
      return "7:1";
    }

    // TODO: 11/05/2022 recursive method
    if (n < 10){
      int e = n/7;
      n = n%7;
      return Sum(n)+" 7:"+e;
    }
    if (n == 10){
      return "10:1";
    }

    // TODO: 11/05/2022 recursive method
    if (n < 22){
      int e = n/10;
      n = n%10;
      return Sum(n)+" 10:"+e;
    }
    if (n == 22){
      return "22:1";
    }

    // TODO: 11/05/2022 recursive method
    if (n > 22){
      int e = n/22;
      n = n%22;
      return Sum(n)+" 22:"+e;
    }

    return "null";

  }


  public static void main(String[] args)
  {
    test2 t2 = new test2();

    System.out.println(t2.Sum(156));
  }
}
