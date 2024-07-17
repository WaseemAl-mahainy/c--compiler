package Nodes;

import java.util.HashMap;


public class arrayNode extends treeNode{

    static HashMap<String, Object[]> arrays = new HashMap<String,Object[]>();
    
    public Object execute() {
    	
    	System.out.println("hi from assignArray  "+children.get(1).execute().toString());
        int size1 = (int) children.get(0).execute();
        String arrayName = children.get(1).execute().toString();
        int size2 = (int) size1;
        Object[] arr = new Object[size2];
        int j=2;
        for (int i = 0; i < size2; i++) {
   
			arr[i]=(Object) children.get(j).execute();
			j++;
        }
        
         
        arrays.put(arrayName,arr);
        System.out.println("Assigned array: "+children.get(1).execute().toString()+" ? "+
        		arrays.containsKey("x"));
        return null;
    }
	
}
