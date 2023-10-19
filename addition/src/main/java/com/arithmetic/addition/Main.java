package com.arithmetic.addition;

import io.helidon.microprofile.server.Server;

public class Main {
	private Main() {}
	public static void main(String[] args) {
		Server server = startServer();
		System.out.println("http://localhost:" + server.port() + "/greet");
	}
	static Server startServer() {
		return Server.create().start();
	}
}
