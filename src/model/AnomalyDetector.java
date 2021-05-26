package model;

import java.util.List;

public interface AnomalyDetector {
    
    
    //the purpose of this method is to take all the features and to do a learning process using pearson to avaluate
    //which features are coorelated and should be represented by a linear equation
    //the ts object is just restoring the data (the maps with all the features)
	void learnNormal(TimeSeries ts);
	
	//this method will get a timeSeries object and eventually return a list of errors
	List<AnomalyReport> detect(TimeSeries ts);
	
	
	// we should think how to paint whatever the anomaly detector is calculating at the moment
	// and what parameters should it get?
	// we should also convey this function to the view so it could change the gui using strategy pattern
	void paint();
	
	
}
