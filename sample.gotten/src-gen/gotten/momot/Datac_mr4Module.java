package gotten.momot;

public interface Datac_mr4Module {
	public static interface DecBandwidth {
		static interface Parameter {
			String X = DecBandwidth.NAME + Datac_mr4Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr4Module.MODULE + Datac_mr4Module.SEPARATOR + "decBandwidth";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "datac_mr4";
	static String MODULE_NAME = "tcinputCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
