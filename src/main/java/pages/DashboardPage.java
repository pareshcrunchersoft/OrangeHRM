package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BaseTest {
	
	//private WebDriver driver;
    private int timeout = 15;
    
	@FindBy(css="#menu_pim_viewPimModule > b")
	private WebElement PIM;
	
	@FindBy(css="#menu_pim_viewEmployeeList")
	private WebElement MenuEmployeeList;
	
	@FindBy(css="input#empsearch_employee_name_empName")
	private WebElement input_employeeName;
	
	

    @FindBy(id = "aboutDisplayLink")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "menu_maintenance_accessEmployeeData")
    @CacheLookup
    private WebElement accessRecords;

    @FindBy(id = "menu_pim_addEmployee")
    @CacheLookup
    private WebElement addEmployee;

    @FindBy(id = "menu_leave_addLeaveEntitlement")
    @CacheLookup
    private WebElement addEntitlements;

    @FindBy(id = "menu_admin_viewAdminModule")
    @CacheLookup
    private WebElement admin;

    @FindBy(id = "menu_leave_assignLeave")
    @CacheLookup
    private WebElement assignLeave1;

    @FindBy(css = "#dashboard-quick-launch-panel-menu_holder table.quickLaungeContainer tbody tr td:nth-of-type(1) div.quickLaunge a")
    @CacheLookup
    private WebElement assignLeave2;

    @FindBy(id = "addCancel")
    @CacheLookup
    private WebElement cancel;

    @FindBy(id = "menu_maintenance_purgeCandidateData")
    @CacheLookup
    private WebElement candidateRecords;

    @FindBy(id = "menu_recruitment_viewCandidates")
    @CacheLookup
    private WebElement candidates;

    @FindBy(id = "menu_admin_Configuration")
    @CacheLookup
    private WebElement configuration1;

    @FindBy(id = "menu_pim_Configuration")
    @CacheLookup
    private WebElement configuration2;

    @FindBy(id = "menu_leave_Configure")
    @CacheLookup
    private WebElement configure1;

    @FindBy(id = "menu_performance_Configure")
    @CacheLookup
    private WebElement configure2;

    @FindBy(id = "menu_pim_listCustomFields")
    @CacheLookup
    private WebElement customFields;

    @FindBy(id = "menu_dashboard_index")
    @CacheLookup
    private WebElement dashboard;

    @FindBy(id = "menu_admin_pimCsvImport")
    @CacheLookup
    private WebElement dataImport;

    @FindBy(id = "menu_directory_viewDirectory")
    @CacheLookup
    private WebElement directory;

    @FindBy(id = "menu_admin_viewEducation")
    @CacheLookup
    private WebElement education;

    @FindBy(id = "menu_admin_listMailConfiguration")
    @CacheLookup
    private WebElement emailConfiguration;

    @FindBy(id = "menu_admin_viewEmailNotification")
    @CacheLookup
    private WebElement emailSubscriptions;

    @FindBy(id = "menu_leave_viewLeaveEntitlements")
    @CacheLookup
    private WebElement employeeEntitlements;

    @FindBy(id = "menu_pim_viewEmployeeList")
    @CacheLookup
    private WebElement employeeList;

    @FindBy(id = "menu_maintenance_purgeEmployee")
    @CacheLookup
    private WebElement employeeRecords;

    @FindBy(id = "menu_performance_viewEmployeePerformanceTrackerList")
    @CacheLookup
    private WebElement employeeTrackers;

    @FindBy(id = "menu_admin_employmentStatus")
    @CacheLookup
    private WebElement employmentStatus;

    @FindBy(id = "menu_leave_Entitlements")
    @CacheLookup
    private WebElement entitlements;

    @FindBy(id = "menu_admin_viewOrganizationGeneralInformation")
    @CacheLookup
    private WebElement generalInformation;

    @FindBy(id = "menu_leave_viewHolidayList")
    @CacheLookup
    private WebElement holidays;

    @FindBy(id = "menu_admin_Job")
    @CacheLookup
    private WebElement job;

    @FindBy(id = "menu_admin_jobCategory")
    @CacheLookup
    private WebElement jobCategories;

    @FindBy(id = "menu_admin_viewJobTitleList")
    @CacheLookup
    private WebElement jobTitles;

    @FindBy(id = "menu_performance_searchKpi")
    @CacheLookup
    private WebElement kpis;

    @FindBy(id = "menu_admin_viewLanguages")
    @CacheLookup
    private WebElement languages;

    @FindBy(id = "menu_leave_viewLeaveModule")
    @CacheLookup
    private WebElement leave;

    @FindBy(id = "menu_leave_viewLeaveBalanceReport")
    @CacheLookup
    private WebElement leaveEntitlementsAndUsageReport;

    @FindBy(id = "menu_leave_viewLeaveList")
    @CacheLookup
    private WebElement leaveList1;

    @FindBy(css = "a[href='/index.php/leave/viewLeaveList']")
    @CacheLookup
    private WebElement leaveList2;

    @FindBy(id = "menu_leave_defineLeavePeriod")
    @CacheLookup
    private WebElement leavePeriod;

    @FindBy(id = "menu_leave_leaveTypeList")
    @CacheLookup
    private WebElement leaveTypes;

    @FindBy(id = "menu_admin_viewLicenses")
    @CacheLookup
    private WebElement licenses;

    @FindBy(id = "menu_admin_localization")
    @CacheLookup
    private WebElement localization;

    @FindBy(id = "menu_admin_viewLocations")
    @CacheLookup
    private WebElement locations;

    @FindBy(css = "a[href='/index.php/auth/logout']")
    @CacheLookup
    private WebElement logout;

    @FindBy(id = "menu_maintenance_purgeEmployee")
    @CacheLookup
    private WebElement maintenance;

    @FindBy(id = "menu_performance_ManageReviews")
    @CacheLookup
    private WebElement manageReviews1;

    @FindBy(id = "menu_performance_searchPerformancReview")
    @CacheLookup
    private WebElement manageReviews2;

    @FindBy(id = "MP_link")
    @CacheLookup
    private WebElement marketplace;

    @FindBy(id = "menu_admin_membership")
    @CacheLookup
    private WebElement memberships;

    @FindBy(id = "menu_admin_viewModules")
    @CacheLookup
    private WebElement modules;

    @FindBy(id = "menu_admin_nationality")
    @CacheLookup
    private WebElement nationalities;

    @FindBy(css = "#togglConfirm div:nth-of-type(3) input:nth-of-type(1)")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "menu_pim_configurePim")
    @CacheLookup
    private WebElement optionalFields;

    @FindBy(css = "a[href='http://www.orangehrm.com/']")
    @CacheLookup
    private WebElement orangehrm;

    @FindBy(css = "a[href='http://www.orangehrm.com']")
    @CacheLookup
    private WebElement orangehrmInc;

    @FindBy(id = "menu_admin_Organization")
    @CacheLookup
    private WebElement organization;

    private final String pageLoadedText = "Leave Entitlements and Usage Report";

    private final String pageUrl = "/index.php/dashboard";

    @FindBy(id = "menu_admin_viewPayGrades")
    @CacheLookup
    private WebElement payGrades;

    @FindBy(id = "menu__Performance")
    @CacheLookup
    private WebElement performance;

    @FindBy(id = "menu_pim_viewPimModule")
    @CacheLookup
    private WebElement pim;

    @FindBy(id = "menu_maintenance_PurgeRecords")
    @CacheLookup
    private WebElement purgeRecords;

    @FindBy(id = "menu_admin_Qualifications")
    @CacheLookup
    private WebElement qualifications;

    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    @CacheLookup
    private WebElement recruitment;

    @FindBy(id = "menu_admin_registerOAuthClient")
    @CacheLookup
    private WebElement registerOauthClient;

    @FindBy(id = "menu_pim_viewReportingMethods")
    @CacheLookup
    private WebElement reportingMethods;

    @FindBy(id = "menu_core_viewDefinedPredefinedReports")
    @CacheLookup
    private WebElement reports1;

    @FindBy(id = "menu_leave_Reports")
    @CacheLookup
    private WebElement reports2;

    @FindBy(id = "menu_admin_viewSkills")
    @CacheLookup
    private WebElement skills;

    @FindBy(id = "menu_admin_openIdProvider")
    @CacheLookup
    private WebElement socialMediaAuthentication;

    @FindBy(id = "menu_admin_viewCompanyStructure")
    @CacheLookup
    private WebElement structure;

    @FindBy(id = "menu_pim_viewTerminationReasons")
    @CacheLookup
    private WebElement terminationReasons;

    @FindBy(id = "menu_time_viewTimeModule")
    @CacheLookup
    private WebElement time;

    @FindBy(css = "a[href='/index.php/time/viewEmployeeTimesheet']")
    @CacheLookup
    private WebElement timesheets;

    @FindBy(id = "menu_performance_addPerformanceTracker")
    @CacheLookup
    private WebElement trackers;

    @FindBy(id = "menu_admin_UserManagement")
    @CacheLookup
    private WebElement userManagement;

    @FindBy(id = "menu_admin_viewSystemUsers")
    @CacheLookup
    private WebElement users;

    @FindBy(id = "menu_recruitment_viewJobVacancy")
    @CacheLookup
    private WebElement vacancies;

    @FindBy(id = "welcome")
    @CacheLookup
    private WebElement welcomeAdmin;

    @FindBy(id = "menu_admin_workShift")
    @CacheLookup
    private WebElement workShifts;

    @FindBy(id = "menu_leave_defineWorkWeek")
    @CacheLookup
    private WebElement workWeek;

    public DashboardPage() {
    	PageFactory.initElements(driver, this);
    }

   
    /**
     * Click on About Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Access Records Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAccessRecordsLink() {
        accessRecords.click();
        return this;
    }

    /**
     * Click on Add Employee Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAddEmployeeLink() {
        addEmployee.click();
        return this;
    }

    /**
     * Click on Add Entitlements Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAddEntitlementsLink() {
        addEntitlements.click();
        return this;
    }

    /**
     * Click on Admin Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAdminLink() {
        admin.click();
        return this;
    }

    /**
     * Click on Assign Leave Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAssignLeave1Link() {
        assignLeave1.click();
        return this;
    }

    /**
     * Click on Assign Leave Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickAssignLeave2Link() {
        assignLeave2.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickCancelButton() {
        cancel.click();
        return this;
    }

    /**
     * Click on Candidate Records Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickCandidateRecordsLink() {
        candidateRecords.click();
        return this;
    }

    /**
     * Click on Candidates Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickCandidatesLink() {
        candidates.click();
        return this;
    }

    /**
     * Click on Configuration Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickConfiguration1Link() {
        configuration1.click();
        return this;
    }

    /**
     * Click on Configuration Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickConfiguration2Link() {
        configuration2.click();
        return this;
    }

    /**
     * Click on Configure Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickConfigure1Link() {
        configure1.click();
        return this;
    }

    /**
     * Click on Configure Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickConfigure2Link() {
        configure2.click();
        return this;
    }

    /**
     * Click on Custom Fields Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickCustomFieldsLink() {
        customFields.click();
        return this;
    }

    /**
     * Click on DashboardPage Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickDashboardPageLink() {
        dashboard.click();
        return this;
    }

    /**
     * Click on Data Import Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickDataImportLink() {
        dataImport.click();
        return this;
    }

    /**
     * Click on Directory Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickDirectoryLink() {
        directory.click();
        return this;
    }

    /**
     * Click on Education Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEducationLink() {
        education.click();
        return this;
    }

    /**
     * Click on Email Configuration Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmailConfigurationLink() {
        emailConfiguration.click();
        return this;
    }

    /**
     * Click on Email Subscriptions Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmailSubscriptionsLink() {
        emailSubscriptions.click();
        return this;
    }

    /**
     * Click on Employee Entitlements Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmployeeEntitlementsLink() {
        employeeEntitlements.click();
        return this;
    }

    /**
     * Click on Employee List Link.
     *
     * @return the DashboardPage class instance.
     * @throws InterruptedException 
     */
    public EmployeeList clickEmployeeListLink() throws InterruptedException {
    	pim.click();
    	Thread.sleep(1000);
        employeeList.click();
        return new EmployeeList();
    }

    /**
     * Click on Employee Records Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmployeeRecordsLink() {
        employeeRecords.click();
        return this;
    }

    /**
     * Click on Employee Trackers Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmployeeTrackersLink() {
        employeeTrackers.click();
        return this;
    }

    /**
     * Click on Employment Status Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEmploymentStatusLink() {
        employmentStatus.click();
        return this;
    }

    /**
     * Click on Entitlements Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickEntitlementsLink() {
        entitlements.click();
        return this;
    }

    /**
     * Click on General Information Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickGeneralInformationLink() {
        generalInformation.click();
        return this;
    }

    /**
     * Click on Holidays Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickHolidaysLink() {
        holidays.click();
        return this;
    }

    /**
     * Click on Job Categories Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickJobCategoriesLink() {
        jobCategories.click();
        return this;
    }

    /**
     * Click on Job Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickJobLink() {
        job.click();
        return this;
    }

    /**
     * Click on Job Titles Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickJobTitlesLink() {
        jobTitles.click();
        return this;
    }

    /**
     * Click on Kpis Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickKpisLink() {
        kpis.click();
        return this;
    }

    /**
     * Click on Languages Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLanguagesLink() {
        languages.click();
        return this;
    }

    /**
     * Click on Leave Entitlements And Usage Report Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeaveEntitlementsAndUsageReportLink() {
        leaveEntitlementsAndUsageReport.click();
        return this;
    }

    /**
     * Click on Leave Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeaveLink() {
        leave.click();
        return this;
    }

    /**
     * Click on Leave List Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeaveList1Link() {
        leaveList1.click();
        return this;
    }

    /**
     * Click on Leave List Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeaveList2Link() {
        leaveList2.click();
        return this;
    }

    /**
     * Click on Leave Period Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeavePeriodLink() {
        leavePeriod.click();
        return this;
    }

    /**
     * Click on Leave Types Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLeaveTypesLink() {
        leaveTypes.click();
        return this;
    }

    /**
     * Click on Licenses Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLicensesLink() {
        licenses.click();
        return this;
    }

    /**
     * Click on Localization Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLocalizationLink() {
        localization.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickLogoutLink() {
        logout.click();
        return this;
    }

    /**
     * Click on Maintenance Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickMaintenanceLink() {
        maintenance.click();
        return this;
    }

    /**
     * Click on Manage Reviews Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickManageReviews1Link() {
        manageReviews1.click();
        return this;
    }

    /**
     * Click on Manage Reviews Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickManageReviews2Link() {
        manageReviews2.click();
        return this;
    }

    /**
     * Click on Marketplace Button.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickMarketplaceButton() {
        marketplace.click();
        return this;
    }

    /**
     * Click on Memberships Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickMembershipsLink() {
        memberships.click();
        return this;
    }

    /**
     * Click on Modules Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickModulesLink() {
        modules.click();
        return this;
    }

    /**
     * Click on Nationalities Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickNationalitiesLink() {
        nationalities.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Optional Fields Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickOptionalFieldsLink() {
        optionalFields.click();
        return this;
    }

    /**
     * Click on Orangehrm Inc Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickOrangehrmIncLink() {
        orangehrmInc.click();
        return this;
    }

    /**
     * Click on Orangehrm Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickOrangehrmLink() {
        orangehrm.click();
        return this;
    }

    /**
     * Click on Organization Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickOrganizationLink() {
        organization.click();
        return this;
    }

    /**
     * Click on Pay Grades Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickPayGradesLink() {
        payGrades.click();
        return this;
    }

    /**
     * Click on Performance Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickPerformanceLink() {
        performance.click();
        return this;
    }

    /**
     * Click on Pim Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickPimLink() {
        pim.click();
        return this;
    }

    /**
     * Click on Purge Records Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickPurgeRecordsLink() {
        purgeRecords.click();
        return this;
    }

    /**
     * Click on Qualifications Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickQualificationsLink() {
        qualifications.click();
        return this;
    }

    /**
     * Click on Recruitment Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickRecruitmentLink() {
        recruitment.click();
        return this;
    }

    /**
     * Click on Register Oauth Client Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickRegisterOauthClientLink() {
        registerOauthClient.click();
        return this;
    }

    /**
     * Click on Reporting Methods Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickReportingMethodsLink() {
        reportingMethods.click();
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickReports1Link() {
        reports1.click();
        return this;
    }

    /**
     * Click on Reports Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickReports2Link() {
        reports2.click();
        return this;
    }

    /**
     * Click on Skills Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickSkillsLink() {
        skills.click();
        return this;
    }

    /**
     * Click on Social Media Authentication Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickSocialMediaAuthenticationLink() {
        socialMediaAuthentication.click();
        return this;
    }

    /**
     * Click on Structure Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickStructureLink() {
        structure.click();
        return this;
    }

    /**
     * Click on Termination Reasons Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickTerminationReasonsLink() {
        terminationReasons.click();
        return this;
    }

    /**
     * Click on Time Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickTimeLink() {
        time.click();
        return this;
    }

    /**
     * Click on Timesheets Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickTimesheetsLink() {
        timesheets.click();
        return this;
    }

    /**
     * Click on Trackers Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickTrackersLink() {
        trackers.click();
        return this;
    }

    /**
     * Click on User Management Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickUserManagementLink() {
        userManagement.click();
        return this;
    }

    /**
     * Click on Users Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickUsersLink() {
        users.click();
        return this;
    }

    /**
     * Click on Vacancies Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickVacanciesLink() {
        vacancies.click();
        return this;
    }

    /**
     * Click on Welcome Admin Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickWelcomeAdminLink() {
        welcomeAdmin.click();
        return this;
    }

    /**
     * Click on Work Shifts Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickWorkShiftsLink() {
        workShifts.click();
        return this;
    }

    /**
     * Click on Work Week Link.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage clickWorkWeekLink() {
        workWeek.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the DashboardPage class instance.
     */
    public DashboardPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }


}
