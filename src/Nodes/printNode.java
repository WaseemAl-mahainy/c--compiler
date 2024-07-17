package Nodes;

public class printNode extends treeNode{
	
	public printNode() {} 
	
	public Object execute()
	{
		String text = "";
		
//	Check if there is concatenation
		
		if (children.size() > 1) {
			for (int i = 0; i < children.size(); i++) {
				if(declareNode.variables.containsKey(children.get(i).execute().toString())) {
					text+=declareNode.variables.get(children.get(i).execute().toString());
				}
				else
				text += children.get(i).execute().toString();
			}
		}
		else
			text = children.get(0).execute().toString();
		
		System.out.println("hello from print node");
		System.out.println(text);
		return null;
	}
	}

