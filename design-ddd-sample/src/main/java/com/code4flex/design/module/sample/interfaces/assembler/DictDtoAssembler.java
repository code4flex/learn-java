package com.code4flex.design.module.sample.interfaces.assembler;

import com.code4flex.design.module.sample.domain.model.dict.Dict;
import com.code4flex.design.module.sample.interfaces.dto.DictDto;

import java.util.*;

/**
 * 系统字典转换类
 *
 * @author mavin
 */
public class DictDtoAssembler implements Assembler<DictDto, Dict> {

    @Override
    public DictDto toDTO(Dict entity) {
        if(null == entity) {
            return null;
        }

        DictDto dictDto = new DictDto();
        dictDto.setDictCode(entity.getDictCode());
        dictDto.setDictLabel(entity.getDictLabel());
        dictDto.setDictSort(entity.getDictSort());
        dictDto.setDictValue(entity.getDictValue());

        return dictDto;
    }

    @Override
    public List<DictDto> toDTOs(List<Dict> entitys) {
        if (null == entitys) {
            return null;
        }

        List<DictDto> dictDtoList = new ArrayList<DictDto>();

        Iterator<Dict> iterator = entitys.iterator();
        while (iterator.hasNext()) {
            Dict dict = iterator.next();
            if (null == dict) {
                continue;
            }

            dictDtoList.add(toDTO(dict));
        }
        return dictDtoList;
    }

    @Override
    public Dict fromDTO(DictDto dto) {
        if(null == dto) { return null;}

        Dict dict = new Dict();

        dict.setDictCode(dto.getDictCode());
        dict.setDictLabel(dto.getDictLabel());
        dict.setDictSort(dto.getDictSort());
        dict.setDictValue(dto.getDictValue());

        return dict;
    }
}
