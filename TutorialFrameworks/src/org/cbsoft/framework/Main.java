package org.cbsoft.framework;
/*
 * Edson Saraiva de Almeida
 */
public class Main {
	
	public static void main(String[] args){
		Product p = new Product("notebook", "HP", 1999.99, "2348203894032948");
		SerializerBuilder builder = new SerializerBuilder(); 
		
		//Serializer cxs = builder.createPropertiesSerializer().withEncription(1).withLoggin().build();
		Serializer cxs = new SerializerLogger(new FileSerializer(new Crypto(1), new PropertiesFormatter() ) );
		cxs.generateFile("product.txt", p);
		
			
		
	}

}
