package com.amosli.dp.interpreter;

public class NonTerminalExpression extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		System.out.println("this is NonTerminalExpression !");
	}

}
