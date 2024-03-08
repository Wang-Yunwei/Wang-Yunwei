package com.example.wangyunwei.controller.excel.service;

import com.example.wangyunwei.controller.excel.dto.ExportExcelPo;

/**
 * @author WangYunwei [2022-02-07]
 */
public interface ExcelService {

    /**
     * Excel - 导出Excel
     *
     * @param exportExcelPo
     */
    void exportExcel(ExportExcelPo exportExcelPo);
}
