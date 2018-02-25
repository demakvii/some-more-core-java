package com.techlabs.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import com.techlabs.annotation.Foo;
import com.techlabs.annotation.NeedRefactor;

public class AnnotationTest {

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {
		Class<Foo> fooClass = Foo.class;

		Foo foo = new Foo();
		foo.methodOne();

		Method method = fooClass.getMethod("methodOne", new Class[] {});
		readAnnotation(method);

		foo.methodOne();
		method = fooClass.getMethod("methodFour", new Class[] {});
		readAnnotation(method);
	}

	private static void readAnnotation(AnnotatedElement element) {
		Annotation[] annotations = element.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof NeedRefactor) {
				NeedRefactor needRefactor = (NeedRefactor) annotation;
				System.out.println("Value :" + needRefactor.value());
			}
		}
	}

}
