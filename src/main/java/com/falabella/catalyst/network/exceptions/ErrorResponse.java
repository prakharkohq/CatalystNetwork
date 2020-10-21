package com.falabella.catalyst.network.exceptions;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BadNetworEventErrorResponse
 *
 * @author prakhar nigam
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String error;
    private String message;
    private List<ValidationError> errors;


}
