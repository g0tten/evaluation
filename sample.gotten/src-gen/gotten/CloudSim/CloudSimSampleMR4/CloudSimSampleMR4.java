package gotten.CloudSim.CloudSimSampleMR4;

import gotten.utils.IGottenExecutor;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class CloudSimSampleMR4 implements IGottenExecutor {
	private static void registerMetamorphicResult(Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results,
			String ruleName, String entryName, boolean leftHandSideEntryValue, boolean rightHandSideEntryValue) {
		Map<String, SimpleEntry<Boolean, Boolean>> entryMap = null;
		if (results.get(entryName) != null) {
			entryMap = results.get(entryName);
		} else {
			entryMap = new TreeMap<String, SimpleEntry<Boolean, Boolean>>();
		}
		entryMap.put(ruleName, new SimpleEntry<Boolean, Boolean>(leftHandSideEntryValue, rightHandSideEntryValue));
		results.put(entryName, entryMap);
	}

	public static Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> evaluateMR4() {
		Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results = new TreeMap<String, Map<String, SimpleEntry<Boolean, Boolean>>>();
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00001.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00003.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00004.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00005.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00006.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00007.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00008.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00009.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00010.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00011.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00012.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00013.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00014.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00015.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00016.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00017.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00018.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00019.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00020.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00021.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00022.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00023.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00024.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00025.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00026.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00027.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00028.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00029.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00030.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00031.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00032.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00033.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00034.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00035.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00036.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00037.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00038.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00039.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00040.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00041.model", true, true);
		registerMetamorphicResult(results, "MR4",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr4/followup_00042.model", true, true);
		return results;
	}
}
