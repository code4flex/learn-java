package com.code4flex.design.module.sample.interfaces.assembler;

import java.util.List;

public interface Assembler<D,E> {

    D toDTO(final E entity);

    List<D> toDTOs(final List<E> entitys);

    E fromDTO(D dto);
}
