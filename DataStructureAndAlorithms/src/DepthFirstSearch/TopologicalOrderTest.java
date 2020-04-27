package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class TopologicalOrderTest {

	public static void main(String[] args) {
		TopologicalOrder tpOrder=new TopologicalOrder();
		
		List<Vertex> vertexList=new ArrayList<>();
		vertexList.add(new Vertex("0"));
		vertexList.add(new Vertex("1"));
		vertexList.add(new Vertex("2"));
		vertexList.add(new Vertex("3"));
		vertexList.add(new Vertex("4"));
		vertexList.add(new Vertex("5"));
		
		vertexList.get(2).addNeighbourList(vertexList.get(3));
		vertexList.get(3).addNeighbourList(vertexList.get(1));
		vertexList.get(4).addNeighbourList(vertexList.get(0));
		vertexList.get(4).addNeighbourList(vertexList.get(1));
		vertexList.get(5).addNeighbourList(vertexList.get(0));
		vertexList.get(5).addNeighbourList(vertexList.get(2));
		
		for(int i=0;i<vertexList.size();i++) {
			if(!vertexList.get(i).isVisited()) {
				tpOrder.dfs(vertexList.get(i));
			}
		
		}
		
		Stack<Vertex> stackVtx=tpOrder.getStack();
		System.out.println(stackVtx);
		
		for(Vertex v: vertexList) {
			System.out.print(stackVtx.pop()+" ");
		}
		
	
	}
}
