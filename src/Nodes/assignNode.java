package Nodes;

import java.util.HashMap;
import java.util.Scanner;


public class assignNode extends treeNode {

    
  
    public Object execute() {
        String varName = (String) children.get(0).execute();
        Object varValue = children.get(1).execute();
     
        if (varValue.toString().equals("Console.ReadLine()"))
        
        {
            System.out.print(" assign Please enter a value for " + varName + ": ");
            Scanner input= new Scanner(System.in);
            String in = input.nextLine();
              
            
            
            if (in.equals("true")) {
            	declareNode.variables.put(varName,true);
              System.out.println("hello from  declare node " + declareNode.variables);
              return null;
            } else if (in.equals("false")) {
            	declareNode.variables.put(varName,false);
              System.out.println("hello from  declare node " + declareNode.variables);
              return null;
            } else if (in.matches("[0-9]+")) {
              declareNode.variables.put(varName,Integer.parseInt(in));
              System.out.println("hello from  declare node " +declareNode.variables);
              return null;
            } else {
              stringNode str = new stringNode(in);
              declareNode.variables.put(varName,str.execute());
              System.out.println("hello from  declare node " + declareNode.variables);
              return null;
            }
            
              }
        if(declareNode.variables.containsKey(varName)) {
         declareNode.variables.replace(varName, varValue);
        }
        else System.out.println("Undefined variable from assign");

       

        System.out.println("hello from  assign node " + declareNode.variables);

        return null;
    }

}