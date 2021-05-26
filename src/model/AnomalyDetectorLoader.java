package model;

import java.net.URL;
import java.net.URLClassLoader;

//the purpose of this class is to load different implementations of our Anomaly Detector interface (using plagins!)
//when someone asks the model to load a new anomaly detector the model should use this class to return a new instance
//of some anomaly detector
public class AnomalyDetectorLoader {
	
	
	public AnomalyDetector load(String fileName) throws Exception {
		
		
		//we should use the code here to generate an new anomaly detector using plagins
		AnomalyDetector ad;
		URLClassLoader urlClassLoader = URLClassLoader.newInstance(new URL[] {new URL("file://" + fileName)});
		Class<?> c = urlClassLoader.loadClass("ad");
		ad = (AnomalyDetector)c.newInstance();
		
		
		return ad; // return the timeSeriesAnomalyDetector\algorithm
	}

}
