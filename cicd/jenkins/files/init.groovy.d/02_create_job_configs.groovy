#!groovy

import groovy.text.SimpleTemplateEngine

def baseDir = '/usr/share/jenkins'
def jobDir = new File(baseDir, 'jobs')
def templateText = new File(baseDir, 'ref/job-template.xml').text
def template = new SimpleTemplateEngine().createTemplate(templateText)

if (!jobDir.exists()) {
  jobDir.mkdirs()
}

def configs = System.getenv("JOB_CONFIGS") ?: ''

configs.split("\n").findAll { !it.trim().empty }.each {
  def values = it.trim().split(",")
  def id = values[0].trim()
  def title = values[1].trim()
  def slug = values[2].trim()
  def branch = 'master'
  if (values.length > 3) {
    branch = values[3].trim()
  }
  def jobFile = new File(jobDir, "${id}.job.xml")
  if (!jobFile.exists()) {
    jobFile << template.make([
          ID: id,
          TITLE: title,
          DESCRIPTION: title,
          BRANCH: branch,
          PROJECT_URL: "https://github.com/${slug}/",
          SCM_URL: "https://github.com/${slug}.git"
      ])
  }
}