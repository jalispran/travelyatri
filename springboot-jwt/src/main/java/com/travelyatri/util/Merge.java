package com.travelyatri.util;

import java.lang.reflect.Field;

import com.travelyatri.exception.ClassMismatchException;

public class Merge {

	public static Object objects(Object oldObject, Object newObject) throws ClassMismatchException {
		if(oldObject != null && newObject != null)
			return processMerging(oldObject, newObject);
		else if (oldObject == null)
			return newObject;
		else return null;
	}

	private static Object processMerging(Object oldObject, Object newObject) throws ClassMismatchException{
		Class<? extends Object> oldClas = oldObject.getClass();
		Class<? extends Object> newClas = newObject.getClass();
		
		System.out.println("merge method called");
		
		if(!oldClas.equals(newClas))
			throw new ClassMismatchException("class of both the objects should be same");

		System.out.println("classes are same");
		
		Field[] fields = oldClas.getFields();
		
		System.out.println("fields : " + fields);
		
		for(Field f : fields) {
			System.out.println("accessible is to be set");
			f.setAccessible(true);
			System.out.println("accessible set");
			try {
				Object newValue = f.get(newObject);
				System.out.println("newValueFromReflection : " + newValue);
				if(newValue != null)
					f.set(oldObject, newValue);
			} 
			catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				return oldObject;
			}
		}
		return oldObject;

	}
}
