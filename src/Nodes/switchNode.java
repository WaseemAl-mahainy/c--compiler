package Nodes;

public class switchNode extends treeNode{
	public Object execute() {

		String var = children.get(0).execute().toString();
		
		String x1=children.get(0).execute().toString();
		
		
	for(int i=1;i<children.size()-1;i+=2) {
		
			if(x1.equals(children.get(i).execute().toString())) {
				children.get(i+1).execute();
				return null;
				
			}}
	children.get(children.size()-1).execute();
		
		return null;
		
		
		
	}

}
