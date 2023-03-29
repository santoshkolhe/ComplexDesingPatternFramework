package nursing_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Patient_Admission_Locator {
	WebDriver driver = null;
	public New_Patient_Admission_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(xpath ="//span[text()='Patient Management']") 
	private WebElement ptab;
	public WebElement clkPatientMgnt(){
		return ptab;
	}
	@FindBy(xpath ="//a[normalize-space()='In-Patient Registration']") 
	////a[normalize-space()='New Patient Admission']
	private WebElement rTab;
	public WebElement clkPatientRegi(){
		return rTab;
	}
	
	@FindBy(xpath ="//input[@id='UHID']") 
	private WebElement uhid;
	public WebElement getUHIDId(){
		return uhid;
	}
	
	@FindBy(xpath ="//input[@id='Name']") 
	private WebElement patientName;
	public WebElement getPatienName(){
	return patientName;
	}
	
	@FindBy(xpath ="//input[@id='Age']") 
	private WebElement age;
	public WebElement getPatientAge(){
	return age;
	}
	@FindBy(xpath ="//input[@id='DOB']") 
	private WebElement dob;
	public WebElement getBirthDate(){
		return dob;
	}
	@FindBy(xpath="//select[@id='Gender']")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(xpath ="//select[@id='Religion']") 
	private WebElement religion;
	public WebElement getReligion(){
	return religion;
	}
	@FindBy(xpath ="//input[@id='Nationality']") 
	private WebElement Nationality;
	public WebElement getNationality(){
		return Nationality;
	}
	
	@FindBy(xpath ="//input[@id='Guardian']") 
	private WebElement Guardian;
	public WebElement getGuardian(){
	return Guardian;
	}
	
	@FindBy(xpath ="//input[@id='GuardianRelation']") 
	private WebElement rel_gardian;
	public WebElement getRelation_With_Guardian(){
	return rel_gardian;
	}
	@FindBy(xpath ="//select[@id='MaritalStatus']") 
	private WebElement Marital_Status;
	public WebElement getMarital_Status(){
		return Marital_Status;
	}
	
	@FindBy(xpath ="//input[@id='Contact']") 
	private WebElement Contact_No;
	public WebElement getContact_No(){
	return Contact_No;
	}
	
	@FindBy(xpath ="//input[@id='AltContact']") 
	private WebElement Alt_Contact_No;
	public WebElement getAlt_Contact_No(){
	return Alt_Contact_No;
	}
	@FindBy(xpath ="//input[@id='Address']") 
	private WebElement Address;
	public WebElement getAddress(){
		return Address;
	}
	
	@FindBy(xpath ="//input[@id='District']") 
	private WebElement District;
	public WebElement getDistrict(){
	return District;
	}
	
	@FindBy(xpath ="//input[@id='Pincode']") 
	private WebElement Pincode;
	public WebElement getPincode(){
	return Pincode;
	}
	@FindBy(xpath ="//input[@id='PoliceStation']") 
	private WebElement Police_Station;
	public WebElement getPolice_Station(){
		return Police_Station;
	}
	
	@FindBy(xpath ="//input[@id='PostOffice']") 
	private WebElement Post_Office;
	public WebElement getPost_Office(){
	return Post_Office;
	}
	
	@FindBy(xpath ="//input[@id='Weight']") 
	private WebElement Weight;
	public WebElement getWeight(){
	return Weight;
	}
	@FindBy(xpath ="//input[@id='Height']") 
	private WebElement Height;
	public WebElement getHeight(){
		return Height;
	}
	
	@FindBy(xpath ="//input[@id='BP']") 
	private WebElement Blood_Pressure;
	public WebElement getBlood_Pressure(){
	return Blood_Pressure;
	}
	
	@FindBy(xpath ="//input[@id='Pulse']") 
	private WebElement PulseRate;
	public WebElement getPulseRate(){
	return PulseRate;
	}
	@FindBy(xpath ="//input[@id='SPO2']") 
	private WebElement SpO2;
	public WebElement getSpO2(){
		return SpO2;
	}
	
	@FindBy(xpath ="//textarea[@id='ProvisionalDiagnosis']") 
	private WebElement Prov_Diagnosis;
	public WebElement getProv_Diagnosis(){
	return Prov_Diagnosis;
	}
	
	@FindBy(xpath ="//select[@id='InsurenceCompanyID']") 
	private WebElement Insurence_Company;
	public WebElement getInsurence_Company(){
	return Insurence_Company;
	}
	@FindBy(xpath ="//select[@id='HealthCardId']") 
	private WebElement Select_TPA;
	public WebElement getSelect_TPA(){
		return Select_TPA;
	}
	
	@FindBy(xpath ="//input[@id='HealthCardNo']") 
	private WebElement Claim_Number;
	public WebElement getClaim_Number(){
	return Claim_Number;
	}
	
	@FindBy(xpath ="//input[@id='PolicyNo']") 
	private WebElement Policy_No;
	public WebElement getPolicy_No(){
	return Policy_No;
	}
	@FindBy(xpath ="//input[@id='AdmissionDate']") 
	private WebElement Admission_Date;
	public WebElement getAdmission_Date(){
		return Admission_Date;
	}
	
	@FindBy(xpath ="//input[@id='ReferredBy']") 
	private WebElement Referred_By;
	public WebElement getReferred_By(){
	return Referred_By;
	}
	
	@FindBy(xpath ="//select[@id='DoctorID']") 
	private WebElement underDr;
	public WebElement getUnderDoctor(){
	return underDr;
	}
	@FindBy(xpath ="//input[@id='Case']") 
	private WebElement Case;
	public WebElement getCase(){
	return Case;
	}
	@FindBy(xpath ="//input[@id='FIR']") 
	private WebElement FIR_No;
	public WebElement getFIR_No(){
		return FIR_No;
	}
	
	@FindBy(xpath ="//select[@id='RoomID']") 
	private WebElement Room;
	public WebElement getRoom(){
	return Room;
	}
	
	@FindBy(xpath ="//select[@id='BedID']") 
	private WebElement Bed;
	public WebElement getBed(){
	return Bed;
	}
	@FindBy(xpath ="//input[@id='SaveBtn']") 
	private WebElement btnAddPatient;
	public WebElement addPatient(){
	return btnAddPatient;
	}
	@FindBy(xpath ="//button[@id='btnPersonalNext']") 
	private WebElement btnNext;
	public WebElement btnpersonalNext(){
	return btnNext;
	}
	@FindBy(xpath ="//button[@id='btnContactNext']") 
	private WebElement btnContactNext;
	public WebElement btnconntactNext(){
	return btnContactNext;
	}
	@FindBy(xpath ="//button[@id='btnHealthNext']") 
	private WebElement btnHelthNext;
	public WebElement btnHelthNext(){
	return btnHelthNext;
	}
	@FindBy(id="MessageButtonText") 
	private WebElement btnalert;
	public WebElement alertHandle(){
	return btnalert;
	}
}
