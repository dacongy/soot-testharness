/* 
 * Copyright 2013 Phil Pratt-Szeliga and other contributors
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.soot.test;

import apple.awt.CDragSourceContextPeerTest;
import com.apple.java.BackwardsCompatibilityTest;

public class Main {
  
  private void run() {
    CDragSourceContextPeerTest test1 = new CDragSourceContextPeerTest();
    test1.test();
    
    BackwardsCompatibilityTest test2 = new BackwardsCompatibilityTest();
    test2.test();
  }
  
  public static void main(String[] args){
    Main main = new Main();
    main.run();
  }
}
