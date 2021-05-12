package org.openapitools.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.Paths;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-11T19:27:30.163340-07:00[America/Los_Angeles]")
@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("NLP Sandbox Date Annotator API")
            .description("# Introduction A Date Annotator takes as input a clinical note and outputs a list of predicted date annotations found in the clinical note. This OpenAPI document describes the specification of a Date Annotator. This specification includes the schemas of the input and output data, and the conditions that this annotator must meet if you want to benchmark its performance on [nlpsandbox.io](https://nlpsandbox.io). # Getting Started The GitHub repository [nlpsandbox/date-annotator-example](https://github.com/nlpsandbox/date-annotator-example) provides a simple example implementation of a Python-Flask Date Annotator. By the end of the tutorial available in the README, you will have built a Docker image for a simple Date Annotator. You will then be able to submit this image to [nlpsandbox.io](https://nlpsandbox.io) to benchmark its performance. # Benchmarking Requirements Your NLP Sandbox tool must meet the following conditions before evaluating its performance on [nlpsandbox.io](https://nlpsandbox.io). - The endpoint `/` must redirect to `/api/v1/tool`. - The endpoint `/ui` must redirect to the web interface (UI). - The output of this tool must be reproducible: a given input should always   generate the same output.  - To ensure the results are reproducible and robust, and the data are   secured, this tool must not connect to any remote server. When benchmarked   on [nlpsandbox.io](https://nlpsandbox.io), this tool will not be able to   connect to remote servers.  # Examples - [Date Annotator Example (Python)](https://github.com/nlpsandbox/date-annotator-example) - [Date Annotator Example (Java)](https://github.com/nlpsandbox/date-annotator-example-java) ")
            .license("Apache 2.0")
            .licenseUrl("https://github.com/nlpsandbox/nlpsandbox-schemas/blob/develop/LICENSE")
            .termsOfServiceUrl("https://nlpsandbox.io")
            .version("1.1.0")
            .contact(new Contact("","", "team@nlpsandbox.io"))
            .build();
    }

    @Bean
    public Docket customImplementation(ServletContext servletContext, @Value("${openapi.nLPSandboxDateAnnotator.base-path:/api/v1}") String basePath) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("org.openapitools.api"))
                    .build()
                .pathProvider(new BasePathAwareRelativePathProvider(servletContext, basePath))
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    class BasePathAwareRelativePathProvider extends RelativePathProvider {
        private String basePath;

        public BasePathAwareRelativePathProvider(ServletContext servletContext, String basePath) {
            super(servletContext);
            this.basePath = basePath;
        }

        @Override
        protected String applicationPath() {
            return  Paths.removeAdjacentForwardSlashes(UriComponentsBuilder.fromPath(super.applicationPath()).path(basePath).build().toString());
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return Paths.removeAdjacentForwardSlashes(
                    uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath, "")).build().toString());
        }
    }

}
