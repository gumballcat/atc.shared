package com.atc.shared.service;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/04/2022
 */

import com.atc.shared.persistence.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T extends AbstractEntity, I> {

    private JpaRepository<T, I> JPA_REPOSITORY;
}
