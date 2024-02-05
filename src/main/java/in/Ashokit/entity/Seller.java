package in.Ashokit.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Seller {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)	
	 private Integer sellerId;
	 private String  sellerName;
	  private  String  sellingItem;
	  private String Location;
	  
	  
	  

}
