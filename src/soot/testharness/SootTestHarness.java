package soot.testharness;

import java.util.ArrayList;
import java.util.List;
import soot.testharness.testcases.rupert.RupertTestCase;

public class SootTestHarness {

  private List<TestCase> m_allTestCases;
  
  public SootTestHarness(){
    m_allTestCases = new ArrayList<TestCase>();
    m_allTestCases.add(new RupertTestCase());
  }
  
  public void runTest(String test_case) {
    TestCase to_run = findTestCase(test_case);
    List<TestCase> test_cases = new ArrayList<TestCase>();
    test_cases.add(to_run);
    runTestCases(test_cases);
  }

  public void runAll() {
    runTestCases(m_allTestCases);
  }
  
  public void runTestCases(List<TestCase> all_testcases) {
    int count = all_testcases.size();
    int passing = 0;
    int index = 1;
    TestEngine engine = new TestEngine();
    for(TestCase test_case : all_testcases){
      String name = test_case.getClass().getName();
      System.out.println("[Test "+index+"/"+count+"] "+name);
      System.out.println("  "+passing+"/"+count+" passing");
      
      TestResult result = engine.test(test_case);
      if(result.passed()){
        ++passing;
        System.out.println("  passed");
      } else {
        System.out.println("  failed: "+result.getMessage());
        if(result.hasException()){
          Throwable throwable = result.getException();
          throwable.printStackTrace(System.out);
        }
      }
    }
  }

  private TestCase findTestCase(String test_case_id) {
    for(TestCase test_case : m_allTestCases){
      String class_name = test_case.getClass().getName();
      if(class_name.equals(test_case_id)){
        return test_case;
      }
    }
    throw new RuntimeException("cannot find test_case: "+test_case_id);
  }

}
