package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.entity.Seller;
import in.Ashokit.repo.SellerRepository;

@SpringBootApplication
public class GeneratorswithDataJpa6Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	    context= SpringApplication.run(GeneratorswithDataJpa6Application.class, args);
         SellerRepository         repo=context.getBean(SellerRepository.class);

          Seller e1 = new Seller();
     
          e1.setSellerName("Raju ");
          e1.setLocation ("Hyd");
          e1.setSellingItem("mobile");
         repo.save(e1);
         
	}

}
