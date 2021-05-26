package model;


public interface Model{
	
	
	public void setTimeSeries(TimeSeries ts);
	public void play(int start, int rate);
	public void pause();
	public void stop();
	public AnomalyDetectorLoader getLoader();
	//this method should send the view a new runnable instance (of an anomaly detector) and use it's paint function
	// something like that:
	// Runnable getPainter() {
	//   return ()->ad.paint(); // ad is an anomaly detector instance
 	// } // i just implemented it in flightfearpleayer
	public Runnable getPainter();

	
	//public void start();
}
