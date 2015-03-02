package com.jeff.sbtstudy.annotation; 

import java.io.IOException;


class JavaToCatchException {
	public void run() {
		try {
			//If do not enclose in try, compiler will throw error
			ScalaThrowsAnnot.doException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}