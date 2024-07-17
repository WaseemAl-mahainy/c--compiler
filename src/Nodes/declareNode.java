package Nodes;

import java.util.HashMap;

import java.util.Scanner;

public class declareNode extends treeNode {

	public static HashMap<String, Object> variables = new HashMap<String, Object>();

	public Object execute() {
		String varName = (String) children.get(0).execute();
		Object varValue = children.get(1).execute();

		if (varValue.toString().equals("Console.ReadLine()")) {
			System.out.print(" declare Please enter a value for " + varName + ": ");
			Scanner input = new Scanner(System.in);
			String in = input.nextLine();

			while (in == "") {
				System.out.print("Please enter a value for " + varName + ": ");
				in = input.next();
			}

			if (in.equals("true")) {
				variables.put(varName, true);
				System.out.println("hello from  declare node " + variables);
				return null;
			} else if (in.equals("false")) {
				variables.put(varName, false);
				System.out.println("hello from  declare node " + variables);
				return null;
			} else if (in.matches("[0-9]+")) {
				variables.put(varName, Integer.parseInt(in));
				System.out.println("hello from  declare node " + variables);
				return null;
			} else {
				stringNode str = new stringNode(in);
				variables.put(varName, str.execute());
				System.out.println("hello from  declare node " + variables);
				return null;
			}

		}

		variables.put(varName, varValue);

		System.out.println("hello from  declare node " + variables);

		return null;
	}
}