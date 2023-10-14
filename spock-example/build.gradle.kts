plugins {
    id("java")
    id("groovy")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.4")

    testImplementation("org.apache.groovy:groovy-all:4.0.15")
    testImplementation("org.spockframework:spock-core:2.3-groovy-4.0")
}

tasks.test {
    useJUnitPlatform()
}
