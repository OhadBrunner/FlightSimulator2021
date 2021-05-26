package settings;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class XMLHandler {

	// creating Properties object from xml file
	public static FlightProperties readSettingObject(String properties) throws FileNotFoundException {

		XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(new File(properties)));
		FlightProperties obj = (FlightProperties) xmlDecoder.readObject();
		xmlDecoder.close();
		return obj;

	}

	// writing a Properties object into xml file
	public static void writeSettingObject(String file, FlightProperties obj) throws FileNotFoundException {
		XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(new File(file)));
		xmlEncoder.writeObject(obj);
		xmlEncoder.flush();
		xmlEncoder.close();
	}

}
