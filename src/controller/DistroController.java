package controller;

public class DistroController {
	public DistroController() {
		super();
	}

	/*
	 * Identifica e retorna o nome do Sistema Operacional.
	 */
	private String os() {
		return System.getProperty("os.name");
	}

	/*
	 * Verifica o SO e, se for Linux, selecione o comando para exibir as
	 * propriedades da distribuição.
	 */
	public String exibeDistro() {
		String os = os();
		if (os.contains("Linux")) {
			Process process = createProcess("cat /etc/os-release");

			return null;
		}

		return "This is not a Linux Computer";
	}

	private Process createProcess(String proc) {
		String[] comand = proc.split(" ");

		return null;
	}
}
