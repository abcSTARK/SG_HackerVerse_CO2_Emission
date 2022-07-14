# Doconomy Aland Index Reference App

## Table of Contents
- Overview
- Frameworks / Libraries used
- Requirements
- Configuration
- Service Documentation
- Integrating with OpenAPI Generator
- Use Cases
- API Reference
- Support
- License

## Overview
This is a reference application to demonstrate how Doconomy Aland Index APIs can be used.
To call these APIs, consumer key and .p12 file are required from your project on Mastercard Developers.

## Requirements

- [Java 11](https://www.java.com/en/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (or any other IDE)

## Frameworks / Libraries used
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- [OpenAPI Generator](https://openapi-generator.tech/)


## Configuration
1. Create your account on [Mastercard Developers](https://developer.mastercard.com/) if you don't have it already.
2. Create a new project here and add ```Doconomy Aland Index``` to it and click continue.
3. Download Sandbox Signing Key, a ```.p12``` file will be downloaded.
4. Copy the downloaded ```.p12``` file to ```src/main/resources``` folder in your code.
5. Open ```src/main/resources/application.yml``` and configure:
    - ```mastercard.api.key-file ```- Path to keystore (.p12) file, just change the name as per the downloaded file in step 4. 
    - ```mastercard.api.consumer-key``` - Copy the Consumer key from "Sandbox/Production Keys" section on your project page
    - ```mastercard.api.keystore-alias``` - Alias of your key. Default key alias for sandbox is ```keyalias```.
    - ```mastercard.api.keystore-password``` -  Password of your Keystore. Default keystore password for sandbox project is ```keystorepassword```.
6. Run ```mvn clean install``` from the root of the project directory.
7. Run ```mvn spring-boot:run``` to run the project.
8. You can use any REST API based Client to test the functionality. Below are the APIs exposed by this application
- POST <Host>/demo/transaction-footprints    
- GET <Host>/demo/supported-mccs
- GET <Host>/demo/supported-currencies


## Service Documentation

Doconomy Aland Index documentation can be found [here](https://developer.mastercard.com/transaction-carbon-impact/documentation/).

## Integrating with OpenAPI Generator

[OpenAPI Generator](https://openapi-generator.tech/) generates API client libraries from OpenAPI Specs. It provides generators and library templates for supporting multiple languages and frameworks.

**OpenAPI Generator Plugin Configuration**

Below is the plugin configuration which we have used in this reference application. Refer here for latest [OpenAPI Generator maven Plugin](https://mvnrepository.com/artifact/org.openapitools/openapi-generator-maven-plugin). 

```
            <plugin>
                <groupId>org.openapitools</groupId>
                <artifactId>openapi-generator-maven-plugin</artifactId>
                <version>4.3.1</version>
                <executions>
                    <execution>
                        <id>Doconomy Aland Index REST Client</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <inputSpec>${project.basedir}/src/main/resources/openapi.yaml</inputSpec>
                            <generatorName>java</generatorName>
                            <generateApiTests>false</generateApiTests>
                            <generateModelTests>false</generateModelTests>
                            <configOptions>
                                <sourceFolder>src/gen/java/main</sourceFolder>
                                <hideGenerationTimestamp>true</hideGenerationTimestamp>
                            </configOptions>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
```

## Use Cases
1. Transaction Footprints - Calculates carbon emission and water usage based on payment transactions.

2. Supported Currencies - Provides a list of Merchant Category Code (MCC) supported by the application.

3. Supported Merchant Categories - Provides a list of Currencies supported by the application.

More details can be found [here](https://developer.mastercard.com/transaction-carbon-impact/documentation/use-cases/). 

## API Reference
The Swagger API specification can be found [here](https://developer.mastercard.com/transaction-carbon-impact/documentation/api-reference/).

## Support
For any queries related to product, pricing or technical help, reach out to **sales@doconomy.com**.


## License
<p>Copyright 2020 Mastercard</p>
<p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at:</p>
<pre><code>   http://www.apache.org/licenses/LICENSE-2.0
</code></pre>
<p>Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.</p>