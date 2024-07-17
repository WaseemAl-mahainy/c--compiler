package Nodes;

import Nodes.valueNode;

public class boolNode extends valueNode
{
	private boolean value;

	public boolNode(String v)
	{
		this.value = Boolean.parseBoolean(v);;
	}
	
	public Object execute()
	{
		return this.value;
	}
}