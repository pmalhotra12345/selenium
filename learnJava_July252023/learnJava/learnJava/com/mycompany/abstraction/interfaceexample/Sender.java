package com.mycompany.abstraction.interfaceexample;

import java.io.File;
// To define the contract, but not worried about how it is implemented and who is it implementing
public interface Sender {
	void send(File fileToBeSent);
}
