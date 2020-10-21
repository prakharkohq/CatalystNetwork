package com.falabella.catalyst.network.exceptions;

import java.util.List;

/**
 * BadNetworEventErrorResponse
 *
 * @author prakhar nigam
 */
public class BadNetworEventErrorResponse<T> {
    private T event;
    private List<ValidationError> errors;
}
