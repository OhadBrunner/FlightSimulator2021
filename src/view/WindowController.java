package view;

import java.util.Observable;
import java.util.Observer;

import ViewModel.ViewModel;

public class WindowController implements Observer {
	
	
	// the view should bind the gui elements (aileron,rudder,throttle...) to the viewModel's 
	// properties which takes it from it's timeSeries instance
	
	ViewModel viewModel;
	// how do we get the runnable from the viewModel?
	Runnable viewRunnable;
	
	//time step - javafx element represents the Progress bar cuurent state
	
	

	public void loadCSVFile() {
		
		//show it on the screen
		
		//send it to the viewModel
		//viewModel.CreateTimeSeries(s);
	}

	public void init(ViewModel viewModel) {
		this.viewModel = viewModel;
		
		//viewModel.bindTimeStep(this.progressBar)........
		//this.aileron.bind(viewModel.aileron)......
	}
	
	
	
	public void paint() {
		viewRunnable.run();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
//	public void setViewModel(ViewModel viewModel) {
//		this.viewModel = viewModel;
//		
//		viewModel.bindCurrentPosition(currentPosition.textProperty());
//		viewModel.bindSpeed(speed.valueProperty());
//		viewModel.bindPosition(this.position.textProperty());
//	}
	
}
