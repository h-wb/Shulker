dependencies {
    api(libs.protobuf)
    implementation(libs.grpc.common.protos)
    implementation(libs.grpc.protobuf)
    implementation(libs.grpc.services)
    implementation(libs.grpc.stub)
    compileOnly(libs.annotations.api)
}

configure<JavaPluginExtension> {
    withJavadocJar()
    withSourcesJar()
}

sourceSets {
    main {
        java {
            srcDir("src/generated/java")
            srcDir("src/generated/grpc")
        }
    }
}
