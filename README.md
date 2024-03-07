## Cucumber-reporting
Get cucumber reporting, cucumber-java, juni, cucumber-io dependencies from mvn repository
Add it in pom.xml
along with cucumber reporting dependecy add below lines of xml code to get cucumber-report
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.2.5</version>
                <configuration>
                    <testFailureIgnore>true</testFailureIgnore>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.masterthought</groupId>
    <artifactId>maven-cucumber-reporting</artifactId>
    <version>5.7.7</version>
                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                       <projectName>EnteryourprojectName</projectName>
                            <!-- optional, per documentation set this to "true" to bypass generation of Cucumber Reports entirely, defaults to false if not specified -->
                            <skip>false</skip>
                            <!-- output directory for the generated report -->
                            <outputDirectory>${project.build.directory}</outputDirectory>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <inputDirectory>${project.build.directory}</inputDirectory>
                            <jsonFiles>
                                <!-- supports wildcard or name pattern -->
                                <param>**/*.json</param>
                            </jsonFiles>
                            <!-- optional, defaults to outputDirectory if not specified -->
                            <classificationDirectory>${project.build.directory}</classificationDirectory>
                            <classificationFiles>
                                    <!-- supports wildcard or name pattern -->
                                    <param>sample.properties</param>
                                    <param>other.properties</param>
                            </classificationFiles>
                          <!--  <parallelTesting>false</parallelTesting>--> 
                            <!-- optional, set true to group features by its Ids -->
                            <mergeFeaturesById>false</mergeFeaturesById>
                            <!-- optional, set true to get a final report with latest results of the same test from different test runs -->
                            <mergeFeaturesWithRetest>false</mergeFeaturesWithRetest>
                            <!-- optional, set true to fail build on test failures -->
                            <checkBuildResult>false</checkBuildResult>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
    save the pom.xml and Update your project by (right click on projec --> Maven-->Update project)
    create Feature file, Stepdefinitions, Runner, Utility package/classes are configured correctly
    ..Now 
    Run as Maven Clean , Maven Verify -->This will generate cucumber reports
  
