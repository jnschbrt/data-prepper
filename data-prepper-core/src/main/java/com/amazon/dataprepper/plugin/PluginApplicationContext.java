/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.dataprepper.plugin;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Application context for internal plugin framework beans.
 */
@Configuration
class PluginApplicationContext {
    @Bean
    Validator validator() {
        final ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
        return validationFactory.getValidator();
    }
}
