package Nodes;

public class doWhileNode extends treeNode {

    public Object execute() {
        do {
            children.get(0).execute();  // Execute the block node
        } while ((Boolean) children.get(1).execute());  // Evaluate the condition node

        return null;
    }
}
