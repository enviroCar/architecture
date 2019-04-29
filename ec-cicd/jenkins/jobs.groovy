#!groovy

import jenkins.model.Jenkins
import groovy.io.FileType

def jenkins = Jenkins.getInstance()

new File('/usr/share/jenkins/jobs').eachFileRecurse(FileType.FILES) { file ->
  if (file.name.endsWith(".job.xml")) {
    def jobName = file.name[0..-9]
    if (jenkins.getItem(jobName) == null) {
      file.withInputStream { stream ->
        jenkins.createProjectFromXML(jobName, stream)
      }
    }
  }
}
