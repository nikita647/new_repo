def call () {
pipeline {
    agent any
    tools {
        ansible 'ansible'
    }
    parameters {
         string defaultValue: 'nikita', name: 'name'
    }
    environment {
         niku = "joshi"
    }
    stages {
        stage ('change') {
            steps {
                  echo "${env.niku}" 
            }
        }
        stage ('version') {
            steps {
                  sh "sudo ansible --version" 
            }
        }
        stage ('approval') {
            steps {
                  input message: 'approval', ok: 'new'
            }
        }
        stage ('print joshi') {
            steps {
                  echo "${params.name}" 
            }
        }
    }
}
}
