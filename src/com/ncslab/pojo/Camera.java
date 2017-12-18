package com.ncslab.pojo;



public class Camera {
	private int id;
	private String nameCN;
	private String nameEN;
	private String webURL;
	private int width;
	private int height;
	private int testRigid;
	private String testRigName;
	private Boolean workState;

	public void setWorkState(Boolean workState) {
		this.workState = workState;
	}

	public String getNameEN() {
		return nameEN;
	}

	public Boolean getWorkState() {
		return workState;
	}

	public void setNameEN(String nameEN) {
		this.nameEN = nameEN;
	}



	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getTestRigid() {
		return testRigid;
	}

	public void setTestRigid(int testRigid) {
		this.testRigid = testRigid;
	}

	public String getTestRigName() {
		return testRigName;
	}


	public void setTestRigName(String testRigName) {
		this.testRigName = testRigName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNameCN() {
		return nameCN;
	}

	public void setNameCN(String nameCN) {
		this.nameCN = nameCN;
	}

	@Override
	public String toString() {
		return "Camera{" +
				"id=" + id +
				", workState=" + workState +
				", nameCN='" + nameCN + '\'' +
				", nameEN='" + nameEN + '\'' +
				", webURL='" + webURL + '\'' +
				", width=" + width +
				", height=" + height +
				", testRigid=" + testRigid +
				", testRigName='" + testRigName + '\'' +
				'}';
	}
}
