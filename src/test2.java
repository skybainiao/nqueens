public class test2
{

  // TODO: 11/05/2022 recursive method
  public String recursive(int n)
  {
    if (n < 7){
      return "1:"+n;
    }
    
    if (n < 10){
      int e = n/7;
      n = n%7;
      return recursive(n)+" 7:"+e;
    }
    
    if (n < 22){
      int e = n/10;
      n = n%10;
      return recursive(n)+" 10:"+e;
    }
    
    if (n > 22){
      int e = n/22;
      n = n%22;
      return recursive(n)+" 22:"+e;
    }

    return "error";
  }


  public static void main(String[] args)
  {
    test2 t2 = new test2();

    System.out.println(t2.recursive(146));
  }
}
