package project;

import java.time.LocalDateTime;

public class ToDoItem {
	private String itemsName;		
	LocalDateTime registryDate;
	private ToDoStatus toDoStatus;
	
	
	
	public ToDoItem(String itemsName, LocalDateTime registryDate) {
		this.itemsName = itemsName;
		this.registryDate = LocalDateTime.now();
		toDoStatus = ToDoStatus.NOT_STARTED;
	}



	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}



	public LocalDateTime getRegistryDate() {
		return registryDate;
	}

	public void setRegistryDate(LocalDateTime registryDate) {
		this.registryDate = registryDate;
	}

	
	
	public ToDoStatus getToDoStatus() {
		return toDoStatus;
	}

	
}