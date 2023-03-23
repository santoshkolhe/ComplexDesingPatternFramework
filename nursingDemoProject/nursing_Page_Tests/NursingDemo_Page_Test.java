package nursing_Page_Tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import common_Component.BaseClass;
import common_Component.Reporter;
import dataSource.PropertyReader;
import nursing_Page_Actions.Doctor_Convenience_IPD_Action;
import nursing_Page_Actions.New_Patient_Admission_Action;


public class NursingDemo_Page_Test extends BaseClass {
	//@Test(description="New Patient Admission with Valid Details")
	//description= "login",alwaysRun= true
	public void NursingDemoRegistration(Method method) throws IOException {
		try {
			
			New_Patient_Admission_Action nursingTwoPA = new New_Patient_Admission_Action(driver, logger);
			nursingTwoPA.newPatientAdmissionProcess(
					PropertyReader.get_Key_Value("verifyPage"),
					PropertyReader.get_Key_Value("Patient_UHID"), 
					PropertyReader.get_Key_Value("Patient_Name"),
					PropertyReader.get_Key_Value("Patient_Age"),
					PropertyReader.get_Key_Value("Date_Of_Birth"),
					PropertyReader.get_Key_Value("Gender"), 
					PropertyReader.get_Key_Value("Religion"),
					PropertyReader.get_Key_Value("Nationality"),
					PropertyReader.get_Key_Value("Guardian"),
					PropertyReader.get_Key_Value("Relation_With_Guardian"), 
					PropertyReader.get_Key_Value("Marital_Status"),
					PropertyReader.get_Key_Value("Contact_No"),
					PropertyReader.get_Key_Value("Alt_Contact_No"),
					PropertyReader.get_Key_Value("Address"),
					PropertyReader.get_Key_Value("District"),
					PropertyReader.get_Key_Value("Pincode"),
					PropertyReader.get_Key_Value("Police_Station"), 
					PropertyReader.get_Key_Value("Post_Office"),
					PropertyReader.get_Key_Value("Weight"),
					PropertyReader.get_Key_Value("Height"),
					PropertyReader.get_Key_Value("Blood_Pressure"), 
					PropertyReader.get_Key_Value("PulseRate"),
					PropertyReader.get_Key_Value("SpO2"),
					PropertyReader.get_Key_Value("Prov_Diagnosis"),
					PropertyReader.get_Key_Value("Insurence_Company"),
					PropertyReader.get_Key_Value("Select_TPA"),
					PropertyReader.get_Key_Value("Claim_Number"), 
					PropertyReader.get_Key_Value("Policy_No"),
					PropertyReader.get_Key_Value("Admission_Date"),
					PropertyReader.get_Key_Value("Referred_By"),
					PropertyReader.get_Key_Value("Under_Doctor"),
					PropertyReader.get_Key_Value("Case"), 
					PropertyReader.get_Key_Value("FIR_No"),
					PropertyReader.get_Key_Value("Room")
				);
					
			//PropertyReader.get_Key_Value("verifyPage"));
			logger.log(LogStatus.PASS,logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + " NursingDemo Login Test Succesfully passed");

		} catch (Exception e) {
			logger.log(LogStatus.FAIL,
					logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + e.toString().substring(1, 300));
		}
	}
	//@Test(dataProvider = "NursingDemo",priority=1,description="New Patient Admission with Data Provider")
	//description= "login",alwaysRun= true
	public void NursingDemoDataProvider(Method method,String verifyPage,
			String Patient_UHID,String Patient_Name,
			String Patient_Age,String Date_Of_Birth,String Gender,String Religion,String Nationality,String Guardian,String
			Relation_With_Guardian,String Marital_Status,String Contact_No,String Alt_Contact_No,String Address,String District,String 
			Pincode,String Police_Station,String Post_Office,String Weight,String Height,String Blood_Pressure,String PulseRate,String SpO2,String Prov_Diagnosis,String Insurence_Company,String Select_TPA,String Claim_Number,String Policy_No,String Admission_Date,String Referred_By,String Under_Doctor,String Case,String FIR_No,String Room) throws IOException {
		try {
			/*NursingDemoOne_Page_Action nursingOnePA = new NursingDemoOne_Page_Action(driver, logger);
			nursingOnePA.nursingDemoProcess(PropertyReader.get_Key_Value("pageOneTitle"), 
					PropertyReader.get_Key_Value("user"),
					PropertyReader.get_Key_Value("pass"));*/
			New_Patient_Admission_Action nursingTwoPA = new New_Patient_Admission_Action(driver, logger);
			nursingTwoPA.newPatientAdmissionProcess(verifyPage, Patient_UHID,Patient_Name,Patient_Age,Date_Of_Birth,Gender,Religion,Nationality,Guardian,Relation_With_Guardian,Marital_Status,Contact_No,Alt_Contact_No,Address,District,Pincode,Police_Station,Post_Office,Weight,Height,Blood_Pressure,PulseRate,SpO2,Prov_Diagnosis,Insurence_Company,Select_TPA,Claim_Number,Policy_No,Admission_Date,Referred_By,Under_Doctor,Case,FIR_No,Room);
					//PropertyReader.get_Key_Value("Bed");
			//PropertyReader.get_Key_Value("verifyPage"));
			logger.log(LogStatus.PASS,logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + " NursingDemo Login Test Succesfully passed");
                        
		} catch (Exception e) {
			logger.log(LogStatus.FAIL,
					logger.addScreenCapture(Reporter.takeScreenShot(driver, method)) + e.toString().substring(1, 300));
		}
	}
	

	@Test()//dependsOnMethods = {"NursingDemologin"}
	public void DoctorConvIPD(Method method) throws IOException{
		try {
			Doctor_Convenience_IPD_Action docConvIPD = new Doctor_Convenience_IPD_Action(driver, logger);
			docConvIPD.DoctorConvIPDProcess(PropertyReader.get_Key_Value("titleAfterLogin"), 
					PropertyReader.get_Key_Value("Doctor")); 
					
					
					                        
			logger.log(LogStatus.PASS, logger.addScreenCapture(Reporter.takeScreenShot(driver, method)),
					   "nursingDemo Doctor covenience IPD Test Successfully passed");

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, logger.addScreenCapture(Reporter.takeScreenShot(driver, method))
					+ e.toString().substring(1, 300));
		}
		
	}


}
