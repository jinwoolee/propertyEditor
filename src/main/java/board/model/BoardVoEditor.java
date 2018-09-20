package board.model;

import java.beans.PropertyEditorSupport;

public class BoardVoEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new BoardVo(text));
	}
	
}
