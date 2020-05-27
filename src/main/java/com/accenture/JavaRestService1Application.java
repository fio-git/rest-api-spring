/*package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaRestService1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestService1Application.class, args);
	}

}*/


package com.accenture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaRestService1Application implements ApplicationRunner {
    private static final Logger logger = LogManager.getLogger(JavaRestService1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(JavaRestService1Application.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("DEBUG LOG");
        logger.info("INFO LOG");
        logger.warn("WARNING LOG");
        logger.error("ERROR LOG");
        logger.fatal("FATAL ERROR LOG");
    }
}
