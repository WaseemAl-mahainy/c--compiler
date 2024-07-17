package Nodes;

public class varNode extends valueNode
{

	private String value;

	public varNode (String v) 
	{
		this.value = v;
	}

	public Object execute()
	{
		if (!declareNode.variables.containsKey(this.value))
		{
			System.out.println(this.value +" /// "+declareNode.variables);
			System.out.println("undefined variable from va");
			return null;
		}
		return declareNode.variables.get(this.value);
	}
}