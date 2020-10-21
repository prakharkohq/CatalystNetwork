package com.falabella.catalyst.network.exceptions;

import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author prakhar nigam
 */

@Getter
@Builder
public class ValidationError {

    private String code;
    private String property;
    private String error;
    private String message;
}
