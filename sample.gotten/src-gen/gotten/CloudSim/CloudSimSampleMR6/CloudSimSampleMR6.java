package gotten.CloudSim.CloudSimSampleMR6;

import gotten.utils.IGottenExecutor;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class CloudSimSampleMR6 implements IGottenExecutor {
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

	public static Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> evaluateMR6() {
		Map<String, Map<String, SimpleEntry<Boolean, Boolean>>> results = new TreeMap<String, Map<String, SimpleEntry<Boolean, Boolean>>>();
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00001.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00002.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00003.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00004.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00005.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00006.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00007.model", true, true);
		registerMetamorphicResult(results, "MR6",
				"workloads/workload_00001.model#workloads/workload_00001/mr6/followup_00008.model", true, true);
		return results;
	}
}
