import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleMultipleModels1 extends ExecutionContext implements example1{

    @Override
    public void Step2() {
        System.out.println("Running: Step2");
    }

    @Override
    public void Step1() {
        System.out.println("Running: Step1");
    }

    @Override
    public void finish() {
        System.out.println("Running: finish");
    }
}
