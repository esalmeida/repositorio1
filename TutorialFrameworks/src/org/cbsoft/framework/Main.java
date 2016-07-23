package org.cbsoft.framework;
/*
 * Edson Saraiva de Almeida
 */
public class Main {
	
	public static void main(String[] args){
		Product p = new Product("notebook", "HP", 1999.99, "2348203894032948");
		CompositePostProcesso cpp = new CompositePostProcesso(new Crypto(5), new Compressor() );
		
		FileSerializer cxs = new FileSerializer(cpp, new PropertiesFormatter());
		cxs.generateFile("product.zip", p);
		
			
		
	}

}
