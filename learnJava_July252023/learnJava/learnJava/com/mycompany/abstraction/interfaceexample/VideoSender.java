package com.mycompany.abstraction.interfaceexample;

import java.io.File;

public class VideoSender implements Sender {

	@Override
	public void send(File fileToBeSent) {
		// Video sending implementation
		System.out.println("Video sender");

	}

}
