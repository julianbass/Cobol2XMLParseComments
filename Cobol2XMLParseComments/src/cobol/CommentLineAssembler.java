package cobol;

import java.util.Stack;

import parse.*;
import parse.tokens.*;

public class CommentLineAssembler extends Assembler {
		/**
		 * Pop a string, and set the target DataDivision to this
		 * string.
		 *
		 * @param   Assembly   the assembly to work on
		 */
		public void workOn(Assembly a) {
			String commentString = null;
			//System.out.println("commentLineAssembler - start");
			Stack stack = a.getStack();
			System.out.println("Stack = " + stack.toString());
			Cobol c = new Cobol();
			while( a.hasMoreElements() ) {
				//System.out.println("commentLineAssembler - start" + a.hasMoreElements());
				Token t = (Token) a.pop();
				//System.out.println("commentLineAssembler - start" + a.hasMoreElements());
				if(t.sval() != null) {
					commentString = commentString + t.sval();
					System.out.println("comment string = " + commentString);
					//c.setCommentLine(t.sval().trim());
					//a.setTarget(c); 
					} // end if
				} // end while
			c.setCommentLine(commentString);
			a.setTarget(c);
			System.out.println("commentLineAssembler - end");
		}
}
