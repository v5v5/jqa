plugins {
    id("java")
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
}

tasks.test {
    useJUnitPlatform()
}
