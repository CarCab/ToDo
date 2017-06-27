package project;

import java.util.ArrayList;

public class ToDoRegistryList {
	
	private ArrayList<ToDoItem> registry;

	
	public ToDoRegistryList() {
		registry = new ArrayList<ToDoItem>();
	}
	
	public void addToDoItems(ToDoItem newToDoItem) {
		registry.add(newToDoItem);
	}
	
	

}

