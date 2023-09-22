package org.test.example;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

  public  String password = "secret";

  static Map<String, String> map = new HashMap<>();
  public static void main(String[] args) throws Exception{
    long j =02343533;
    String s;
    System.out.println("Hello world!");
    int i = 0;
    boolean f;

    if (i==0){
      f = true;
    }

    String p = "";
    String p1 = "sd";

    map.put(p, p1);

    String p2;
    String p3;



    doNothing(null);

    int ii = 2/0;
    System.out.println(ii);
  }

  public static void doNothing(String s){
    System.out.println(s.getBytes(StandardCharsets.UTF_8));
     if(s==null){
       throw new NullPointerException();
     }
  }


  public static void doNothing1(String s){
    if(true){
      throw new UnsupportedOperationException();
    }
  }

  public static void doNothing1(){
     if(true){
       throw new UnsupportedOperationException();
     }
  }
}
