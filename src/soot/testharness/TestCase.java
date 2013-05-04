
package soot.testharness;

public class TestCase {
  
  public String sootFailingRevision(){
    return "HEAD";
  }
  
  public String herosFailingRevision(){
    return "HEAD";
  }
  
  public String jasminFailingRevision(){
    return "HEAD";
  }
  
  public String polyglotFailingRevision(){
    return "HEAD";
  }
  
  public void setupPackManager(){
    //vanilla behavior
  }
  
  public String[] sootMainArgs(){
    return new String[0];
  }
}
