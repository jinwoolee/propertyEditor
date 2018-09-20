package board.model;

public class BoardVo {
	public BoardVo(String boardName) {
		this.boardName = boardName;
	}

	public BoardVo() {
		
	}
	
	private String boardCd;
	
	private String boardName;
	
	public String getBoardCd() {
		return boardCd;
	}

	public void setBoardCd(String boardCd) {
		this.boardCd = boardCd;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "BoardVo [boardCd=" + boardCd + ", boardName=" + boardName + "]";
	}
	
}
