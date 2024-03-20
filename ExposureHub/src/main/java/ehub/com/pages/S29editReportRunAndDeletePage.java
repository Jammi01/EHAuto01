package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ehub.com.constants.AppConstants;

public class S29editReportRunAndDeletePage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S29editReportRunAndDeletePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewReport(String reportName) {
		String actual=common.createNewReportWithMapToolsStorms(reportName,AppConstants.class_Name_Offshore_Renewables_With_Entity_Name, AppConstants.aggegation_Select_Data_Policy_Type, AppConstants.peril_Name_War, AppConstants.coverage_Name_Damage_To_Existing_Property, AppConstants.storm_Name_Data, AppConstants.damage_Factor_Value_Hurricane_50_Nautical_Miles);
		return actual;
	}
	
	public void editReport() {
		common.editReportFromReportPage(AppConstants.report_Name+"29");
	}
	
	public void deleteReport() {
		common.deleteReportFromReportPage(AppConstants.report_Name+"29");
	}
}
