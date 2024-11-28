package RetailShopping;

public class MyItem {
	int id;
	String item;
	int price;
	int code;
	
	public MyItem(int id, String item, int price, int code) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "MyItem [id=" + id + ", item=" + item + ", price=" + price + ", code=" + code + "]";
	}
}
