package com.klinnovations.binding;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Book {
	
	private Integer id;
	private String name;
	private Double price;

}
