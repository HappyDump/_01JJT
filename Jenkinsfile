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
        sh 'mvn install -DrunSuite=**/CalculatorTestSuccessful.java'
      }
    }
    stage('test') {
      steps {
        junit '**/build/test-results/test/TEST-*.xml'
      }
    }
  }
}