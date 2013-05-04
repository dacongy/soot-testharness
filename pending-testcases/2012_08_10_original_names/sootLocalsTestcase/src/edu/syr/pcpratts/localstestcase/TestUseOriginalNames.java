package edu.syr.pcpratts.localstestcase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUseOriginalNames {

  static void test0(int y){
    int x;
    x = 0;
    if(y >= 3){
      x = y; 
    }
  }

  static void test1(int y){
    {
      int x = 0;
      int z = x + y;
    }
    {
      List<Integer> list = new ArrayList<Integer>();
      Iterator<Integer> x = list.iterator();
      while(x.hasNext()){
        System.out.println(x.next());
      }
    }
  }
  
  static void main(String[] args){
    //test0(20);
    test1(20);
  }
}
