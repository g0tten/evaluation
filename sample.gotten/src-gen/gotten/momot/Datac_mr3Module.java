package gotten.momot;

public interface Datac_mr3Module {
	public static interface DecDiskSpeed {
		static interface Parameter {
			String X = DecDiskSpeed.NAME + Datac_mr3Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr3Module.MODULE + Datac_mr3Module.SEPARATOR + "decDiskSpeed";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "datac_mr3";
	static String MODULE_NAME = "tcinputCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
