plugins {
  kotlin("jvm") version "1.6.0"
}

object Versions {
  val kotlin = "1.6.21"
  val coroutine = "1.5.2"
  val slack = "1.21.2"
  val ktor = "1.6.7"
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}")

  implementation("com.slack.api:bolt:${Versions.slack}")
  implementation("com.slack.api:bolt-ktor:${Versions.slack}")
  implementation("com.slack.api:slack-api-model-kotlin-extension:${Versions.slack}")
  implementation("com.slack.api:slack-api-client-kotlin-extension:${Versions.slack}")

  implementation("io.ktor:ktor-server-core:${Versions.ktor}")
  implementation("io.ktor:ktor-server-netty:${Versions.ktor}")
  implementation("io.ktor:ktor-gson:${Versions.ktor}")
}
