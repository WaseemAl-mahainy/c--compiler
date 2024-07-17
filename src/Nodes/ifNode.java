package Nodes;

import Nodes.treeNode;

public class ifNode extends treeNode {

  
  public Object execute() {
    
    
      if((boolean)children.get(0).execute())
      {
         children.get(1).execute();
    
      }
      else if (children.size()>2) children.get(2).execute();
  
      
  return null;
  }
}
