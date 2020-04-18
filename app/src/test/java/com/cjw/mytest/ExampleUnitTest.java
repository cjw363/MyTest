package com.cjw.mytest;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
  int[] arr={11,22,23,36,44,88};
  @Test
  public void addition_isCorrect() {
//    assertEquals(4, 2 + 2);

    int[] run = run(132, new int[]{0, 0});
    System.out.println(run[0]);
    System.out.println(run[1]);

  }

  int[] run(int n,int[] b){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        System.out.println(arr[i]+" "+arr[j]);
        if(n==(arr[i]+arr[j])){
          b[0]=i;
          b[1]=j;
          return b;
        }
      }
    }
    return b;
  }
}