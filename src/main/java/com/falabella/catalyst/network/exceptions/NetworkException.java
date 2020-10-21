package com.falabella.catalyst.network.exceptions;

import java.util.List;

/**
 *
 * @author prakhar nigam
 */
public interface NetworkException {
    List<ValidationError> getErrors();
}
