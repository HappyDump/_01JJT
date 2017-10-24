pipeline {
  agent {
    docker {
      image 'maven:3.5.0-jdk-8-alpine'
    }
    
  }
  stages {
    stage('') {
      steps {
        echo 'Init start'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('test') {
      steps {
        junit '**-surefire-reports/**/*.xml'
      }
    }
  }
}