package com.mycompany.accessmodifier;

public class PrivateMethodAndVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateMethodAndVariable privateMethodAndVariable = new PrivateMethodAndVariable();
		privateMethodAndVariable.publicMethod();
		//privateMethodAndVariable.privateMethod();// Will give compilation error as privateMethod is not visible becuase of private access modifier
		//privateMethodAndVariable.privateVariable();// Will give compilation error as privateMethod is not visible becuase of private access modifier
	}

}
