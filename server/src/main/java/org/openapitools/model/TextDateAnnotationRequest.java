package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Note;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An annotation request
 */
@ApiModel(description = "An annotation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-26T14:44:24.992301-08:00[America/Los_Angeles]")
public class TextDateAnnotationRequest   {
  @JsonProperty("note")
  private Note note;

  public TextDateAnnotationRequest note(Note note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  */
  @ApiModelProperty(value = "")

  @Valid

  public Note getNote() {
    return note;
  }

  public void setNote(Note note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDateAnnotationRequest textDateAnnotationRequest = (TextDateAnnotationRequest) o;
    return Objects.equals(this.note, textDateAnnotationRequest.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDateAnnotationRequest {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

