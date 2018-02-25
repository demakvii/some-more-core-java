package com.techlabs.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.techlabs.annotation.Foo;
import com.techlabs.annotation.NeedRefactor;

@SuppressWarnings({ "unused", "rawtypes" })
public class AnnotationCountTest {

	public static void main(String[] args) {

		Class<Foo> fooClass = Foo.class;

		System.out.println("Class Name:" + fooClass.getSimpleName());

		System.out.println("Total no of Methods:" + (getMethodCount(fooClass)));

		System.out.println("Total no of Constructors:"
				+ getConstructorCount(fooClass));

		System.out.println("Total no of Fields:" + getFieldCount(fooClass));

		System.out.println("Total no of Annotations:"
				+ getAnnotationCount(fooClass));

	}

	private static int getAnnotationCount(Class otherClass) {
		int count = 0;
		Annotation[] annotations = otherClass.getAnnotations();
		for (Annotation annotation : annotations) {
			count++;
		}
		Method[] methods = otherClass.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(NeedRefactor.class))
				count++;
		}
		return count;

	}

	private static int getFieldCount(Class otherClass) {
		int count = 0;
		Field[] fields = otherClass.getDeclaredFields();
		for (Field field : fields) {
			count++;
		}
		return count;

	}

	private static int getConstructorCount(Class otherClass) {
		int count = 0;

		Constructor[] constructors = otherClass.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			count++;
		}
		return count;

	}

	private static int getMethodCount(Class otherClass) {
		int count = 0;
		Method[] methods = otherClass.getDeclaredMethods();
		for (Method method : methods) {
			count++;
		}
		return count;
	}

}
