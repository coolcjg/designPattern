package designPattern.factory.idcard;

import java.awt.List;
import java.util.ArrayList;

import designPattern.factory.framework.Factory;
import designPattern.factory.framework.Product;

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
