package ViewModel;


import java.util.Observable;
import java.util.Observer;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import model.AnomalyDetector;
import model.FlightGearplayer;
import settings.FlightProperties;

public class ViewModel implements Observer {


	FlightGearplayer model; 
	FlightProperties s;
	AnomalyDetector detector; // the algorithm
	public Runnable runnable; // the display function should be a runnable...not sure about it yet
	//public TimeSeries timeSeries;

	// javafx elements
	public IntegerProperty timeStep; // will be change every time the user slides the progress bar and gives us a new time step
	public boolean play;
	public boolean stop;
	public boolean pause;
	public DoubleProperty aileron; // X
	public DoubleProperty elevator; // Y
	public DoubleProperty rudder;
	public DoubleProperty throttle;

	public DoubleProperty Z; // altitude
	public DoubleProperty Y; // speed
	public DoubleProperty AK; // direction
	public DoubleProperty roll;
	public DoubleProperty pitch;
	public DoubleProperty yaw;


	public ViewModel(FlightGearplayer model) {

		this.model = model;
		this.model.addObserver(this);

		timeStep = new SimpleIntegerProperty();
		// these should be binding to the view's javafx element so every time the viewModel (using the timeSeries object)
		// make changes to these attributes, it will change the view's property and the gui as well 
		aileron = new SimpleDoubleProperty();
		elevator = new SimpleDoubleProperty();
		rudder = new SimpleDoubleProperty();
		throttle = new SimpleDoubleProperty();
		Z = new SimpleDoubleProperty();
		Y = new SimpleDoubleProperty();
		AK = new SimpleDoubleProperty();
		roll = new SimpleDoubleProperty();
		pitch = new SimpleDoubleProperty();
		yaw = new SimpleDoubleProperty(); //slip skid

		timeStep.addListener((o,ov,nv)->model.setTimeStep((int)nv)); // once the time step has changed in the viewModel, it will change the time step of the model



	}


	// there is an 'open' button the user uses to uplaod a csv file and that button triggers an openFunction
	// that send the csv to the viewModel (which send it to the model to create a new time series object)


	// examples for the binding

	public void bindTimeStep(IntegerProperty p) { // the view will use this to bind timeStep to it's progress bar element
		this.timeStep.bind(p); // letting the model know that the time step has been changed

		updateDisplayVariables();
	}


	public void bindAileron(DoubleProperty p) {
		aileron.bind(p);
	}


	public void loadAlgorithm(String fileName) {
		//detector = model.getLoader().load(fileName);
	}

	// we only want the view to get the paint function of the anomaly detector!
	public void bindDetector(AnomalyDetector anyDetector, Object obj) {
		//anyDetector.bin
	}

	public void getRunnable(Runnable r) {
		//we should think how to design it to make it work!
		//r.bind(this.runnable);
	}


	public void updateDisplayVariables() {

		
		aileron.set(model.getTimeSeries().features.get("aileron").get(timeStep.intValue()));
		elevator.set(model.getTimeSeries().features.get("elevator").get(timeStep.intValue()));
		rudder.set(model.getTimeSeries().features.get("rudder").get(timeStep.intValue()));
		throttle.set(model.getTimeSeries().features.get("throttle").get(timeStep.intValue()));
		Z.set(model.getTimeSeries().features.get("Z").get(timeStep.intValue()));
		Y.set(model.getTimeSeries().features.get("Y").get(timeStep.intValue()));
		AK.set(model.getTimeSeries().features.get("AK").get(timeStep.intValue()));
		roll.set(model.getTimeSeries().features.get("roll").get(timeStep.intValue()));
		pitch.set(model.getTimeSeries().features.get("pitch").get(timeStep.intValue()));
		yaw.set(model.getTimeSeries().features.get("yaw").get(timeStep.intValue()));

	}


	@Override
	public void update(Observable o, Object arg) {

		if (o == model) {

		}

	}


}
