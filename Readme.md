**Read Me**

1. Create "Maven Project"

2. Select "Create a simple project"

3. Enter

  - Group Id: com.sample
  - Artifact Id: MVCMaven1
  - Version: 1.0.0
  - Packaging: war

4. Project > Properties > Maven > Project Facets

  - Runtimes: select server
  - Dynamic Web Module  3.0
  - Java 1.6 or above
  - Java Script 1.0

5. Right click on "Deployment Descriptor", and select "Generate Deployment Descriptor Stub"
  (This will create WEB-INF/web.xml)

6. Create "src/main/webapp/index.jsp"

Test: /MVCMaven1/

1. Open pom.xml, select "Dependencies", Add

  - org.springframework   spring-core
  - org.springframework   spring-web
  - org.springframework   spring-webmvc

2. Create WEB-INF/views/hello.jsp

3. Create (Controller) class under /src/main/java

  - package: com.sample.controller
  - class:   HelloController.java

4. Create new "Spring Bean Configuration File" under WEB-INF/

  - WEB-INF/dispatcher-servlet.xml
  
5. open dispatcher-servlet, and select "Namespaces"

  - beans
  - context
  - mvc

6. Modify dispatcher servlet xml to add context component scan, prefix and suffix definitinions (see file contents)

7. Modify web.xml (see file contents)

Test: /MVCMaven1/hello
