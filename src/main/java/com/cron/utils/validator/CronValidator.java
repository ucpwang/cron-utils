package com.cron.utils.validator;

import com.cron.utils.model.CronDefinition;
import com.cron.utils.parser.CronParser;

/*
 * Copyright 2014 jmrozanec
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CronValidator {

    private CronParser parser;

    public CronValidator(CronDefinition definition){
        this.parser = new CronParser(definition);
    }

    public boolean isValid(String expression){
        try{
            parser.parse(expression);
        }catch (RuntimeException re){
            return false;
        }
        return true;
    }

    public String validate(String expression){
        parser.parse(expression);
        return expression;
    }
}