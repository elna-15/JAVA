package encapsulation;

public class IdCard {
    private String cardId;
    private String issueDate;
    
	public IdCard(String cardId, String issueDate) {
		
		this.cardId = cardId;
		this.issueDate = issueDate;
		
	}
	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getissueDate() {
		return this.issueDate;
	}
	public void setissueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
    
}
