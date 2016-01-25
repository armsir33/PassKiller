package pk.thymeleaf;

public class Challenge {
	private boolean isShow;
	private boolean isErrorShow;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public boolean isErrorShow() {
		return isErrorShow;
	}

	public void setErrorShow(boolean isErrorShow) {
		this.isErrorShow = isErrorShow;
	}

}
