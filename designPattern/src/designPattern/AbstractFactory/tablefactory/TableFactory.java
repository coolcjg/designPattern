package designPattern.AbstractFactory.tablefactory;

import designPattern.AbstractFactory.factory.Factory;
import designPattern.AbstractFactory.factory.Link;
import designPattern.AbstractFactory.factory.Page;
import designPattern.AbstractFactory.factory.Tray;

public class TableFactory extends Factory{
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}
	
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}
	
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}
	

}
