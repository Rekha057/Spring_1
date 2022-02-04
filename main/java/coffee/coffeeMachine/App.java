package coffee.coffeeMachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ac = new ClassPathXmlApplicationContext("coffee.xml");
      
     cappacino coff=ac.getBean(cappacino.class);
      coff.cof();
      
    xpresso coff1 = ac.getBean(xpresso.class);
    System.out.println(coff1.getField_SI_tech());
      // System.out.println(coff);
       //coff.datatypeofcoffee();
       //coff.typeofcoffee();
    }
}
