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
        mail(subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', body: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:  Check console output at $BUILD_URL to view the results.', from: 'mathieumetzger@gmail.com', replyTo: 'no-reply@gmail.com', to: 'mathieu.metzger@butema.fr', charset: 'UTF-8')
      }
    }
  }
}