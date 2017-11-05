import java.util.ArrayList;
import java.util.Collections;

public class organizer {
	// Objective: convert state to two letter abbreviation then count and return top
	// 3 disaster types
	// initializes the types of disasters, for counting
	static String State = "";
	int CoastalStorm = 0;
	int Drought = 0;
	int Earthquake = 0;
	int Fire = 0;
	int Flood = 0;
	int Freezing = 0;
	int Hurricane = 0;
	int SevereIceStorm = 0;
	int SevereStorms = 0;
	int Snow = 0;
	int Tornado = 0;
	int Tsunami = 0;
	int Typhoon = 0;
	int Volcano = 0;
	int Wildfire = 0;
	ArrayList<String> top3 = new ArrayList<String>(); // this will store the top 3 most common disasters of an area
	ArrayList<Integer> allDisasters = new ArrayList<Integer>(); // this will store the frequency of each disaster of an
																// area for later sorting
	String[] disasterNames = { "Coastal Storm", "Drought", "Earthquake", "Fire", "Flood", "Freezing", "Hurricane",
			"Severe Ice Storm", "Snow", "Severe Storm", "Tornado", "Tsunami", "Typhoon", "Volcano", "Wilfire" };
	int pos = -1;
	String[] Disasters = null;
	String abv = "";

	public organizer(String stateName) {
		State = stateName;
		// this will import the different reported disasters and count their frequency
		// to establish likelihood / threat level
		stateConverter();
		JSON_Seperator state = new JSON_Seperator(abv);
		Disasters = JSON_Seperator.getIncidentType();
		disasterRate();

	}

	// convert state to two letter abbreviation
	public static void stateConverter() {
		String abv = "";
		switch (State) {
		case "Alabama":
			abv = "AL";
			break;
		case "Alaska":
			abv = "AK";
			break;
		case "Arizona":
			abv = "AZ";
			break;
		case "Arkansas":
			abv = "AR";
			break;
		case "California":
			abv = "CA";
			break;
		case "Colorado":
			abv = "CO";
			break;
		case "Connecticut":
			abv = "CT";
			break;
		case "Delaware":
			abv = "DE";
			break;
		case "Florida":
			abv = "FL";
			break;
		case "Georgia":
			abv = "GA";
			break;
		case "Hawaii":
			abv = "HI";
			break;
		case "Idaho":
			abv = "ID";
			break;
		case "Illinois":
			abv = "IL";
			break;
		case "Indiana":
			abv = "IN";
			break;
		case "Iowa":
			abv = "IA";
			break;
		case "Kansas":
			abv = "KS";
			break;
		case "Kentucky":
			abv = "KY";
			break;
		case "Louisiana":
			abv = "LA";
			break;
		case "Maine":
			abv = "ME";
			break;
		case "Maryland":
			abv = "MD";
			break;
		case "Massachusetts":
			abv = "MA";
			break;
		case "Michigan":
			abv = "MI";
			break;
		case "Minnesota":
			abv = "MN";
			break;
		case "Mississippi":
			abv = "MS";
			break;
		case "Missouri":
			abv = "MO";
			break;
		case "Montana":
			abv = "MT";
			break;
		case "Nebraska":
			abv = "NE";
			break;
		case "Nevada":
			abv = "NV";
			break;
		case "New Hampshire":
			abv = "NH";
			break;
		case "New Jersey":
			abv = "NJ";
			break;
		case "New Mexico":
			abv = "NM";
			break;
		case "New York":
			abv = "NY";
			break;
		case "North Carolina":
			abv = "NC";
			break;
		case "North Dakota":
			abv = "ND";
			break;
		case "Ohio":
			abv = "OH";
			break;
		case "Oklahoma":
			abv = "OK";
			break;
		case "Oregon":
			abv = "OR";
			break;
		case "Pennsylvania":
			abv = "PA";
			break;
		case "Rhode Island":
			abv = "RI";
			break;
		case "South Carolina":
			abv = "SC";
			break;
		case "South Dakota":
			abv = "SD";
			break;
		case "Tennessee":
			abv = "TN";
			break;
		case "Texas":
			abv = "TX";
			break;
		case "Utah":
			abv = "UT";
			break;
		case "Vermont":
			abv = "VT";
			break;
		case "Virginia":
			abv = "VA";
			break;
		case "Washington":
			abv = "WA";
			break;
		case "West Virginia":
			abv = "WV";
			break;
		case "Wisconsin":
			abv = "WI";
			break;
		case "Wyoming":
			abv = "WY";
			break;
		default:
			System.out.println("ERROR");
		}
	}

