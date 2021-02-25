package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Tool;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of tool dependencies
 */
@ApiModel(description = "A list of tool dependencies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-25T15:53:35.186246-08:00[America/Los_Angeles]")
public class ToolDependencies   {
  @JsonProperty("toolDependencies")
  @Valid
  private List<Tool> toolDependencies = new ArrayList<>();

  public ToolDependencies toolDependencies(List<Tool> toolDependencies) {
    this.toolDependencies = toolDependencies;
    return this;
  }

  public ToolDependencies addToolDependenciesItem(Tool toolDependenciesItem) {
    this.toolDependencies.add(toolDependenciesItem);
    return this;
  }

  /**
   * A list of tools
   * @return toolDependencies
  */
  @ApiModelProperty(required = true, value = "A list of tools")
  @NotNull

  @Valid

  public List<Tool> getToolDependencies() {
    return toolDependencies;
  }

  public void setToolDependencies(List<Tool> toolDependencies) {
    this.toolDependencies = toolDependencies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolDependencies toolDependencies = (ToolDependencies) o;
    return Objects.equals(this.toolDependencies, toolDependencies.toolDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolDependencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolDependencies {\n");
    
    sb.append("    toolDependencies: ").append(toIndentedString(toolDependencies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

