/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TextDateAnnotationRequest;
import org.openapitools.model.TextDateAnnotations;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-26T14:44:24.992301-08:00[America/Los_Angeles]")
@Validated
@Api(value = "textDateAnnotations", description = "the textDateAnnotations API")
public interface TextDateAnnotationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /textDateAnnotations : Annotate dates in a clinical note
     * Return the date annotations found in a clinical note
     *
     * @param textDateAnnotationRequest  (optional)
     * @return Success (status code 200)
     *         or Unauthorized (status code 403)
     */
    @ApiOperation(value = "Annotate dates in a clinical note", nickname = "createTextDateAnnotations", notes = "Return the date annotations found in a clinical note", response = TextDateAnnotations.class, tags={ "TextDateAnnotation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TextDateAnnotations.class),
        @ApiResponse(code = 403, message = "Unauthorized", response = Error.class) })
    @PostMapping(
        value = "/textDateAnnotations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TextDateAnnotations> createTextDateAnnotations(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) TextDateAnnotationRequest textDateAnnotationRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"textDateAnnotations\" : [ { \"start\" : 42, \"length\" : 10, \"text\" : \"10/26/2020\", \"dateFormat\" : \"MM/DD/YYYY\" }, { \"start\" : 42, \"length\" : 10, \"text\" : \"10/26/2020\", \"dateFormat\" : \"MM/DD/YYYY\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
