import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleGlobalVariable1 extends ExampleContext implements example1{

    @Override
    public void e_Step1() {
        System.out.println("e_Step1");

    }

    @Override
    public void v_Step1() {
        System.out.println("v_Step1");
    }
}
