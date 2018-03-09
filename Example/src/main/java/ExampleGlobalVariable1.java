import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleGlobalVariable1 extends ExecutionContext implements example1{

    @Override
    public void e_Step1() {
        System.out.print("e_Step1");

    }

    @Override
    public void v_Step1() {
        System.out.print("v_Step1");
    }
}
