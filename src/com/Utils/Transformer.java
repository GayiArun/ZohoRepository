package com.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation Ann, Class cls, Constructor cnstr, Method mtd) {
		
		Ann.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
