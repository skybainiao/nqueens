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
    if (n < 10){
      n = n%7;
      return "1:"+n+" 7:1";
    }
    if (n == 10){
      return "10:1";
    }
    if (n < 22){
      int e = n/10;
      n = n%10;
      if (n < 7 && e == 1){
        return "1:"+n+" 10:1";
      }
      if (n == 7 && e == 1){
        return "7:1"+" 10:1";
      }
      if (n < 9 && e == 1){
        n = n%7;
        return "1:"+n+" 7:1"+" 10:1";
      }
      if (n == 9 && e == 1){
        return "1:2"+" 7:1"+" 10:1";
      }
      if (e == 2 && n != 0){
        return "1:"+n+" 10:2";
      }
      if (e == 2 && n == 0){
        return "10:2";
      }
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

    System.out.println(t2.Sum(600));
  }
}
