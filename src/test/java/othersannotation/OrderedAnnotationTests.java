package othersannotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedAnnotationTests {

	@Order(3)
	@Test
	@DisplayName("Kangchenjunga is the third highest mountain in the world.")
	public void aKangchenjunga() {
		
	}
	
	@Order(1)
	@Test
	@DisplayName("Mount Everest is Earth's highest mountain above sea level")
	public void mountEverest() {
		
	}

	@Order(2)
	@Test
	@DisplayName("K2 is the second-highest mountain on Earth")
	public void K2() {
		
	}

}
