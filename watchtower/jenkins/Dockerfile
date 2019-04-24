FROM jenkins/jenkins:alpine

USER root
RUN apk --no-cache add docker
USER jenkins

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY jobs.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY enviroCar-server.job.xml /usr/share/jenkins/jobs/enviroCar-server.job.xml
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"