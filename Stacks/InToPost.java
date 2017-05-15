package com.srishti.DSA;

public class InToPost {
	private Stack theStack;
	private String input;
	private String output = "";
	public InToPost(String in) {
		input = in;
		int stackSize = input.length();
		theStack = new Stack() ;		
	}
	public String doTrans() {
		for(int j = 0; j < input.length() ; j++) {
			char ch = input.charAt(j);
			switch(ch) {
			case '+':
			case '-':
				getOper(ch, 1);
			case '*':
			case '/':
				getOper(ch, 2);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while(!theStack.isEmpty()) {
			output = output + theStack.pop();
		}
		System.out.println(output);
		return output;
	}
	
	public void getOper(char opThis, int prec1) {
		while(!theStack.isEmpty()) {
			char opTop = (Character) theStack.pop();
			if(opTop == '(') {
				theStack.push(opTop);
				break;
			}
			
			else {
			 int prec2;
			 if(opTop == '+' || opTop == '-') {
				 prec2 = 1;
			 }
			 else {
				 prec2 = 2;
			 }
			 if(prec2 < prec1) {
				 theStack.push(opTop);
				 break;
			 }
			 else {
				 output = output + opTop;
			 }
			}
		}
		theStack.push(opThis);
	}
	public void gotParen(char ch) {
		while(!theStack.isEmpty()) {
			char chx = (Character) theStack.pop();
			if(chx == '(') {
				break;
			} else {
				output = output + chx;
			}
		}
	}
	public static void main(String[] args) {
		String input = "1+2*4/5-7+3/6";
		String output;
		InToPost theTrans = new InToPost(input) ;
		output = theTrans.doTrans();
		System.out.println("PostFix is " + output);
	}

	
}
