package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A clinical note
 */
@ApiModel(description = "A clinical note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-26T14:44:24.992301-08:00[America/Los_Angeles]")
public class Note   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("text")
  private String text;

  @JsonProperty("noteType")
  private String noteType;

  @JsonProperty("patientId")
  private String patientId;

  public Note id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the note
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "The ID of the note")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the clinical note
   * @return text
  */
  @ApiModelProperty(example = "On 12/26/2020, Ms. Chloe Price met with Dr. Prescott.", required = true, value = "The content of the clinical note")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note noteType(String noteType) {
    this.noteType = noteType;
    return this;
  }

  /**
   * The note type (LOINC concept)
   * @return noteType
  */
  @ApiModelProperty(example = "loinc:LP29684-5", required = true, value = "The note type (LOINC concept)")
  @NotNull


  public String getNoteType() {
    return noteType;
  }

  public void setNoteType(String noteType) {
    this.noteType = noteType;
  }

  public Note patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * The patient ID
   * @return patientId
  */
  @ApiModelProperty(example = "507f1f77bcf86cd799439011", value = "The patient ID")


  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.noteType, note.noteType) &&
        Objects.equals(this.patientId, note.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, noteType, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
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

