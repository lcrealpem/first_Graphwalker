import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))")

public class ExampleGlobalVariable2 extends ExampleContext implements example2{

    @Override
    public void v_Step5() {
        System.out.println("v_Step5");
    }

    @Override
    public void e_Step3() {
        System.out.println("e_Step3");
    }

    @Override
    public void e2_Step5() {
        System.out.println("e2_Step5");
    }

    @Override
    public void e_Step4() {
        System.out.println("e_Step4");
    }

    @Override
    public void e1_Step5() {
        System.out.println("e1_Step5");
    }

    @Override
    public void v_Step4() {
        System.out.println("v_Step4");
    }

    @Override
    public void v_Step3() {
        System.out.println("v_Step3");
    }

    @Override
    public void e_finish() {
        System.out.println("e_finish");
    }

    @Override
    public void v_Step2() {
        System.out.println("v_Step2");
    }
}
