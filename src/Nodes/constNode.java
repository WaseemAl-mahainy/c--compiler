package Nodes;



public class constNode extends treeNode
{

String val;


public constNode(String v)
{

this.val = v;
}


public constNode()
{


}

public void setVal(String v)
{
this.val = v;

}


public Object execute()
{



int res = Integer.parseInt(this.val);


System.out.println("hello from constNode" + res);

return res ;


}




}