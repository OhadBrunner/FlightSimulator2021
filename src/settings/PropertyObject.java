package settings;

public class PropertyObject {
	
	
	protected String propertyName;
	protected int columnNumber;
	protected int min;
	protected int max;
	
	
	public PropertyObject(String propertyName, int columnNumber, int min, int max) {
		this.propertyName = propertyName;
		this.columnNumber = columnNumber;
		this.min = min;
		this.max = max;
	}


	public String getPropertyName() {
		return propertyName;
	}


	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


	public int getColumnNumber() {
		return columnNumber;
	}


	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}
	
	

}
