package Nodes;


public class expressionNode extends treeNode
{

public Object execute()
{
double val1=(double)children.get(0).execute();
double val2=(double)children.get(1).execute();

//String op = "+";

String op = (String) children.get(2).execute();

System.out.println("hello from expression operation is " + op );
double res = 0;


if(op.equals("+")) res= val1+val2;
if(op.equals("-")) res= val1-val2;
if(op.equals("*")) res= val1*val2;
if(op.equals("/")) res= val1/val2;


System.out.println("hello from expressionNode res  = " + res);



return res;
}





}