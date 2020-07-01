package Factory;

import Factory.framework.Factory;
import Factory.framework.Product;
import Factory.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("ȫ�浿2");
		Product card3 = factory.create("ȫ�浿3");
		
		card1.use();
		card2.use();
		card3.use();
	}

}
