package gotten.Dissect.DissectSampleMR5;

import gotten.utils.IGottenExecutor;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class DissectSampleMR5 implements IGottenExecutor {
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

	public static Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> evaluateMR5() {
		Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results = new TreeMap<String, Map<String, SimpleEntry<Boolean, Boolean>>>();
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00001.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00002.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00003.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00004.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00005.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00006.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00007.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00008.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00009.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00010.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00011.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00012.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00013.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00014.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00015.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00016.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00017.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00018.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00019.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00020.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00021.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00022.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00023.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00024.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00025.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00026.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00027.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00028.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00029.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00030.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00031.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00032.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00033.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00034.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00035.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00036.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00037.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00038.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00039.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00040.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00041.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00042.model", false, true);
		registerMetamorphicResult(results, "MR5",
				"dcmodels/input_00001.model#dcmodels/input_00001/mr5/followup_00043.model", false, true);
		return results;
	}
}
