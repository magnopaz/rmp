package com.magnopaz.robot_manager;

public class manager {

	public static void main(String[] args) {
		System.out.println("Iniciando execução do robo gerenciador.");
		
		try {
			Log lg = new Log();
			lg.logStep("Iniciando execução.");
			lg.logStep("Carregando robos");
			loadRobots();
			lg.logStep("Iniciando a execução dos robos");
			startRobot();
			lg.logStep("Finalizando a execução do robo gerenciador.");
			
		}
		catch(Exception e) {
			throw new UnsupportedOperationException();
		}

	}

	private static void loadRobots() {
		// TODO Auto-generated method stub
		
	}

	private static void startRobot() {
		// TODO Auto-generated method stub
		
	}

}
