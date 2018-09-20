package org.iothome.iptime.propertyeditor;

import static org.junit.Assert.*;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;

import org.junit.Test;

import board.model.BoardVo;

class BoardVoPropertyEditorTest {

	//boardVo propertyEditor test
	@Test
	void boardVoPropertyEditorTest() {
		/***Given***/
		//객체와 propertyEditor가 같은 package이면 등록없이 사용 가능
		//단 editor 이름은 객체+Editor
		//PropertyEditorManager.registerEditor(BoardVo.class, BoardVoEditor.class);
		PropertyEditor editor = PropertyEditorManager.findEditor(BoardVo.class);

		/***When***/
		editor.setAsText("board-");

		/***Then***/
		BoardVo boardVo = (BoardVo)editor.getValue();
		assertEquals("board-", boardVo.getBoardName());
	}

}
