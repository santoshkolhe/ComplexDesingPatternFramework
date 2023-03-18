package nursing_Page_Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Functions_Web.WebAlert;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebButton;
import common_Functions_Web.WebCheckBox;
import common_Functions_Web.WebDropDown;
import common_Functions_Web.WebTextBox;
import common_Functions_Web.WebWait;
import nursing_Page_Locators.New_Patient_Admission_Locator;
import nursing_Page_Locators.NursingDemoOne_Page_Locator;

public class New_Patient_Admission_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public New_Patient_Admission_Locator patientDetailsPL = null;
	
	public New_Patient_Admission_Action(WebDriver driver ,ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		patientDetailsPL = new New_Patient_Admission_Locator(driver);
	}
	
	public void clickPatientMgnt(){
		//WebButton.click(patientDetailsPL.clkPatientMgnt(),logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientMgnt()), logger);
	}
	
	public void clickPatientRegi(){
		//WebButton.click(patientDetailsPL.clkPatientRegi(),logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientRegi()), logger);
	}
	public boolean validatePageTitle(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
		
	}
	
	public void patient_UHID(String patient_UHID){
		WebElement userName = patientDetailsPL.getUHIDId();
		//WebTextBox.sendInput(userName, patient_UHID, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, userName),patient_UHID, logger);
	}
	public void patient_Name(String name){
		//WebElement patientName=patientDetailsPL.getPatienName();
		WebTextBox.sendInput(patientDetailsPL.getPatienName(), name, logger);
		//WebTextBox.sendInput(WebWait.webElementClickable(driver,patientName),name, logger);
	}
	public void patient_Age(String age){
		//WebTextBox.sendInput(patientDetailsPL.getPatientAge(), age, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPatientAge()),age, logger);
	}
	public void birthDate(String date){
		//WebTextBox.sendInput(patientDetailsPL.getBirthDate(), date, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getBirthDate()),date, logger);
	}
	public void gender(String gender){
		WebDropDown.selectByVisibleText(patientDetailsPL.getGender(), gender, logger);
		
	}
	public void religion(String relision){
		WebDropDown.selectByVisibleText(patientDetailsPL.getReligion(), relision, logger);
	}
	public void nationality(String nationality){
		WebTextBox.sendInput(patientDetailsPL.getNationality(), nationality, logger);
	}
	public void guardian(String guardian){
		WebTextBox.sendInput(patientDetailsPL.getGuardian(), guardian, logger);
	}
	public void relation_With_Guardian(String relwithGuardian){
		WebTextBox.sendInput(patientDetailsPL.getRelation_With_Guardian(), relwithGuardian, logger);
	}
	public void marital_Status(String maritalStatus){
		WebDropDown.selectByVisibleText(patientDetailsPL.getMarital_Status(), maritalStatus, logger);
	}
	public void contact_No(String contactNo){
		WebTextBox.sendInput(patientDetailsPL.getContact_No(), contactNo, logger);
	}
	public void alt_Contact_No(String altContNo){
		WebTextBox.sendInput(patientDetailsPL.getAlt_Contact_No(), altContNo, logger);
	}
	public void address(String address){
		WebTextBox.sendInput(patientDetailsPL.getAddress(), address, logger);
	}
	public void district(String district){
		WebTextBox.sendInput(patientDetailsPL.getDistrict(), district, logger);
	}
	public void pincode(String pincode){
		WebTextBox.sendInput(patientDetailsPL.getPincode(), pincode, logger);
	}
	public void police_Station(String policeStation){
		WebTextBox.sendInput(patientDetailsPL.getPolice_Station(), policeStation, logger);
	}
	public void post_Office(String postOffice){
		WebTextBox.sendInput(patientDetailsPL.getPost_Office(), postOffice, logger);
	}
	public void weight(String weight){
		WebTextBox.sendInput(patientDetailsPL.getWeight(), weight, logger);
	}
	public void height(String height){
		WebTextBox.sendInput(patientDetailsPL.getHeight(), height, logger);
	}
	public void blood_Pressure(String bp){
		WebTextBox.sendInput(patientDetailsPL.getBlood_Pressure(), bp, logger);
	}
	public void pulseRate(String pr){
		WebTextBox.sendInput(patientDetailsPL.getPulseRate(), pr, logger);
	}
	public void spO2(String sp){
		WebTextBox.sendInput(patientDetailsPL.getSpO2(), sp, logger);
	}
	public void prov_Diagnosis(String prDia){
		WebTextBox.sendInput(patientDetailsPL.getProv_Diagnosis(), prDia, logger);
	}
	public void insurence_Company(String insuComp){
		WebDropDown.selectByVisibleText(patientDetailsPL.getInsurence_Company(), insuComp, logger);
	}
	public void select_TPA(String tpa){
		WebDropDown.selectByVisibleText(patientDetailsPL.getSelect_TPA(), tpa, logger);
	}
	public void claim_Number(String claimNumber){
		WebTextBox.sendInput(patientDetailsPL.getClaim_Number(), claimNumber, logger);
	}
	public void policy_No(String poNo){
		WebTextBox.sendInput(patientDetailsPL.getPolicy_No(), poNo, logger);
	}
	public void admission_Date(String admissionDate){
		WebTextBox.sendInput(patientDetailsPL.getAdmission_Date(), admissionDate, logger);
	}
	public void referred_By(String reBy){
		WebTextBox.sendInput(patientDetailsPL.getReferred_By(), reBy, logger);
	}
	public void Under_Doctor(String underDr){
		WebDropDown.selectByVisibleText(patientDetailsPL.getUnderDoctor(), underDr, logger);
	}
	public void patient_case(String patientCase){
		WebTextBox.sendInput(patientDetailsPL.getCase(), patientCase, logger);
	}
	public void fIR_No(String firNo){
		WebTextBox.sendInput(patientDetailsPL.getFIR_No(), firNo, logger);
	}
	public void room(String room){
		WebDropDown.selectByVisibleText(patientDetailsPL.getRoom(), room, logger);
	}
	public void bed(String bed){
		WebDropDown.selectByValue(patientDetailsPL.getBed(), bed, logger);
	}
	
	public void verifyPage(String verifyPage){
		WebBrowser.verify_Page(driver, verifyPage,logger);
	}
	public void addPatient(){
		WebTextBox.click(patientDetailsPL.addPatient(), logger);
		//WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.addPatient()), logger);
	}
	public void personalClkNext(){
		WebTextBox.click(patientDetailsPL.btnpersonalNext(), logger);
	}
	public void conntactNext(){
		WebTextBox.click(patientDetailsPL.btnconntactNext(), logger);
	}
	public void healthNext(){
		WebTextBox.click(patientDetailsPL.btnHelthNext(), logger);
	}
	public void successMSG(){
		WebTextBox.click(patientDetailsPL.alertHandle(),logger);
		
		
	}
	
	public void newPatientAdmissionProcess(String title, String patient_UHID, String name,String age,
			String date,String gender,String relision,String nationality,String guardian,
			String relwithGuardian,String maritalStatus,String contactNo,String altContNo,
			String address,String district,String pincode,String policeStation,String postOffice,
			String weight,String height,String bp,String pr,String sp,String prDia,
			String insuComp,String tpa,String claimNumber,String poNo,String admissionDate,
			String reBy,String underDr,String patientCase,String firNo,String room
			) throws InterruptedException {
		if(validatePageTitle(title)){
			clickPatientMgnt();
			clickPatientRegi();
			patient_UHID(patient_UHID);
			Thread.sleep(2000);
			patient_Name(name);
			Thread.sleep(2000);
			patient_Age(age);
			Thread.sleep(2000);
			birthDate(date);
			Thread.sleep(2000);
			gender(gender);
			Thread.sleep(2000);
			religion(relision);
			Thread.sleep(2000);
			nationality(nationality);
			Thread.sleep(2000);
			guardian(guardian);
			Thread.sleep(2000);
			relation_With_Guardian(relwithGuardian);
			Thread.sleep(2000);
			marital_Status(maritalStatus);
			Thread.sleep(2000);
			personalClkNext();
			Thread.sleep(2000);
			contact_No(contactNo);
			Thread.sleep(2000);
			alt_Contact_No(altContNo);
			Thread.sleep(2000);
			address(address);
			Thread.sleep(2000);
			district(district);
			Thread.sleep(2000);
			pincode(pincode);
			Thread.sleep(2000);
			police_Station(policeStation);
			Thread.sleep(2000);
			post_Office(postOffice);
			Thread.sleep(2000);
			conntactNext();
			Thread.sleep(2000);
			weight(weight);
			Thread.sleep(2000);
			height(height);
			Thread.sleep(2000);
			blood_Pressure(bp);
			Thread.sleep(2000);
			pulseRate(pr);
			Thread.sleep(2000);
			spO2(sp);
			Thread.sleep(2000);
			prov_Diagnosis(prDia);
			Thread.sleep(2000);
			insurence_Company(insuComp);
			Thread.sleep(2000);
			select_TPA(tpa);
			Thread.sleep(2000);
			claim_Number(claimNumber);
			Thread.sleep(2000);
			policy_No(poNo);
			Thread.sleep(2000);
			healthNext();
			Thread.sleep(2000);
			admission_Date(admissionDate);
			Thread.sleep(2000);
			referred_By(reBy);
			Thread.sleep(2000);
			Under_Doctor(underDr);
			Thread.sleep(2000);
			patient_case(patientCase);
			Thread.sleep(2000);
			fIR_No(firNo);
			Thread.sleep(2000);
			room(room);
			Thread.sleep(2000);
			//bed(bed);
			addPatient();
			Thread.sleep(2000);
			successMSG();
			//verifyPage(verifyPage);
		
			
		}
		else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}

}
