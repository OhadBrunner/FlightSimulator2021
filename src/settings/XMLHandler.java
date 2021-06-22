package settings;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class XMLHandler {

	// Object Properties creator from XML file
	public static FlightProperties readSettingObject(String properties) throws FileNotFoundException {

		XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(new File(properties)));
		FlightProperties obj = (FlightProperties) xmlDecoder.readObject();
		xmlDecoder.close();
		return obj;

	}

	// Writing object Properties into xml file
	public static void writeObjectSetting(String file, FlightProperties obj) throws FileNotFoundException {
		XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(new File(file)));
		xmlEncoder.writeObject(obj);
		xmlEncoder.flush();
		xmlEncoder.close();
	}

}
