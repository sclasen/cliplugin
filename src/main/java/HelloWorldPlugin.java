import com.force.cliforce.Command;
import com.force.cliforce.CommandContext;
import com.force.cliforce.Plugin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HelloWorldPlugin implements Plugin {


    @Override
    public List<Class<? extends Command>> getCommands() {
        return Arrays.<Class<? extends Command>>asList(HelloWorldCommand.class);
    }



    public static class HelloWorldCommand implements Command {
        public String describe() {
            return "Prints Hello World";
        }

        @Override
        public String name() {
            return "hello";
        }

        public void execute(CommandContext ctx) throws Exception {
            ctx.getCommandWriter().println("Hello World");
        }
    }
}
