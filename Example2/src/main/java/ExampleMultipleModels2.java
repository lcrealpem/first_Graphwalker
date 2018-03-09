import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleMultipleModels2 extends ExecutionContext implements example2{


    @Override
    public void Step3() {
        System.out.println("Running: Step3");
    }

    @Override
    public void finish2() {
        System.out.println("Running: finish2");
    }

    @Override
    public void Step4() {
        System.out.println("Running: Step4");
    }
}
