
// 1. Add the unit test to this repl.it. You should be able to drag and drop the .java file
// 2. Add a new file with the correct file name and develop your solution. Add File button is on the left.
// 3. Modify "UnitTest" on line 18 so that it refers to the actual unit test class name

// you can test your solution by running and checking the feedback in the console

import java.util.List;
import org.junit.runner.*;

public class Main {

  public static void main(String[] args) {

	JUnitCore core = new JUnitCore();
//                              |   |
//MODIFY the class name here   \|/ \|/
	Result result = core.run(InchWormTest.class);

	List<org.junit.runner.notification.Failure> failures = result.getFailures();

    if (failures.size() > 0) {
        System.out.println(String.format("Failures (%d)", failures.size()));
        for (org.junit.runner.notification.Failure failure : failures) {
            System.out.println("Test:   " + failure.getTestHeader());
            System.out.println("Msg:    " + failure.getMessage());
            System.out.println("Trace:  " + failure.getTrace());
        }
    }

    System.out.println(String.format("Test run finished after %d ms", result.getRunTime()));
    System.out.println(String.format("[%10d tests started         ]", result.getRunCount()));
    System.out.println(String.format("[%10d tests passed          ]", result.getRunCount() - result.getFailureCount()));
    System.out.println(String.format("[%10d tests failed          ]", result.getFailureCount()));
    System.out.println();

  }
}