package nursing_Page_Actions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebDropDown;
import common_Functions_Web.WebTextBox;
import common_Functions_Web.WebWait;
import nursing_Page_Locators.New_Patient_Admission_Locator;


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
		//Fluent Wait
		//WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientMgnt()), logger);
		//Explicite Wait
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientMgnt(),Duration.ofSeconds(10)), logger);
	}
	
	public void clickPatientRegi(){
		//WebButton.click(patientDetailsPL.clkPatientRegi(),logger);
	//	WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientRegi()), logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.clkPatientRegi(),Duration.ofSeconds(10)), logger);
	}
	public boolean validatePageTitle(String expectedTitle){
		//boolean titleMatch=false;
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
		/*if(WebWait.webElementTitleIs(driver,expectedTitle ,Duration.ofSeconds(10))){
		WebBrowser.titleVerification(driver, expectedTitle,logger);
		}
		return titleMatch;
		*/
	}
	
	public void patient_UHID(String patient_UHID){
		//WebElement userName = patientDetailsPL.getUHIDId();
		//WebTextBox.sendInput(userName, patient_UHID, logger);
	//	WebTextBox.sendInput(WebWait.webElementClickable(driver, userName),patient_UHID, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getUHIDId(),Duration.ofSeconds(10)),patient_UHID, logger);
	}
	public void patient_Name(String name){
		//WebElement patientName=patientDetailsPL.getPatienName();
		//WebTextBox.sendInput(patientDetailsPL.getPatienName(), name, logger);
		//WebTextBox.sendInput(WebWait.webElementClickable(driver,patientName),name, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getPatienName(),Duration.ofSeconds(10)),name, logger);
	}
	public void patient_Age(String age){
		//WebTextBox.sendInput(patientDetailsPL.getPatientAge(), age, logger);
		//WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPatientAge()),age, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getPatientAge(),Duration.ofSeconds(10)),age, logger);
	}
	public void birthDate(String date){
		//WebTextBox.sendInput(patientDetailsPL.getBirthDate(), date, logger);
	//	WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getBirthDate()),date, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getBirthDate(),Duration.ofSeconds(10)),date, logger);
	}
	public void gender(String gender){
	//	WebDropDown.selectByVisibleText(patientDetailsPL.getGender(), gender, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver, patientDetailsPL.getGender(),Duration.ofSeconds(10)),gender, logger);
	}
	public void religion(String relision){
		//WebDropDown.selectByVisibleText(patientDetailsPL.getReligion(), relision, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver, patientDetailsPL.getReligion(),Duration.ofSeconds(10)),relision, logger);
	}
	public void nationality(String nationality){
		//WebTextBox.sendInput(patientDetailsPL.getNationality(), nationality, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getNationality(),Duration.ofSeconds(10)),nationality, logger);
	}
	public void guardian(String guardian){
		//WebTextBox.sendInput(patientDetailsPL.getGuardian(), guardian, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getGuardian(),Duration.ofSeconds(10)),guardian, logger);
	}
	public void relation_With_Guardian(String relwithGuardian){
	//	WebTextBox.sendInput(patientDetailsPL.getRelation_With_Guardian(), relwithGuardian, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getRelation_With_Guardian(),Duration.ofSeconds(10)),relwithGuardian, logger);
	}
	public void marital_Status(String maritalStatus){
	//	WebDropDown.selectByVisibleText(patientDetailsPL.getMarital_Status(), maritalStatus, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver, patientDetailsPL.getMarital_Status(),Duration.ofSeconds(10)),maritalStatus, logger);
	}
	public void contact_No(String contactNo){
		//WebTextBox.sendInput(patientDetailsPL.getContact_No(), contactNo, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getContact_No(),Duration.ofSeconds(10)),contactNo, logger);
	}
	public void alt_Contact_No(String altContNo){
		//WebTextBox.sendInput(patientDetailsPL.getAlt_Contact_No(), altContNo, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getAlt_Contact_No(),Duration.ofSeconds(10)),altContNo, logger);
	}
	public void address(String address){
		//WebTextBox.sendInput(patientDetailsPL.getAddress(), address, logger);
	WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getAddress(),Duration.ofSeconds(10)),address, logger);
	}
	public void district(String district){
		//WebTextBox.sendInput(patientDetailsPL.getDistrict(), district, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, patientDetailsPL.getDistrict(),Duration.ofSeconds(10)),district, logger);
	}
	public void pincode(String pincode){
	//	WebTextBox.sendInput(patientDetailsPL.getPincode(), pincode, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPincode(),Duration.ofSeconds(10)),pincode, logger);
	}
	public void police_Station(String policeStation){
		//WebTextBox.sendInput(patientDetailsPL.getPolice_Station(), policeStation, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPolice_Station(),Duration.ofSeconds(10)),policeStation, logger);
	}
	public void post_Office(String postOffice){
	//	WebTextBox.sendInput(patientDetailsPL.getPost_Office(), postOffice, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPost_Office(),Duration.ofSeconds(10)),postOffice, logger);
	}
	public void weight(String weight){
		//WebTextBox.sendInput(patientDetailsPL.getWeight(), weight, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getWeight(),Duration.ofSeconds(10)),weight, logger);
	}
	public void height(String height){
		//WebTextBox.sendInput(patientDetailsPL.getHeight(), height, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getHeight(),Duration.ofSeconds(10)),height, logger);
	}
	public void blood_Pressure(String bp){
		//WebTextBox.sendInput(patientDetailsPL.getBlood_Pressure(), bp, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getBlood_Pressure(),Duration.ofSeconds(10)),bp, logger);
	}
	public void pulseRate(String pr){
		//WebTextBox.sendInput(patientDetailsPL.getPulseRate(), pr, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPulseRate(),Duration.ofSeconds(10)),pr, logger);
	}
	public void spO2(String sp){
	//	WebTextBox.sendInput(patientDetailsPL.getSpO2(), sp, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getSpO2(),Duration.ofSeconds(10)),sp, logger);
	}
	public void prov_Diagnosis(String prDia){
		//WebTextBox.sendInput(patientDetailsPL.getProv_Diagnosis(), prDia, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getProv_Diagnosis(),Duration.ofSeconds(10)),prDia, logger);
	}
	public void insurence_Company(String insuComp){
	//	WebDropDown.selectByVisibleText(patientDetailsPL.getInsurence_Company(), insuComp, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver,patientDetailsPL.getInsurence_Company(),Duration.ofSeconds(10)),insuComp, logger);
	}
	public void select_TPA(String tpa){
		//WebDropDown.selectByVisibleText(patientDetailsPL.getSelect_TPA(), tpa, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver,patientDetailsPL.getSelect_TPA(),Duration.ofSeconds(10)),tpa, logger);
	}
	public void claim_Number(String claimNumber){
	//	WebTextBox.sendInput(patientDetailsPL.getClaim_Number(), claimNumber, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getClaim_Number(),Duration.ofSeconds(10)),claimNumber, logger);
	}
	public void policy_No(String poNo){
		//WebTextBox.sendInput(patientDetailsPL.getPolicy_No(), poNo, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getPolicy_No(),Duration.ofSeconds(10)),poNo, logger);
	}
	public void admission_Date(String admissionDate){
		//WebTextBox.sendInput(patientDetailsPL.getAdmission_Date(), admissionDate, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getAdmission_Date(),Duration.ofSeconds(10)),admissionDate, logger);
	}
	public void referred_By(String reBy){
		//WebTextBox.sendInput(patientDetailsPL.getReferred_By(), reBy, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getReferred_By(),Duration.ofSeconds(10)),reBy, logger);
	}
	public void Under_Doctor(String underDr){
	//	WebDropDown.selectByVisibleText(patientDetailsPL.getUnderDoctor(), underDr, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver,patientDetailsPL.getUnderDoctor(),Duration.ofSeconds(10)),underDr, logger);
	}
	public void patient_case(String patientCase){
		//WebTextBox.sendInput(patientDetailsPL.getCase(), patientCase, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getCase(),Duration.ofSeconds(10)),patientCase, logger);
	}
	public void fIR_No(String firNo){
		//WebTextBox.sendInput(patientDetailsPL.getFIR_No(), firNo, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver,patientDetailsPL.getFIR_No(),Duration.ofSeconds(10)),firNo, logger);
	}
	public void room(String room){
	//	WebDropDown.selectByVisibleText(patientDetailsPL.getRoom(), room, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver,patientDetailsPL.getRoom(),Duration.ofSeconds(10)),room, logger);
	}
	public void bed(String bed){
	//	WebDropDown.selectByValue(patientDetailsPL.getBed(), bed, logger);
		WebDropDown.selectByVisibleText(WebWait.webElementClickable(driver,patientDetailsPL.getBed(),Duration.ofSeconds(10)),bed, logger);
	}
	
	public void verifyPage(String verifyPage){
		WebBrowser.verify_Page(driver, verifyPage,logger);
	}
	public void addPatient(){
	//	WebTextBox.click(patientDetailsPL.addPatient(), logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.addPatient(),Duration.ofSeconds(10)), logger);
		}
	public void personalClkNext(){
		//WebTextBox.click(patientDetailsPL.btnpersonalNext(), logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.btnpersonalNext(),Duration.ofSeconds(10)), logger);
	}
	public void conntactNext(){
	//	WebTextBox.click(patientDetailsPL.btnconntactNext(), logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.btnconntactNext(),Duration.ofSeconds(10)), logger);
	}
	public void healthNext(){
	//	WebTextBox.click(patientDetailsPL.btnHelthNext(), logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.btnHelthNext(),Duration.ofSeconds(10)), logger);
	}
	public void successMSG(){
		//WebTextBox.click(patientDetailsPL.alertHandle(),logger);
		WebTextBox.click(WebWait.webElementClickable(driver, patientDetailsPL.alertHandle(),Duration.ofSeconds(10)), logger);
		
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
			patient_Name(name);
			patient_Age(age);
			birthDate(date);
     		gender(gender);
			religion(relision);
			nationality(nationality);
			guardian(guardian);
    		relation_With_Guardian(relwithGuardian);
			marital_Status(maritalStatus);
			personalClkNext();
			contact_No(contactNo);
			alt_Contact_No(altContNo);
			address(address);
			district(district);
			pincode(pincode);
			police_Station(policeStation);
    		post_Office(postOffice);
			conntactNext();
			weight(weight);
			height(height);
			blood_Pressure(bp);
			pulseRate(pr);
			spO2(sp);
			prov_Diagnosis(prDia);
			insurence_Company(insuComp);
			select_TPA(tpa);
			claim_Number(claimNumber);
		    policy_No(poNo);
			healthNext();
			admission_Date(admissionDate);
			referred_By(reBy);
			Under_Doctor(underDr);
			patient_case(patientCase);
			fIR_No(firNo);
			room(room);
			//bed(bed);
			addPatient();
			successMSG();
			//verifyPage(verifyPage);
				
		}
		else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}

}
