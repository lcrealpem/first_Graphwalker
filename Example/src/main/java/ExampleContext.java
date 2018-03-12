import org.graphwalker.core.machine.ExecutionContext;

import javax.script.Bindings;
import javax.script.SimpleBindings;

public class ExampleContext extends ExecutionContext {

  private static final Bindings bindings = new SimpleBindings();

  public ExampleContext() {
    super();
    getScriptEngine().put("global", bindings);
  }
}
