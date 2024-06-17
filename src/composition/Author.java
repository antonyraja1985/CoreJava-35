package composition;

//entity
//pojo class
//getter setter
public class Author {
	
  private  String authorName;
  private	String authorAdress;
  private	String authorPhone;
  
 public Author(String authorName, String authorAdress, String authorPhone) {
	super();
	this.authorName = authorName;
	this.authorAdress = authorAdress;
	this.authorPhone = authorPhone;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public String getAuthorAdress() {
	return authorAdress;
}

public void setAuthorAdress(String authorAdress) {
	this.authorAdress = authorAdress;
}

public String getAuthorPhone() {
	return authorPhone;
}

public void setAuthorPhone(String authorPhone) {
	this.authorPhone = authorPhone;
}
  
  
  
  

}
