package com.retry_Analyser.base;



import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer_Utility implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation) {
		
		annotation.setRetryAnalyzer(Retry_Utility.class);
	}

}
