package com.example.plankydroid;

/**
 * Represents an item in a ToDo list
 */
public class TaxiItem {


	@com.google.gson.annotations.SerializedName("text")
	private String mText;

	@com.google.gson.annotations.SerializedName("id")
	private int mId;
	
	@com.google.gson.annotations.SerializedName("tel")
	private String mTel;
	
	@com.google.gson.annotations.SerializedName("price1")
	private String mPrice1;
	
	@com.google.gson.annotations.SerializedName("price2")
	private String mPrice2;
	
	@com.google.gson.annotations.SerializedName("price3")
	private String mPrice3;
	
	@com.google.gson.annotations.SerializedName("price4")
	private String mPrice4;
	
	@com.google.gson.annotations.SerializedName("price_on_wait")
	private String mPrice_on_wait;
	
	@com.google.gson.annotations.SerializedName("price_on_arrive")
	private String mPrice_on_arrive;

	@com.google.gson.annotations.SerializedName("desc")
	private String mDesc;

	@com.google.gson.annotations.SerializedName("CityItemId")
	private int CityItemId;
	/**
	 * ToDoItem constructor
	 */
	public TaxiItem() {

	}

	@Override
	public String toString() {
		return getText();
	}

	/**
	 * Initializes a new ToDoItem
	 * 
	 * @param text
	 *            The item text
	 * @param id
	 *            The item id
	 */
	public TaxiItem(String text, int id) {
		this.setText(text);
		this.setId(id);
	}
	
	public String getText() {
		return mText;
	}
	
	public String getTel() {
		return mTel;
	}
	
	public String getPrice1() {
		return mPrice1;
	}
	
	public String getPrice2() {
		return mPrice2;
	}
	
	public String getPrice3() {
		return mPrice3;
	}
	
	public String getPrice4() {
		return mPrice4;
	}
	
	public String getPriceOnArrive() {
		return mPrice_on_arrive;
	}
	
	public String getPriceOnWait() {
		return mPrice_on_wait;
	}
	
	public String getDesc() {
		return mDesc;
	}

	/**
	 * Sets the item text
	 * 
	 * @param text
	 *            text to set
	 */
	public final void setText(String text) {
		mText = text;
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
		return o instanceof TaxiItem && ((TaxiItem) o).mId == mId;
	}
}
