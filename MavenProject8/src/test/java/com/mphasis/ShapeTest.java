package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class ShapeTest {
	
//	@ParameterizedTest
//	@ValueSource(classes= {Shape.class,Circle.class,Triangle.class})
//	public void typeTest(Class<?> cls) throws Exception {
//		
//		Shape s=(Shape) cls.getDeclaredConstructor().newInstance();
//		assertTrue(s.getClass()==cls);
//		
//	
//	}
	public Stream<Shape> shapeProvider(){
		return Stream.of(new Shape(),new Circle(),new Triangle());
	}
	
	
	@ParameterizedTest
	@MethodSource("shapeProvider")
	public static void typeTest(Shape shape) {
		Shape res=shape.type();
		assertTrue(res instanceof Shape||res instanceof Circle|| res instanceof Triangle);
	}
	
}
