package com.code4flex.design.module.sample.domain.model.dict;

import java.io.Serializable;

/**
 * 系统字典
 *
 * @author mavin
 */
public class Dict implements Serializable {

    private static final long serialVersionUID = 4064763858742969428L;

    /** 字典编码 */
    private Long dictCode;

    /** 字典排序 */
    private Long dictSort;

    /** 字典标签 */
    private String dictLabel;

    /** 字典键值 */
    private String dictValue;

    /** 字典类型 */
    private String dictType;

    /** 状态（0正常 1停用） */
    private String status;

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

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "dictCode=" + dictCode +
                ", dictSort=" + dictSort +
                ", dictLabel='" + dictLabel + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", dictType='" + dictType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
