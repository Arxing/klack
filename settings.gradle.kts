include(":klack")
include(":sample")

enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      library("kotlin-stdlib", "org.jetbrains.kotlin:kotlin-stdlib:1.7.0")
      library("kotlin-coroutines", "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")

      library("slack-core", "com.slack.api:bolt:1.21.2")
      library("slack-ktor", "com.slack.api:bolt:1.21.2")
      library("slack-apiModelExt", "com.slack.api:slack-api-model-kotlin-extension:1.21.2")
      library("slack-apiClientExt", "com.slack.api:slack-api-client-kotlin-extension:1.21.2")

      library("ktor-serverCore", "io.ktor:ktor-server-core:1.6.7")
      library("ktor-serverNetty", "io.ktor:ktor-server-netty:1.6.7")
      library("ktor-gson", "io.ktor:ktor-gson:1.6.7")
    }
  }
}
