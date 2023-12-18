package testeOpenFeingDiegoWenndson.DiegoWenndson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DiegoWenndsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiegoWenndsonApplication.class, args);
	}

}
