package hudson.plugins.zentimestamp;

import hudson.Extension;
import hudson.model.Node;
import hudson.slaves.NodeProperty;
import hudson.slaves.NodePropertyDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Gregory Boissinot
 */
public class ZenTimestampNodeProperty extends NodeProperty<Node> {

    private String pattern;

    @DataBoundConstructor
    public ZenTimestampNodeProperty(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Extension
    public static class ZenTimestampNodePropertyDescriptor extends NodePropertyDescriptor {
        @Override
        public String getDisplayName() {
            return "Add a " + ZenTimestampAction.BUILD_TIMESTAMP_VARIABLE + " variable with the job build timestamp as value";
        }

        @Override
        public String getHelpFile() {
            return "/plugin/zentimestamp/help-node.html";
        }
    }


}
