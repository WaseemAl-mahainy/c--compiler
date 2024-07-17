package Nodes;

public class modificationNode extends treeNode {

    public Object execute() {
        String varName = (String) children.get(0).execute();
        Object value = declareNode.variables.get(varName);
        String op = (String) children.get(1).execute();
        int varValue = Integer.parseInt((String) value);
        
            if (op.equalsIgnoreCase("++")) {
                varValue++;
            } else if (op.equalsIgnoreCase("--")) {
                varValue--;
            }

            declareNode.variables.put(varName, varValue);
        

        System.out.println("hello from  assign node " + declareNode.variables);

        return null;
    }

}
