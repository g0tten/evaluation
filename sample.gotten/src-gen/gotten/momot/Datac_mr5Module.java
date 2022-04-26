package gotten.momot;

public interface Datac_mr5Module {
	public static interface DecMEMSpeed {
		static interface Parameter {
			String X = DecMEMSpeed.NAME + Datac_mr5Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr5Module.MODULE + Datac_mr5Module.SEPARATOR + "decMEMSpeed";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "datac_mr5";
	static String MODULE_NAME = "tcinputCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
