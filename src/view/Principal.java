package view;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {

		ProcessosController procController = new ProcessosController();
//		String os = procController.os();
		
//		System.out.println(os);
		
		String process = "C:\\Windows\\regedit.exe";
		procController.callProcess(process);
		
//		String process = "TASKLIST /FO TABLE";
//		String process = "PING -t10 www.google.com.br";
//		String process = "TRACERt www.uol.com.br";
//		String process = "ipconfig";
//		procController.readProcess(process);
		
		String param = "cmd.exe";
		procController.killProcess(param);
	}

}
