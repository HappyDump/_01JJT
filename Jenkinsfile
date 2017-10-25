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
    stage('Mail') {
      steps {
        mail(subject: '$env.PROJECT_NAME - Build # $env.BUILD_NUMBER - $env.BUILD_STATUS !', body: '$env.PROJECT_NAME - Build # $env.BUILD_NUMBER - $env.BUILD_STATUS:  Check console output at $env.RUN_DISPLAY_URL to view the results.', from: 'mathieumetzger@gmail.com', replyTo: 'no-reply@gmail.com', to: 'mathieu.metzger@butema.fr', charset: 'UTF-8')
      }
    }
  }
}