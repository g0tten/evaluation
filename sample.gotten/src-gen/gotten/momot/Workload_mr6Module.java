package gotten.momot;

public interface Workload_mr6Module {
	public static interface DeleteTrace {
		static String NAME = Workload_mr6Module.MODULE + Workload_mr6Module.SEPARATOR + "deleteTrace";
	}

	public static interface DeleteTraceUnit {
		static String NAME = Workload_mr6Module.MODULE + Workload_mr6Module.SEPARATOR + "deleteTraceUnit";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "workload_mr6";
	static String MODULE_NAME = "workloadCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
