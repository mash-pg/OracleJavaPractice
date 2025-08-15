package test.test17;
public class SubSample extends Sample{
	int price;
	public SubSample(int num,int price) {
		this(null, num, price);
		this.price = price;
	}
	public SubSample(String name,int num,int price) {
		//this(price);
		super(name,num);
		this.price = price;
	}
}
