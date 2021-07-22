package NFOR;

import NFOR.NestedFor.IAction;

public class Main {

	public static void main(String[] args) {
	    for (int i = 0; i < 10; ++i) {
	        final int depth = i;
	        System.out.println("Depth " + depth);
	        IAction testAction = new IAction() {
	            public void act(int[] indices) {
	                System.out.print("Hello from level " + depth + ":");
	                for (int i : indices) { System.out.print(" " + i); }
	                System.out.println();
	            }
	        };
	        NestedFor nf = new NestedFor(0, 10, testAction);
	        nf.nFor(depth);
	    }
	}
}

