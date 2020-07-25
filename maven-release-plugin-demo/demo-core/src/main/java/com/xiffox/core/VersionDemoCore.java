package com.xiffox.core;

public class VersionDemoCore {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println("This program is running version " + VersionDemoCore.class.getPackage().getImplementationVersion());
	}

}
