#!groovy

import jenkins.model.Jenkins
import com.cloudbees.hudson.plugins.folder.*

def jobDirectory = '/usr/share/jenkins/jobs'
def jobName = 'enviroCar-server'
def jenkins = Jenkins.getInstance()

if (jenkins.instance.getItem(jobName) == null) {
  def stream = new StringBufferInputStream("${jobDirectory}/${jobName}.job.xml")
  jenkins.createProjectFromXML(jobName, stream)  
}
