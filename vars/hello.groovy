def call () {
  pipeline {
    agent any
    stages {
      stage('build') {
        steps {
          echo "hello nikita"
        }
      }
    }
  }
}
