package model;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TimeSeries {


	public static final String delimiter = ",";
	public String[] columnNames;
	public Map<String, ArrayList<Double>> features;


	// creating a map from a csv file
	public TimeSeries(String input) {

		try {
			StringReader srReader = new StringReader(input);
			BufferedReader br = new BufferedReader(srReader);
			String line = "";
			String[] tempArr;
			int val = 0;
			while((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				if (val == 0) {
					columnNames = new String[tempArr.length];
					int j = 0;
					for(String tempStr : tempArr) {
						columnNames[j] = tempStr;
						j++;
					}

					features = new HashMap<String, ArrayList<Double>>();

					for (String str: tempArr) {


						features.put(str, new ArrayList<Double>());
					}

				} else {
					for (int i = 0; i < tempArr.length; i++) {
						String str = columnNames[i];
						features.get(str).add(Double.parseDouble(tempArr[i]));
					}
				}

				val++;
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Map<String, ArrayList<Double>> getFeatures() {
		return features;
	}


	public void setFeatures(Map<String, ArrayList<Double>> features) {
		this.features = features;
	}

}


