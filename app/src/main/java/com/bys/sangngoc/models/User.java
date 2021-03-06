package com.bys.sangngoc.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Admin on 4/13/2017.
 */

public class User implements Serializable{
    @SerializedName("id")
    private int id;
    @SerializedName("userName")
    private String userName;
    @SerializedName("employeeNo")
    private String employeeNo;
    @SerializedName("employeeName")
    private String employeeName;
    @SerializedName("branchName")
    private String branchName;
    @SerializedName("employeeDob")
    private long employeeDob;
    @SerializedName("employeeGenderCombo")
    private String employeeGenderCombo;
    @SerializedName("employeeTel")
    private String employeeTel;
    @SerializedName("employeeIDNumber")
    private String employeeIDNumber;
    @SerializedName("employeeAddress")
    private String employeeContactAddress;
    @SerializedName("employeeEmail")
    private String employeeEmail;
    @SerializedName("departmentName")
    private String departmentName;
    @SerializedName("departmentRoomName")
    private String departmentRoomName;
    @SerializedName("employeePicture")
    private String employeePicture;
    @SerializedName("employeePictureUrl")
    private String employeePictureUrl;
    @SerializedName("employeeAvatar")
    private String employeeAvatar;

    @SerializedName("levelName")
    private String levelName;
    @SerializedName("employeeBirthPlace")
    private String employeeBirthPlace;
    @SerializedName("department")
    private Department department;
    @SerializedName("departmentRoom")
    private DepartmentRoom departmentRoom;
    @SerializedName("branch")
    private Branch branch;
    @SerializedName("level")
    private Level level;
    @SerializedName("employeeTaxNumber")
    private String employeeTaxNumber;
    @SerializedName("employeeBankAccount")
    private String employeeBankAccount;
    @SerializedName("employeeContractSlrAmt")
    private String employeeContractSlrAmt;
    @SerializedName("employeeSalaryFactor")
    private String employeeSalaryFactor;
    @SerializedName("employeeWorkingSlrAmt")
    private String employeeWorkingSlrAmt;
    @SerializedName("employeeExtraSalary")
    private String employeeExtraSalary;
    @SerializedName("employeeSocialInsNo")
    private String employeeSocialInsNo;
    @SerializedName("employeeSocialInsRegisteredDate")
    private long employeeSocialInsRegisteredDate;
    @SerializedName("employeeSocialInsExpiryDate")
    private long employeeSocialInsExpiryDate;
    @SerializedName("employeeHealthInsNo")
    private String employeeHealthInsNo;
    @SerializedName("employeeHealthInsRegisteredDate")
    private long employeeHealthInsRegisteredDate;
    @SerializedName("employeeHealthInsExpiryDate")
    private long employeeHealthInsExpiryDate;
    @SerializedName("employeeHealthInsRegisteredPlace")
    private String employeeHealthInsRegisteredPlace;

    private boolean isChecked;

