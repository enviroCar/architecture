FROM jenkins/jenkins:alpine

USER root

RUN apk --no-cache add docker \
 && mkdir -p /usr/share/jenkins/jobs/

COPY plugins.txt     /usr/share/jenkins/ref/plugins.txt
COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/01_security.groovy
COPY jobs.groovy     /usr/share/jenkins/ref/init.groovy.d/02_jobs.groovy

USER jenkins

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

HEALTHCHECK --interval=5s --timeout=20s --retries=3 \
  CMD wget http://localhost:8080/ -q -O - > /dev/null 2>&1
