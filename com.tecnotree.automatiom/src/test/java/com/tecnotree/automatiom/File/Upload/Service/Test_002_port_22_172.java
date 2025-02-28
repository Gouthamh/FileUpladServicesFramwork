package com.tecnotree.automatiom.File.Upload.Service;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tecnotree.automatiom.Listerns.BTest;
import com.tecnotree.automatiom.Listerns.Extent;
import com.tecnotree.automatiom.Methods.Method;
import com.tecnotree.automatiom.Pojo.FileUpload;
import com.tecnotree.automatiom.Pojo.MasterFiledServiceConfigure;
import com.tecnotree.automatiom.ReUsedMethods.DiffsentsFiles;
import com.tecnotree.automatiom.routers.Routers;
import com.tecnotree.automatiom.routers.SFTP_Info;
import com.tecnotree.automatiom.routers.ServiceName;
import com.tecnotree.automatiom.utilities.SFTP;

import io.restassured.response.Response;

@Listeners(com.tecnotree.automatiom.Listerns.TC2.class)
public class Test_002_port_22_172{
	
	@BeforeClass
	public void masterDataUpdate() throws JsonProcessingException {
		
		MasterFiledServiceConfigure master = new MasterFiledServiceConfigure(ServiceName.localHost_22,8,"SFTP",5000,new FileUpload("9367",500,"/home/tecnotree/BulkStorage/"));
		
        ObjectMapper Obj = new ObjectMapper();  
        String jsonStr = Obj.writeValueAsString(master);
        Response response=Method.Put(jsonStr, Routers.base_url,Routers.dapFileUploadService,Routers.updateConfiguration);
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("responseStatus").toString(), "SUCCESS");
		Assert.assertEquals(response.jsonPath().getString("responseDesc").toString(), "Service with name :"+ServiceName.localHost_22+" updated successfully");


	}

	@BeforeMethod
	public void sftpremove() {
		SFTP.sftpremove(SFTP_Info.sftpHost_172_20_21_227, SFTP_Info.sftpPort_22, SFTP_Info.sftpUserName_172_20_21_227, SFTP_Info.sftpPassword_172_20_21_227,SFTP_Info.sshKey_172_20_21_227, SFTP_Info.sftppath_172_20_21_227);

	}
	
@Test(groups = "JSON")
	public void JSON() throws InterruptedException, IOException {
    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("JSON.json",ServiceName.localHost_22);
	}
	@Test(groups = "SQL")
	public void SQl() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("1-DDL_DML-script+(School+DB).sql",ServiceName.localHost_22);
	}
	@Test	(groups = "TAR")
	public void tar() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("apache-maven-3.9.2-bin.tar",ServiceName.localHost_22);
	}
	@Test(groups = "BPMN")
	public void BPMN() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		
		DiffsentsFiles.differentMethods1("BPMN.bpmn",ServiceName.localHost_22);
	}
	@Test(groups = "YMAL")
	public void YMAL() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("dap-kafka-producer-service.yaml", ServiceName.localHost_22);
	}
	@Test(groups = "DMN")
	public void DMN() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("DMN.dmn",ServiceName.localHost_22);
	}
	@Test(groups = "JPG")
	public void JPG() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("HD-wallpaper-thar-car-wagon-wrangler.jpg",ServiceName.localHost_22);
	}
	@Test(groups = "HTML")
	public void HTML() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("mongotemplate_1713176840471.html",ServiceName.localHost_22);
	}
	@Test(groups = "XLX")
	public void XLX() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("oracel54672913644.xls",ServiceName.localHost_22);
	}
	@Test(groups = "CSV")
	public void CSV() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("oracel83510302348.csv",ServiceName.localHost_22);
	}
	@Test(groups = "TXT")
	public void TXT() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("oracel901701790.txt",ServiceName.localHost_22);
	}
	@Test(groups = "JPEG")
	public void JPEG() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("Sample-JPEG-file-download-for-Testing.JPEG",ServiceName.localHost_22);
	}
	@Test(groups = "PNG")
	public void PNG() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("vi.png",ServiceName.localHost_22);
	}
	@Test(groups = "ZIP")
	public void ZIP() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("ZIP.zip",ServiceName.localHost_22);
	}
	@Test(groups = "SevenZFile") 
	public void SevenZFile() throws InterruptedException, IOException {
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

		DiffsentsFiles.differentMethods1("7z.7z",ServiceName.localHost_22);
	}
}
