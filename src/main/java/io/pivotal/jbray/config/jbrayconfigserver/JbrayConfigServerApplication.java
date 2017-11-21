package io.pivotal.jbray.config.jbrayconfigserver;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JbrayConfigServerApplication {

	//@Value("${configuration.name}")
	void setName(String name) {
		System.out.println("setting the name:  " + name);
	}

	public static void main(String[] args) {
		SpringApplication.run(JbrayConfigServerApplication.class, args);
	}
}
