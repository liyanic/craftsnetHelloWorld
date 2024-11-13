plugins {
    id("java")
}

group = "ch.simpleclient"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        url = uri("https://repo.craftsblock.de/releases")
    }
    mavenCentral()
}

dependencies {


    implementation("de.craftsblock.craftscore:CraftsCore:3.7.65-SNAPSHOT")

    implementation("de.craftsblock:craftsnet:3.0.6-SNAPSHOT")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}