package com.code4flex.design.module.sample.interfaces.dto;

import java.io.Serializable;

/**
 * DictDto
 *
 * @author mavin
 */
public class DictDto implements Serializable {

    private static final long serialVersionUID = -3248234151170386242L;

    /** 字典编码 */
    private Long dictCode;

    /** 字典排序 */
    private Long dictSort;

    /** 字典标签 */
    private String dictLabel;

    /** 字典键值 */
    private String dictValue;

    public Long getDictCode() {
        return dictCode;
    }

    public void setDictCode(Long dictCode) {
        this.dictCode = dictCode;
    }

    public Long getDictSort() {
        return dictSort;
    }

    public void setDictSort(Long dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    @Override
    public String toString() {
        return "DictDto{" +
                "dictCode=" + dictCode +
                ", dictSort=" + dictSort +
                ", dictLabel='" + dictLabel + '\'' +
                ", dictValue='" + dictValue + '\'' +
                '}';
    }
}
