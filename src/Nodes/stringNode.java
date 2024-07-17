package Nodes;

import Nodes.valueNode;

public class stringNode extends valueNode
{
	private String value;

	public stringNode (String v) 
	{

		if (v.charAt(0) == '"')
			this.value = v.substring( 1, v.length() - 1 );
		else
			this.value = v;
	}

	public Object execute()
	{
		return this.value;
	}
}