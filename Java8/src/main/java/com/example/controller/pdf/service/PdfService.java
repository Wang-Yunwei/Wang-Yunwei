package com.example.wangyunwei.controller.pdf.service;

import com.example.wangyunwei.controller.pdf.dto.FirstAidMedicalRecordsPo;
import com.example.wangyunwei.controller.pdf.dto.TriageDetailPo;
import com.example.wangyunwei.controller.pdf.dto.TriageTickertapePo;
import com.example.wangyunwei.controller.pdf.dto.WristbandsPo;
import com.google.zxing.WriterException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author WangYunwei [2022-01-26]
 */
public interface PdfService {

    /**
     * PDF - 就诊凭条
     *
     * @param triageTickertapePo
     * @throws IOException
     */
    void triageTickertape(TriageTickertapePo triageTickertapePo) throws IOException;

    /**
     * PDF - 腕带
     *
     * @param wristbandsPo
     */
    void wristbands(WristbandsPo wristbandsPo) throws IOException, WriterException;

    /**
     * PDF - 分诊明细
     *
     * @param triageDetailPo
     */
    void triageDetail(TriageDetailPo triageDetailPo) throws IOException;

    /**
     * PDF - 急救病历
     *
     * @param firstAidMedicalRecordsPo
     */
    void firstAidMedicalRecords(FirstAidMedicalRecordsPo firstAidMedicalRecordsPo) throws IOException;

    /**
     * PDF - 交接单
     *
     * @param patientId
     * @param response
     * @throws IOException
     */
    void pdfDeliveryFrom(String patientId, HttpServletResponse response) throws IOException;

    /**
     * PDF - 知情同意书
     *
     * @param patientId
     * @param response
     * @throws IOException
     */
    void pdfConsentBook(String patientId, HttpServletResponse response) throws IOException;
}
