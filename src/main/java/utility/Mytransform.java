package utility;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.yaml.snakeyaml.constructor.Constructor;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class Mytransform implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructer,Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
		
	}
	

}
