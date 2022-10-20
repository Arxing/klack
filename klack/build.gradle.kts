plugins {
  kotlin("jvm") version "1.6.0"
}

dependencies {
  implementation(libs.kotlin.stdlib)
  implementation(libs.kotlin.coroutines)

  implementation(libs.slack.core)
  implementation(libs.slack.ktor)
  implementation(libs.slack.apiClientExt)
  implementation(libs.slack.apiModelExt)

  implementation("io.ktor:ktor-server-core:${Version.ktor}")
  implementation("io.ktor:ktor-server-netty:${Version.ktor}")
  implementation("io.ktor:ktor-gson:${Version.ktor}")
}
