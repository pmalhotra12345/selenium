package com.mycompany.abstraction.interfaceexample;
import java.io.File;
public class ImageSender implements Sender {
	 @Override
	    public void send(File fileToBeSent) {
	        // image sending implementation code.
		 System.out.println("Image sender");
	    }
}
