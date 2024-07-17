package Nodes;

import java.util.ArrayList;

public class condNode2 extends treeNode {
	 public condNode2() {}
	  ArrayList<String> st=new ArrayList<String>();
	  public Object execute()
	  {
		  System.out.println("hello from cond2");
		  if(children.size()==1) {
	   Object b1=children.get(0).execute();
	   System.out.print(b1);
	   return b1;}
		  else {
	   String opp=children.get(1).execute().toString();
	   Object b2=children.get(2).execute();
	   int x=0;
	   
	   for(int i=1;i<children.size()-1;i+=2)
		   st.add(children.get(i).execute().toString());
	      
	   boolean andflag=true,orflag=false;
	   System.out.println(children);
	
		   for(int i=0;i<children.size()-1;i+=2) {
			   if(st.get(x).equals("&&")) {
				   System.out.println("i is "+i+ " "+(boolean)children.get(i).execute() +"  "+(boolean)children.get(i+2).execute() );
			   if((boolean)children.get(i).execute() && (boolean)children.get(i+2).execute())
				   andflag=andflag && true;
			   else andflag =false;}
		   }
		   
		   return andflag;
	   }}
	  

}
