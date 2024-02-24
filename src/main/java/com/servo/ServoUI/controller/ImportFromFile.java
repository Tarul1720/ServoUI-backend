package com.servo.ServoUI.controller;

import com.servo.ServoUI.modals.ServiceModal;
import com.servo.ServoUI.modals.SubWorkModal;
import com.servo.ServoUI.modals.WorkModal;
import com.servo.ServoUI.service.InsertIntoDBService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ImportFromFile {

    @Autowired
    InsertIntoDBService insertIntoDBService;
    @PostMapping("/import")
    public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {

        List<ServiceModal> tempServiceModal= new ArrayList<ServiceModal>();
        List<WorkModal> tempWorkModal= new ArrayList<WorkModal>();
        List<SubWorkModal> tempSubWorkModal= new ArrayList<SubWorkModal>();

        XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        ServiceModal serviceModal=new ServiceModal();
        WorkModal workModal=new WorkModal();
        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            //Test tempStudent = new Test();

            XSSFRow row = worksheet.getRow(i);



            SubWorkModal subWorkModal=new SubWorkModal();


                if(row.getCell(0)!=null){
                    serviceModal=new ServiceModal();
                    serviceModal.setId((int) row.getCell(0).getNumericCellValue());
                    serviceModal.setServiceName( row.getCell(1).getStringCellValue());
                    serviceModal.setShortDesc(row.getCell(2).getStringCellValue());

                    if(row.getCell(3)!=null) {
                        serviceModal.setImgUrl(row.getCell(3).getStringCellValue());
                    }

                    tempServiceModal.add(serviceModal);
                }
                if(row.getCell(4)!=null){
                    //workModal=new WorkModal();
                    if(row.getCell(5)!=null&&((int) row.getCell(4).getNumericCellValue())!=0){
                        workModal=new WorkModal();
                    workModal.setId(((int) row.getCell(4).getNumericCellValue()));
                    workModal.setName(row.getCell(5).getStringCellValue());
                    if(row.getCell(6)!=null) {
                        workModal.setShortDec(row.getCell(6).getStringCellValue());
                    }
                    if(row.getCell(7)!=null) {
                        workModal.setPrice(((int) row.getCell(7).getNumericCellValue()));
                    }
                    else{
                        workModal.setPrice(50);
                    }
                    if(row.getCell(8)!=null) {
                        workModal.setImage(row.getCell(8).getStringCellValue());
                    }

                    workModal.setService(serviceModal);

                        tempWorkModal.add(workModal);
                        }

                }
            if(row.getCell(9)==null){
                break;
            }
            System.out.println(workModal.getId());
                subWorkModal.setId(((int) row.getCell(9).getNumericCellValue()));
                subWorkModal.setName(row.getCell(10).getStringCellValue());
                if(row.getCell(11)!=null) {
                    subWorkModal.setShortDec(row.getCell(11).getStringCellValue());
                }
                if(row.getCell(12)!=null) {
                    subWorkModal.setPrice(((int) row.getCell(12).getNumericCellValue()));
                }
                else{
                    subWorkModal.setPrice(50);
                }
                subWorkModal.setWork(workModal);

                tempSubWorkModal.add(subWorkModal);


            //tempStudent.setId((int) row.getCell(0).getNumericCellValue());
            //tempStudent.setContent(row.getCell(1).getStringCellValue());
            //tempStudentList.add(tempStudent);
        }
        System.out.println(tempServiceModal);
        System.out.println(tempWorkModal);
        System.out.println(tempSubWorkModal);
        insertIntoDBService.insertAll(tempServiceModal,tempWorkModal,tempSubWorkModal);
    }
}
