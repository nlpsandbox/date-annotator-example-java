package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TextDateAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of text date annotations
 */
@ApiModel(description = "A list of text date annotations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-12T21:49:56.981797-08:00[America/Los_Angeles]")
public class TextDateAnnotations   {
  @JsonProperty("textDateAnnotations")
  @Valid
  private List<TextDateAnnotation> textDateAnnotations = new ArrayList<>();

  public TextDateAnnotations textDateAnnotations(List<TextDateAnnotation> textDateAnnotations) {
    this.textDateAnnotations = textDateAnnotations;
    return this;
  }

  public TextDateAnnotations addTextDateAnnotationsItem(TextDateAnnotation textDateAnnotationsItem) {
    this.textDateAnnotations.add(textDateAnnotationsItem);
    return this;
  }

  /**
   * A list of text date annotations
   * @return textDateAnnotations
  */
  @ApiModelProperty(required = true, value = "A list of text date annotations")
  @NotNull

  @Valid

  public List<TextDateAnnotation> getTextDateAnnotations() {
    return textDateAnnotations;
  }

  public void setTextDateAnnotations(List<TextDateAnnotation> textDateAnnotations) {
    this.textDateAnnotations = textDateAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDateAnnotations textDateAnnotations = (TextDateAnnotations) o;
    return Objects.equals(this.textDateAnnotations, textDateAnnotations.textDateAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textDateAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDateAnnotations {\n");
    
    sb.append("    textDateAnnotations: ").append(toIndentedString(textDateAnnotations)).append("\n");
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

