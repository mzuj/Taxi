package com.example.plankydroid;

/**
 * Represents an item in a ToDo list
 */
public class CityItem {


	@com.google.gson.annotations.SerializedName("name")
	private String mName;

	/**
	 * Item Id
	 */
	@com.google.gson.annotations.SerializedName("id")
	private int mId;
	
	/**
	 * ToDoItem constructor
	 */
	public CityItem() {

	}

	@Override
	public String toString() {
		return getName();
	}

	/**
	 * Initializes a new ToDoItem
	 * 
	 * @param text
	 *            The item text
	 * @param id
	 *            The item id
	 */
	public CityItem(String text, int id) {
		this.setName(text);
		this.setId(id);
	}

	/**
	 * Returns the item text
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Sets the item text
	 * 
	 * @param text
	 *            text to set
	 */
	public final void setName(String name) {
		mName = name;
	}

	/**
	 * Returns the item id
	 */
	public int getId() {
		return mId;
	}

	/**
	 * Sets the item id
	 * 
	 * @param id
	 *            id to set
	 */
	public final void setId(int id) {
		mId = id;
	}


	@Override
	public boolean equals(Object o) {
		return o instanceof CityItem && ((CityItem) o).mId == mId;
	}
}
