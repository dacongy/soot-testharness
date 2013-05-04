package soot.testharness;

public class Main {
  
  private void exec(String[] args) {
    boolean args_valid = false;
    boolean run_all = false;
    String test_case = "";
    if(args.length == 1){
      if(args[0].equals("-runall")){
        run_all = true;
        args_valid = true;
      }
    } else if(args.length == 2){
      if(args[0].equals("-runtest")){
        test_case = args[1];
        args_valid = true;
      }
    }
    if(args_valid == false){
      System.out.println("usage 1: java -jar soot-testharness.jar -runall");
      System.out.println("usage 2: java -jar soot-testharness.jar -runtest test_name");
    }
    SootTestHarness test_harness = new SootTestHarness();
    if(run_all){
      test_harness.runAll();
    } else {
      test_harness.runTest(test_case);
    }
  }
  
  public static void main(String[] args) {
    Main main = new Main();
    main.exec(args);
  }

}