	// counts the # of each type of disaster
	public void disasterRate() {
		for (int i = Disasters.length - 1; i >= 0; i--) {
			switch (Disasters[i]) {
			case "Coastal Storm":
				CoastalStorm++;
				break;
			case "Drought":
				Drought++;
				break;
			case "Earthquake":
				Earthquake++;
				break;
			case "Fire":
				Fire++;
				break;
			case "Flood":
				Flood++;
				break;
			case "Freezing":
				Freezing++;
				break;
			case "Hurricane":
				Hurricane++;
				break;
			case "Severe Ice Storm":
				SevereIceStorm++;
				break;
			case "Snow":
				Snow++;
				break;
			case "Severe Storm":
				SevereStorms++;
				break;
			case "Severe Storms":
				SevereStorms++;
				break;
			case "Tornado":
				Tornado++;
				break;
			case "Tsunami":
				Tsunami++;
				break;
			case "Typhoon":
				Typhoon++;
				break;
			case "Volcano":
				Volcano++;
				break;
			case "Wildfire":
				Wildfire++;
				break;
			default:
				break;
			}
		}
		returnDisasterRate();
	}

	public String[] returnDisasterRate() {
		// this will form an arraylist of the different danger counts
		allDisasters.add(CoastalStorm);
		allDisasters.add(Drought);
		allDisasters.add(Earthquake);
		allDisasters.add(Fire);
		allDisasters.add(Flood);
		allDisasters.add(Freezing);
		allDisasters.add(Hurricane);
		allDisasters.add(SevereIceStorm);
		allDisasters.add(Snow);
		allDisasters.add(SevereStorms);
		allDisasters.add(Tornado);
		allDisasters.add(Tsunami);
		allDisasters.add(Typhoon);
		allDisasters.add(Volcano);
		allDisasters.add(Wildfire);

		// this will sort from highest int to lowest
		ArrayList<Integer> sortedArray = allDisasters;
		Collections.sort(sortedArray);
		Collections.reverse(sortedArray);
		int max = sortedArray.get(0); // this returns the max value

		// this will find the location of the max int and crossreference to what
		// disaster it is
		for (int counter = 0; counter < allDisasters.size(); counter++) {
			if (allDisasters.get(counter) == max) {
				pos = counter;
				break; // break incase array.get(0)==array,get(1)
			}
		}
		top3.add(disasterNames[pos]);

		// checks to see if there's a second max. If not, top3 will have 2 empty strings
		if (sortedArray.get(1) == 0) {
			top3.add("");
			top3.add("");
		} else // find the second max
		{
			if (sortedArray.get(0) == sortedArray.get(1)) // this will prevent duplication of disaster names in top3
			{
				allDisasters.set(pos, 0); // NOT removing this also allows us to keep the identity of the disaster that
											// the index represents
			}
			sortedArray.remove(0); // removes the previous max just so it doesn't interfere
			max = sortedArray.get(0); // gets the new highest value

			for (int counter = 0; counter < allDisasters.size(); counter++) {
				if (allDisasters.get(counter) == max) {
					pos = counter;
					break;
				}
			}
			top3.add(disasterNames[pos]);
			if (sortedArray.get(1) == 0) // checks to see if the remaining values are 0
			{
				top3.add("");
			} else {

				sortedArray.remove(0);
				for (int counter = 0; counter < allDisasters.size(); counter++) {
					if (allDisasters.get(counter) == max) {
						pos = counter;
						break;
					}
					top3.add(disasterNames[pos]);
				}
			}
			String[] topThree = top3.toArray(new String[top3.size()]);
			return topThree;
		}
		return new String[] { "Error", "IM PICKLE RICK" };
	}
}