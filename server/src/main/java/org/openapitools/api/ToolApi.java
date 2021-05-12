/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.License;
import org.openapitools.model.Tool;
import org.openapitools.model.ToolDependencies;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-12T21:49:56.981797-08:00[America/Los_Angeles]")
@Validated
@Api(value = "tool", description = "the tool API")
public interface ToolApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /tool : Get tool information
     * Get information about the tool
     *
     * @return Success (status code 200)
     *         or The specified resource was not found (status code 404)
     *         or The request cannot be fulfilled due to an unexpected server error (status code 500)
     */
    @ApiOperation(value = "Get tool information", nickname = "getTool", notes = "Get information about the tool", response = Tool.class, tags={ "Tool", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Tool.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 500, message = "The request cannot be fulfilled due to an unexpected server error", response = Error.class) })
    @GetMapping(
        value = "/tool",
        produces = { "application/json" }
    )
    default ResponseEntity<Tool> getTool() {
        Tool tool = new Tool()
            .name("date-annotator-example-java")
            .version("1.1.0")
            .license(License.APACHE_2_0)
            .repository("github:nlpsandbox/date-annotator-example-java")
            .description("Example implementation of the NLP Sandbox Date Annotator")
            .author("The NLP Sandbox Team")
            .authorEmail("thomas.schaffter@sagebionetworks.org")
            .url(URI.create("https://github.com/nlpsandbox/date-annotator-example-java"))
            .type("nlpsandbox:date-annotator")
            .apiVersion("1.1.0");
        return new ResponseEntity<Tool>(tool, HttpStatus.OK);
    }


    /**
     * GET /tool/dependencies : Get tool dependencies
     * Get the dependencies of this tool
     *
     * @return Success (status code 200)
     *         or The specified resource was not found (status code 404)
     *         or The request cannot be fulfilled due to an unexpected server error (status code 500)
     */
    @ApiOperation(value = "Get tool dependencies", nickname = "getToolDependencies", notes = "Get the dependencies of this tool", response = ToolDependencies.class, tags={ "Tool", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = ToolDependencies.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 500, message = "The request cannot be fulfilled due to an unexpected server error", response = Error.class) })
    @GetMapping(
        value = "/tool/dependencies",
        produces = { "application/json" }
    )
    default ResponseEntity<ToolDependencies> getToolDependencies() {
        ToolDependencies dependencies = new ToolDependencies()
            .tools(new ArrayList<Tool>());
        return new ResponseEntity<ToolDependencies>(dependencies, HttpStatus.OK);
    }

}
