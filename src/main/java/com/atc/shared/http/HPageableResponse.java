package com.atc.shared.http;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/04/2022
 */

import com.atc.shared.persistence.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class HPageableResponse extends HResponse {

    private Iterable<? extends AbstractEntity> items;
    private long lastIndex;
    private long total;
}
