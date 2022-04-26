package gotten.momot;

public interface Datac_mr1Module {
	public static interface DecCPUCores {
		static interface Parameter {
			String X = DecCPUCores.NAME + Datac_mr1Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr1Module.MODULE + Datac_mr1Module.SEPARATOR + "decCPUCores";
	}

	public static interface DecCPUSpeed {
		static interface Parameter {
			String X = DecCPUSpeed.NAME + Datac_mr1Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr1Module.MODULE + Datac_mr1Module.SEPARATOR + "decCPUSpeed";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "datac_mr1";
	static String MODULE_NAME = "tcinputCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
