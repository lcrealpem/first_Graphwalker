import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleGlobalVariable2 extends ExecutionContext implements example2{

    @Override
    public void v_Step5() {
        System.out.print("v_Step5");
    }

    @Override
    public void e_Step3() {
        System.out.print("e_Step3");
    }

    @Override
    public void e2_Step5() {
        System.out.print("e2_Step5");
    }

    @Override
    public void e_Step4() {
        System.out.print("e_Step4");
    }

    @Override
    public void e1_Step5() {
        System.out.print("e1_Step5");
    }

    @Override
    public void v_Step4() {
        System.out.print("v_Step4");
    }

    @Override
    public void v_Step3() {
        System.out.print("v_Step3");
    }

    @Override
    public void e_finish() {
        System.out.print("e_finish");
    }

    @Override
    public void v_Step2() {
        System.out.print("v_Step2");
    }
}