    public User(){}
    public User(String employeeName){
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public long getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(long employeeDob) {
        this.employeeDob = employeeDob;
    }

    public String getEmployeeGenderCombo() {
        return employeeGenderCombo;
    }

    public void setEmployeeGenderCombo(String employeeGenderCombo) {
        this.employeeGenderCombo = employeeGenderCombo;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
    }

    public String getEmployeeIDNumber() {
        return employeeIDNumber;
    }

    public void setEmployeeIDNumber(String employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber;
    }

    public String getEmployeeContactAddress() {
        return employeeContactAddress;
    }

    public void setEmployeeContactAddress(String employeeContactAddress) {
        this.employeeContactAddress = employeeContactAddress;
    }



    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentRoomName() {
        return departmentRoomName;
    }

    public void setDepartmentRoomName(String departmentRoomName) {
        this.departmentRoomName = departmentRoomName;
    }

    //    public String getEmployeePictureUrl() {
//        return employeePictureUrl;
//    }
//
//    public void setEmployeePictureUrl(String employeePictureUrl) {
//        this.employeePictureUrl = employeePictureUrl;
//    }
//    public String getEmployeePicture() {
//        return employeePicture;
//    }
//
//    public void setEmployeePicture(String employeePicture) {
//        this.employeePicture = employeePicture;
//    }

    public String getEmployeeAvatar() {
        return employeeAvatar;
    }

    public void setEmployeeAvatar(String employeeAvatar) {
        this.employeeAvatar = employeeAvatar;
    }

    public String getEmployeePicture() {
        return employeePicture;
    }

    public void setEmployeePicture(String employeePicture) {
        this.employeePicture = employeePicture;
    }

    public String getEmployeePictureUrl() {
        return employeePictureUrl;
    }

    public void setEmployeePictureUrl(String employeePictureUrl) {
        this.employeePictureUrl = employeePictureUrl;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getEmployeeBirthPlace() {
        return employeeBirthPlace;
    }

    public void setEmployeeBirthPlace(String employeeBirthPlace) {
        this.employeeBirthPlace = employeeBirthPlace;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public DepartmentRoom getDepartmentRoom() {
        return departmentRoom;
    }

    public void setDepartmentRoom(DepartmentRoom departmentRoom) {
        this.departmentRoom = departmentRoom;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getEmployeeTaxNumber() {
        return employeeTaxNumber;
    }

    public void setEmployeeTaxNumber(String employeeTaxNumber) {
        this.employeeTaxNumber = employeeTaxNumber;
    }

    public String getEmployeeBankAccount() {
        return employeeBankAccount;
    }

    public void setEmployeeBankAccount(String employeeBankAccount) {
        this.employeeBankAccount = employeeBankAccount;
    }

    public String getEmployeeContractSlrAmt() {
        return employeeContractSlrAmt;
    }

    public void setEmployeeContractSlrAmt(String employeeContractSlrAmt) {
        this.employeeContractSlrAmt = employeeContractSlrAmt;
    }

    public String getEmployeeSalaryFactor() {
        return employeeSalaryFactor;
    }

    public void setEmployeeSalaryFactor(String employeeSalaryFactor) {
        this.employeeSalaryFactor = employeeSalaryFactor;
    }

    public String getEmployeeWorkingSlrAmt() {
        return employeeWorkingSlrAmt;
    }

    public void setEmployeeWorkingSlrAmt(String employeeWorkingSlrAmt) {
        this.employeeWorkingSlrAmt = employeeWorkingSlrAmt;
    }

    public String getEmployeeExtraSalary() {
        return employeeExtraSalary;
    }

    public void setEmployeeExtraSalary(String employeeExtraSalary) {
        this.employeeExtraSalary = employeeExtraSalary;
    }

    public String getEmployeeSocialInsNo() {
        return employeeSocialInsNo;
    }

    public void setEmployeeSocialInsNo(String employeeSocialInsNo) {
        this.employeeSocialInsNo = employeeSocialInsNo;
    }

    public long getEmployeeSocialInsRegisteredDate() {
        return employeeSocialInsRegisteredDate;
    }

    public void setEmployeeSocialInsRegisteredDate(long employeeSocialInsRegisteredDate) {
        this.employeeSocialInsRegisteredDate = employeeSocialInsRegisteredDate;
    }

    public long getEmployeeSocialInsExpiryDate() {
        return employeeSocialInsExpiryDate;
    }

    public void setEmployeeSocialInsExpiryDate(long employeeSocialInsExpiryDate) {
        this.employeeSocialInsExpiryDate = employeeSocialInsExpiryDate;
    }

    public String getEmployeeHealthInsNo() {
        return employeeHealthInsNo;
    }

    public void setEmployeeHealthInsNo(String employeeHealthInsNo) {
        this.employeeHealthInsNo = employeeHealthInsNo;
    }

    public long getEmployeeHealthInsRegisteredDate() {
        return employeeHealthInsRegisteredDate;
    }

    public void setEmployeeHealthInsRegisteredDate(long employeeHealthInsRegisteredDate) {
        this.employeeHealthInsRegisteredDate = employeeHealthInsRegisteredDate;
    }

    public long getEmployeeHealthInsExpiryDate() {
        return employeeHealthInsExpiryDate;
    }

    public void setEmployeeHealthInsExpiryDate(long employeeHealthInsExpiryDate) {
        this.employeeHealthInsExpiryDate = employeeHealthInsExpiryDate;
    }

    public String getEmployeeHealthInsRegisteredPlace() {
        return employeeHealthInsRegisteredPlace;
    }

    public void setEmployeeHealthInsRegisteredPlace(String employeeHealthInsRegisteredPlace) {
        this.employeeHealthInsRegisteredPlace = employeeHealthInsRegisteredPlace;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
