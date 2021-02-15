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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-14T20:17:34.317816-08:00[America/Los_Angeles]")
public class Note   {
  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("text")
  private String text;

  @JsonProperty("noteType")
  private String noteType;

  @JsonProperty("patientId")
  private String patientId;

  public Note identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The ID of the clinical note
   * @return identifier
  */
  @ApiModelProperty(example = "awesome-note", required = true, value = "The ID of the clinical note")
  @NotNull

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the clinical note
   * @return text
  */
  @ApiModelProperty(required = true, value = "The content of the clinical note")
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
  @ApiModelProperty(required = true, value = "The note type (LOINC concept)")
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
   * The ID of the FHIR patient
   * @return patientId
  */
  @ApiModelProperty(example = "awesome-patient", required = true, value = "The ID of the FHIR patient")
  @NotNull

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
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
    return Objects.equals(this.identifier, note.identifier) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.noteType, note.noteType) &&
        Objects.equals(this.patientId, note.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, text, noteType, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

