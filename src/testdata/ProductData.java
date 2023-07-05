package testdata;

import utils.Reader;

public class ProductData {
	
	
	private String title;
	private String description;
	private String price;
	
	public ProductData(String fileName) {
		this.setTitle(Reader.json(fileName).get("title").toString());
		this.setDescription(Reader.json(fileName).get("description").toString());
		this.setPrice(Reader.json(fileName).get("price").toString());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
