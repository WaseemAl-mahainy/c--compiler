package Nodes;


public class condNode extends treeNode {

	@Override
	public Object execute() {
		System.out.println("Executing condition node");
		Object operand1 = null;
		Object operand2 = null;
		String operation = this.children.get(1).execute().toString();
		
		//operand1
		if (this.children.get(0) instanceof stringNode) {
			
			String var =  this.children.get(0).execute().toString();
			System.out.println("var exists :"+ var);
			if (declareNode.variables.containsKey(var)) {
				Object variable = declareNode.variables.get(var);
				if (variable instanceof Integer) {
					operand1 = (Integer) variable;
				} else {
					operand1 = String.valueOf(variable);
				}
			} else {
	
				System.err.println("Error: Undefiend Variable: " +declareNode.variables+ var + " !!!!!");
				System.exit(-1);
			}
		} else {
			operand1 = (Integer) this.children.get(0).execute();
		}
		//operand2
		if (this.children.get(2) instanceof stringNode) {
			String var = this.children.get(2).execute().toString();
			if (declareNode.variables.containsKey(var)) {
				System.out.println("var exists :"+ var);
				Object variable = declareNode.variables.get(var);
				if (variable instanceof Integer) {
					operand2 = (Integer) variable;
				} else {
					operand2 = String.valueOf(variable);
				}
			} else {
				// if it doesn't exist, print an error.
				System.err.println("Error: Undefiend Variable " + var + " !!");
				System.exit(-1);
			}
		} else {
			operand2 = (Integer) this.children.get(2).execute();
		} 
		
		if (operand1 instanceof String && operand2 instanceof String) {
			String oper1 = operand1.toString();
			String oper2 = operand2.toString();
			if (operation.equals("!=")) {
				return oper1.compareTo(oper2) != 0;
			} else if (operation.equals("<")) {
				return oper1.compareTo(oper2) < 0;
			} else if (operation.equals("<=")) {
				return oper1.compareTo(oper2) < 0;				
			} else if (operation.equals(">")) {
				return oper1.compareTo(oper2) > 0;
			} else if (operation.equals(">=")) {
				return oper1.compareTo(oper2) >= 0;				
			} else {
				return oper1.compareTo(oper2) == 0;
			}
			
		} else if (operand1 instanceof Integer && operand2 instanceof Integer) {
			Integer oper1 = (Integer) operand1;
			Integer oper2 = (Integer) operand2;
			if (operation.equals("!=")) {
				return oper1.compareTo(oper2) != 0;
			} else if (operation.equals("<")) {
				return oper1 < oper2;
			} else if (operation.equals("<=")) {
				return oper1 <= oper2;
			} else if (operation.equals(">")) {
				return oper1 > oper2;
			} else if (operation.equals(">=")) {
				return oper1 >= oper2;				
			} else {
				return oper1.compareTo(oper2) == 0;
			}
		} else {
			System.err.println("Error: Comparing two operands with different types is not possible !! ");
			System.exit(-1);
			return false;
		}
	}
}
