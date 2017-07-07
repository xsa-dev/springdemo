import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		// application context create
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
		
		// create the bean
		City ct = (City) ctx.getBean("city");
		
		// invoice cityName
		ct.cityNamed();
		
		// close application context
		((FileSystemXmlApplicationContext) ctx).close();
	}

}
