package com.atc.shared.http;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/04/2022
 */

import lombok.Data;

@Data
public abstract class HResponse {

    private int statusCode;
}
