package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input)
  {
    double y=0;
    List<Double> listY=new ArrayList<>();
    for (Integer i:input)
    {
      y=Math.pow((i*2)+3,5);
      listY.add(y);
    }
    return listY;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input)
  {
    List<String> result =new ArrayList<>();
    for (String s:input)
    {
      String first=s.substring(0,0);
      String rest=s.substring(1);
      first.toUpperCase();
      String r=first+rest;
      result.add(r);
    }
    return result;
  }

}
