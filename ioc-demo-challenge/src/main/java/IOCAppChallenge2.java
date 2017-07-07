import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IOCAppChallenge2 {

	public static void main(String[] args) {
		// application context create
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		// create the bean
		City ct = (City) ctx.getBean("city");
		
		// invoice cityName
		ct.cityNamed();
		
		// close application context
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
