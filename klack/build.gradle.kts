plugins {
  kotlin("jvm") version "1.6.0"
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutine}")

  implementation("com.slack.api:bolt:${Version.slack}")
  implementation("com.slack.api:bolt-ktor:${Version.slack}")
  implementation("com.slack.api:slack-api-model-kotlin-extension:${Version.slack}")
  implementation("com.slack.api:slack-api-client-kotlin-extension:${Version.slack}")

  implementation("io.ktor:ktor-server-core:${Version.ktor}")
  implementation("io.ktor:ktor-server-netty:${Version.ktor}")
  implementation("io.ktor:ktor-gson:${Version.ktor}")
}
