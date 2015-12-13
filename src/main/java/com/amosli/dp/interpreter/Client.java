package com.amosli.dp.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Context context  = new Context();
		List<AbstractExpression> expressions = new ArrayList<AbstractExpression>();
		expressions.add(new TerminalExpression());
		expressions.add(new NonTerminalExpression());
		expressions.add(new TerminalExpression());
		for (AbstractExpression abstractExpression : expressions) {
			abstractExpression.interpreter(context);
		}
	}
}
