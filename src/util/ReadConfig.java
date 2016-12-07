package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ReadConfig {
	Properties prop;
	public String FetchData(String Name,String keyval)
	{
		File src = new File(Name);
		FileInputStream fs;
		try {
			fs = new FileInputStream(src);
			prop = new Properties();
			try {
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String retkeyval = prop.getProperty(keyval);
		return retkeyval;
		
	}

}
