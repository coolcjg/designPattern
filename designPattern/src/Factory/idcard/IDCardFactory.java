package Factory.idcard;

import java.awt.List;
import java.util.ArrayList;

import Factory.framework.Factory;
import Factory.framework.Product;

public class IDCardFactory extends Factory{
	private ArrayList owners = new ArrayList();
	
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct (Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public ArrayList getOwners() {
		return owners;
	}

}
