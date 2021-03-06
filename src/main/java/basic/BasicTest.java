package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n)
  {
    if(n==0)
    {
      return Option.of(1);
    }
    if(n%2==0)
    {
      Option<Integer> r=power(i,n/2);
      r=Option.of(r.get()*r.get());
      return r;
    }
    else
    {
      n--;
      Option<Integer> r=power(i,n/2);
      r=Option.of(r.get()*r.get()*i);
      return r;
    }
    //return Option.none();
  }
}
