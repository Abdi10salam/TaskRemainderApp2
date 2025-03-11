// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id "org.sonarqube" version "4.0.0.2929" // Use the latest version
}
sonarqube {
    properties {
        property "sonar.projectKey", "sonar-server_project5"
        property "sonar.organization", "sonar-server"
        property "sonar.host.url", "https://sonarcloud.io"
    }
}

