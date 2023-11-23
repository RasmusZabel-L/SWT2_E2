# SWT2_E2

### 3. Maven Kompilier-/ und Testvorgänge

Compile: `mvn package`

Test: `mvn test`

### 4. POM-Änderungen

Hinzufügen der Abhängigkeiten, dabei Versionen beachten:

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>5.10.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.10.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.platform</groupId>
      <artifactId>junit-platform-runner</artifactId>
      <version>1.10.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-params</artifactId>
      <version>5.10.1</version>
      <scope>test</scope>
    </dependency>

Hinzufügen des Surefire-Plugings um die Tests automatisch laufen zu lassen:

    <plugin>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.2.2</version>
      <dependencies>
        <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter</artifactId>
          <version>5.10.1</version>
        </dependency>
      </dependencies>
    </plugin>


### 5. Test Coverage Tools

    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.11</version>
      <executions>
        <execution>
          <goals>
            <goal>prepare-agent</goal>
          </goals>
        </execution>
        <execution>
          <id>report</id>
          <phase>prepare-package</phase>
          <goals>
            <goal>report</goal>
          </goals>
        </execution>
      </executions>
    </plugin>

`mvn jacoco:prepare-agent test install jacoco:report`

In VSCode mit Coverage Gutters: Click on `Watch` in lower toolbar while in class under test.

- Sowohl JaCoCo ist ein test coverage tool
- EclEmma ist ein Eclipse-Plugin, um JaCoCo in Eclipse zu verwenden
- Um sie zum Projekt hinzuzufügen, muss das Plugin im POM-File hinzugefügt werden
- JaCoCo sollte in einem Ordner für jeden Testdurchlauf einen Report in mehreren Formaten ablegen, in dem Coverage dargestellt wird.

- JaCoCo unterstützt:
  - Instructions (Byte Code)
  - Branches (If and switch statements)
  - Cyclomatic complexity
  - Lines (of code)
  - Methods
  - Classes


### 6. 