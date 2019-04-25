#!groovy

import jenkins.model.*
import hudson.security.*
import jenkins.security.s2m.AdminWhitelistRule

def jenkins = Jenkins.getInstance()
def username = System.getenv('JENKINS_USERNAME').trim()
def password = System.getenv('JENKINS_PASSWORD').trim()

def realm = new HudsonPrivateSecurityRealm(false)
realm.createAccount(username, password)
jenkins.setSecurityRealm(realm)
jenkins.setAuthorizationStrategy(new FullControlOnceLoggedInAuthorizationStrategy())
jenkins.save()

jenkins.getInjector().getInstance(AdminWhitelistRule.class).setMasterKillSwitch(false)
