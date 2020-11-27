package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about an NLP service
 */
@ApiModel(description = "Information about an NLP service")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-26T14:44:24.992301-08:00[America/Los_Angeles]")
public class Service   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("license")
  private String license;

  @JsonProperty("repository")
  private String repository;

  @JsonProperty("description")
  private String description;

  @JsonProperty("author")
  private String author;

  @JsonProperty("authorEmail")
  private String authorEmail;

  @JsonProperty("url")
  private URI url;

  public Service name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The service name
   * @return name
  */
  @ApiModelProperty(example = "awesome-date-annotator", value = "The service name")

@Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the service (SemVer string)
   * @return version
  */
  @ApiModelProperty(example = "1.0.0", value = "The version of the service (SemVer string)")

@Pattern(regexp="^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$") @Size(min=1) 
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Service license(String license) {
    this.license = license;
    return this;
  }

  /**
   * The license of this service (spdx.org/licenses Identifier)
   * @return license
  */
  @ApiModelProperty(example = "Apache-2.0", value = "The license of this service (spdx.org/licenses Identifier)")


  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Service repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * The place where the code lives
   * @return repository
  */
  @ApiModelProperty(example = "github:awesome-org/awesome-date-annotator", value = "The place where the code lives")


  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public Service description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short, one-sentence summary of the service
   * @return description
  */
  @ApiModelProperty(example = "An awesome Date Annotator based on regex patterns", value = "A short, one-sentence summary of the service")

@Size(max=100) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Service author(String author) {
    this.author = author;
    return this;
  }

  /**
   * The author of the service
   * @return author
  */
  @ApiModelProperty(example = "Example Author", value = "The author of the service")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Service authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * The email address of the author
   * @return authorEmail
  */
  @ApiModelProperty(example = "author@example.com", value = "The email address of the author")

@javax.validation.constraints.Email
  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public Service url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to the homepage of the service
   * @return url
  */
  @ApiModelProperty(value = "The URL to the homepage of the service")

  @Valid

  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.name, service.name) &&
        Objects.equals(this.version, service.version) &&
        Objects.equals(this.license, service.license) &&
        Objects.equals(this.repository, service.repository) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.author, service.author) &&
        Objects.equals(this.authorEmail, service.authorEmail) &&
        Objects.equals(this.url, service.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, license, repository, description, author, authorEmail, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

