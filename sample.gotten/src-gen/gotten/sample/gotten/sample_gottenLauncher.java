package gotten.sample.gotten;

import gotten.CloudSim.CloudSimSampleMR1.CloudSimSampleMR1;
import gotten.CloudSim.CloudSimSampleMR2.CloudSimSampleMR2;
import gotten.CloudSim.CloudSimSampleMR3.CloudSimSampleMR3;
import gotten.CloudSim.CloudSimSampleMR4.CloudSimSampleMR4;
import gotten.CloudSim.CloudSimSampleMR5.CloudSimSampleMR5;
import gotten.CloudSim.CloudSimSampleMR6.CloudSimSampleMR6;
import gotten.Dissect.DissectSampleMR1.DissectSampleMR1;
import gotten.Dissect.DissectSampleMR2.DissectSampleMR2;
import gotten.Dissect.DissectSampleMR3.DissectSampleMR3;
import gotten.Dissect.DissectSampleMR4.DissectSampleMR4;
import gotten.Dissect.DissectSampleMR5.DissectSampleMR5;
import gotten.Dissect.DissectSampleMR6.DissectSampleMR6;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

public class sample_gottenLauncher {
	private Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> results = new TreeMap<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>>();

	public Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> evaluateCloudSim() {
		results.put("CloudSim#MR1", CloudSimSampleMR1.evaluateMR1());
		results.put("CloudSim#MR2", CloudSimSampleMR2.evaluateMR2());
		results.put("CloudSim#MR3", CloudSimSampleMR3.evaluateMR3());
		results.put("CloudSim#MR4", CloudSimSampleMR4.evaluateMR4());
		results.put("CloudSim#MR5", CloudSimSampleMR5.evaluateMR5());
		results.put("CloudSim#MR6", CloudSimSampleMR6.evaluateMR6());
		return results;
	}

	public Map<String, Map<String, Map<String, SimpleEntry<Boolean, Boolean>>>> evaluateDissect() {
		results.put("Dissect#MR1", DissectSampleMR1.evaluateMR1());
		results.put("Dissect#MR2", DissectSampleMR2.evaluateMR2());
		results.put("Dissect#MR3", DissectSampleMR3.evaluateMR3());
		results.put("Dissect#MR4", DissectSampleMR4.evaluateMR4());
		results.put("Dissect#MR5", DissectSampleMR5.evaluateMR5());
		results.put("Dissect#MR6", DissectSampleMR6.evaluateMR6());
		return results;
	}
}
