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
			
			Cobol c = new Cobol();
			Token t = (Token) a.pop();
			if(t.sval() != null) {
				commentString = t.sval();
				} // end if
			
			c.setCommentLine(commentString);
			a.setTarget(c);
		}
}
