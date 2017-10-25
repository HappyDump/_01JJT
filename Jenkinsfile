pipeline {
  agent {
    docker {
      image 'maven:3.5.0-jdk-8-alpine'
    }
    
  }
  stages {
    stage('Init') {
      steps {
        echo 'Init start'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn install -Dtest=*TestSuccessful.java -X'
      }
    }
    stage('test') {
      steps {
        junit '**/TEST-*.xml'
      }
    }
  }
}