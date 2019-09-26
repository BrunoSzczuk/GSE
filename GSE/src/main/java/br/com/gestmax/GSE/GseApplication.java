package br.com.gestmax.GSE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;

@SpringBootApplication(exclude = ContextRegionProviderAutoConfiguration.class)
public class GseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GseApplication.class, args);
	}

}
