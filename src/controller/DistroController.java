package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
			InputStreamReader flow = new InputStreamReader(process.getInputStream());
			try (BufferedReader buffer = new BufferedReader(flow)) {
				StringBuffer text = new StringBuffer();
				String line = buffer.readLine();

				while (line != null) {
					if (line.contains("NAME") && !line.contains("PRETTY")) {
						text.append("Distro Name:\r\n");
						String[] linha = line.split("=");
						text.append(linha[1]);
						text.append("\r\n");
					} else if (line.contains("VERSION") && !line.contains("CODENAME")) {
						text.append("Distro Version:\r\n");
						String[] linha = line.split("=");
						text.append(linha[1]);
						text.append("\r\n");
					}
					line = buffer.readLine();
				}

				return text.toString();
			} catch (Exception e) {
				return e.getMessage();
			}
		}

		return "This is not a Linux Computer";
	}

	private Process createProcess(String proc) {
		try {
			String[] comand = proc.split(" ");
			return Runtime.getRuntime().exec(comand);

		} catch (Exception e) {
			System.err.println(e);
		}

		return null;
	}
}
