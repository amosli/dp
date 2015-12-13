package com.amosli.dp.interpreter;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		System.out.println("this is terminal expression!!!");
	}

}
