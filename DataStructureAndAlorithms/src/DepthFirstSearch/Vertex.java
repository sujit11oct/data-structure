package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;


public class Vertex {
	private String data;
	private boolean isVisited;
	private List<Vertex> neighbourList;
	
	public Vertex(String data) {
		this.data=data;
		this.neighbourList=new ArrayList<>();
	}
	
	public void addNeighbourList(Vertex v) {
		this.neighbourList.add(v);
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}



	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	@Override
	public String toString() {
		return  this.data;
	}
	
	
}
