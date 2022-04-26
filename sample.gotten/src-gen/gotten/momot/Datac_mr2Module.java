package gotten.momot;

public interface Datac_mr2Module {
	public static interface DecNumBoards {
		static interface Parameter {
			String X = DecNumBoards.NAME + Datac_mr2Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr2Module.MODULE + Datac_mr2Module.SEPARATOR + "decNumBoards";
	}

	public static interface DecNodesPerBoard {
		static interface Parameter {
			String X = DecNodesPerBoard.NAME + Datac_mr2Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr2Module.MODULE + Datac_mr2Module.SEPARATOR + "decNodesPerBoard";
	}

	public static interface DecCPUCores {
		static interface Parameter {
			String X = DecCPUCores.NAME + Datac_mr2Module.SEPARATOR + "x";
		}

		static String NAME = Datac_mr2Module.MODULE + Datac_mr2Module.SEPARATOR + "decCPUCores";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "datac_mr2";
	static String MODULE_NAME = "tcinputCloud";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
