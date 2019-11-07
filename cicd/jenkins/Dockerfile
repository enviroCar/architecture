FROM jenkins/jenkins:2.202-alpine

USER root
RUN apk --no-cache add docker gettext

USER jenkins

COPY files/ /usr/share/jenkins/ref/

RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false" \
    JOB_CONFIGS="" \
    JENKINS_USERNAME="jenkins" \
    JENKINS_PASSWORD="jenkins"

HEALTHCHECK --interval=5s --timeout=20s --retries=3 \
  CMD wget http://localhost:8080$(echo ${JENKINS_OPTS} | sed 's| |\n|g' | awk -F'=' '/--prefix/{print $2}') -q -O - > /dev/null 2>&1
