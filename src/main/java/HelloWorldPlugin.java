import com.force.cliforce.Command;
import com.force.cliforce.CommandContext;
import com.force.cliforce.CommandDescriptor;
import com.force.cliforce.Plugin;

import java.util.Collections;
import java.util.List;


public class HelloWorldPlugin implements Plugin {
    public List<CommandDescriptor> getCommands() {
        return Collections.singletonList(new CommandDescriptor("hello", new HelloWorldCommand()));
    }

    public String getName() {
        return "HelloWorld";
    }

    public static class HelloWorldCommand implements Command {
        public String describe() {
            return "Prints Hello World";
        }

        public void execute(CommandContext ctx) throws Exception {
            ctx.getCommandWriter().println("Hello World");
        }
    }
}
