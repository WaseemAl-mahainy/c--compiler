package Nodes;

import Nodes.treeNode;

public class valueNode extends treeNode
{
	private Object val;

	public valueNode () {}
	
	public valueNode (Object v) 
	{
		this.val = v;
	}

	public Object execute()
	{
		return this.val ;
	}
}