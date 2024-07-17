package Nodes;

import Nodes.stringNode;
import Nodes.treeNode;

public class StringAllNode extends treeNode {

	public Object execute() {
		System.out.println("hi from allStringNode");
		String s="/";
		
		for(int i=0;i<children.size();i++) {
if(i!=0) {			
s+=" ";
}
			s+=children.get(i).execute();
			
		}
		
		s=s.replace("\"", "");
	
		return s;
	}

}
