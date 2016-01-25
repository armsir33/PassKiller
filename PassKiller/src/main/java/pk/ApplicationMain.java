package pk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {
	private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);
	
	public static void main(String[] args) {
		log.info("Starting ....");
		SpringApplication.run(ApplicationMain.class, args);
		log.info("Terminating ...");
	}

}
