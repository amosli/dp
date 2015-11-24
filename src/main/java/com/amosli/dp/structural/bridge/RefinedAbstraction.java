package com.amosli.dp.structural.bridge;

public class RefinedAbstraction extends Abstraction {

	@Override
	void operation(Implementor imp) {
		imp.operationImp();
		System.out.println("refined impl..");
	}

}
