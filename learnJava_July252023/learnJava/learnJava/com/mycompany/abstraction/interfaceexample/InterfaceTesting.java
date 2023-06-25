package com.mycompany.abstraction.interfaceexample;

import java.io.File;

public class InterfaceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File imageFile = new File("IMAGE_FILE_PATH");

		/**
		 * it does not rely on the specific implementation details of ImageSender or
		 * VideoSender. Instead, it uses the common contract defined by the Sender
		 * interface.
		 */
		Sender imageSender = new ImageSender();
		imageSender.send(imageFile); // Sending image: image.jpg

		/**
		 * you can switch the implementation from ImageSender to VideoSender (or any
		 * other implementation that adheres to the Sender interface) without needing to
		 * modify the code that interacts with the Sender interface.
		 */
		Sender videoSender = new VideoSender();
		videoSender.send(new File("video.mp4")); // Sending video: video.mp4
	}

}
