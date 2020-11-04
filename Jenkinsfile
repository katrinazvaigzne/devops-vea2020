pipeline {
  agent any
  stages {
    stage('Build') {
      environment {
        HOME = '.'
      }
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test') {
      environment {
        HOME = '.'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }

      }
      steps {
        sh 'mvn test'
      }
    }

  }
}