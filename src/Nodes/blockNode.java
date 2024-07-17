package Nodes;

public class blockNode extends treeNode{

	public Object execute()
	{
		
          System.out.println("hello from block node");
          
            for (treeNode  c : children )
            {
                c.execute();
            }
            
          
                
                
		return null;
		
	}
}
