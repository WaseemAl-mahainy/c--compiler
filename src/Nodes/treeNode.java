package Nodes;

import java.util.ArrayList;


public abstract class treeNode
{


ArrayList<treeNode> children = new ArrayList<treeNode>();


public void addChild(treeNode n )
{
children.add(n);

}

public abstract Object execute();



}