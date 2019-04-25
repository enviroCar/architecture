#!groovy

import jenkins.model.Jenkins
import groovy.io.FileType

def jobDirectory = '/usr/share/jenkins/jobs'
def jenkins = Jenkins.getInstance()

new File(jobDirectory).eachFileRecurse(FileType.FILES) { file ->
  if (file.name.endsWith(".job.xml")) {
    def jobName = file.name[0..-9]
    if (jenkins.instance.getItem(jobName) == null) {
      file.withInputStream { stream ->
        jenkins.createProjectFromXML(jobName, stream)
      }
    }
  }
}