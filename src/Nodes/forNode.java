package Nodes;


import java.util.List;
import java.util.ArrayList;
public class forNode extends treeNode {
   

  public Object execute() {
	  for (
			children.get(0).execute();
			(Boolean)children.get(1).execute();
			children.get(2).execute())
			children.get(3).execute();
		System.out.println("hello from forNode");
		return null;
  }
}