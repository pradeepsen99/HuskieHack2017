package com.handbook.disasterhandbook;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JSON_Seperator {

	public String state = "";

	public JSON_Seperator(String StateName) {
		state = StateName;
	}

	//private Context context;

	public String[] getIncidentType() {
		//assetManager.open()
//		InputStreamReader is = new InputStream(getAssets()
//				.open("disasterdeclarationssummaries.csv"));
//		InputStream ins = getResources().openRawResource(
//				getResources().getIdentifier("FILENAME_WITHOUT_EXTENSION",
//						"raw", getPackageName()))
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream is = classLoader.getResources("");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		ArrayList<String> incident = new ArrayList<String>();
		try {
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] stateArr = line.split(cvsSplitBy);
				if (stateArr[8].equals(state)) {
					incident.add(stateArr[8]);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		String[] incidentArr = incident.toArray(new String[incident.size()]);

		return incidentArr;

	}

}
