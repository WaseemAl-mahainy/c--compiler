package Nodes;

import Nodes.valueNode;

public class intNode extends valueNode {
	private int value;

	public intNode() {
		this.value = 0;
	}

	public intNode(String v) {
		this.value = Integer.parseInt(v);
	}
	
	public Object execute() {
		if (children.size() != 0) {
			switch (children.get(0).execute().toString()) {
			case "+":
				for (int i = 1; i < children.size(); i++) {
					this.value += (int) children.get(i).execute();
				}
				break;
			case "-":
				for (int i = 1; i < children.size(); i++) {
					this.value -= (int) children.get(i).execute();
				}
				break;
			case "*":
				this.value = (int) children.get(1).execute();
				for (int i = 2; i < children.size(); i++) {
					this.value *= (int) children.get(i).execute();
				}
				break;
			case "/":
				this.value = (int) children.get(1).execute();
				for (int i = 2; i < children.size(); i++) {
					this.value /= (int) children.get(i).execute();
				}
				break;
			default:
				break;
			}
		}
		
		return this.value;
	}
}