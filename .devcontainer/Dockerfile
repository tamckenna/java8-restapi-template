FROM tmckenna/java8-ws:latest

#-------------------Uncomment the following steps to install Maven CLI Tools---------------------------------
# # Maven Configuration
# ENV MAVEN_HOME /usr/share/maven
# ENV MAVEN_CONFIG /home/developer/.m2
# ARG MAVEN_VERSION=3.6.3
# ARG MAVEN_SHA=c35a1803a6e70a126e80b2b3ae33eed961f83ed74d18fcd16909b2d44d7dada3203f1ffe726c17ef8dcca2dcaa9fca676987befeadc9b9f759967a8cb77181c0
# # Maven CLI Tools
# RUN \
#     mkdir -p /usr/share/maven /usr/share/maven/ref && \
#     curl -fsSL -o /tmp/apache-maven.tar.gz https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz > /dev/null && \
#     echo "${MAVEN_SHA} /tmp/apache-maven.tar.gz" | sha512sum -c - && \
#     tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 > /dev/null && \
#     rm -f /tmp/apache-maven.tar.gz && \
#     ln -s /usr/share/maven/bin/mvn /usr/bin/mvn


#-------------------Uncomment the following steps to install Gradle CLI Tools---------------------------------
# # Gradle Configuration
# ENV GRADLE_HOME /opt/gradle
# ARG GRADLE_VERSION=6.2.2
# ARG GRADLE_DOWNLOAD_SHA256=0F6BA231B986276D8221D7A870B4D98E0DF76E6DAF1F42E7C0BAEC5032FB7D17
# # Install Gradle CLI Tools
# RUN \
#     curl -sSL --output gradle.zip "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip" > /dev/null && \
#     echo "${GRADLE_DOWNLOAD_SHA256} *gradle.zip" | sha256sum --check - && \
#     unzip gradle.zip > /dev/null && \
#     rm gradle.zip && \
#     mv "gradle-${GRADLE_VERSION}" "${GRADLE_HOME}/" && \
#     ln -s "${GRADLE_HOME}/bin/gradle" /usr/bin/gradle
