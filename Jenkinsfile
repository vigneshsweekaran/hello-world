pipeline {
    agent any

    stages {
        stage('CHECKOUT') {
            
            steps {
                git branch: 'main', url: 'https://github.com/prajwal1691/hello-world'
             }
        }
        stage('SonarQube analysis') {
            steps {
                // Invoke the SonarQube scanner
                withSonarQubeEnv(credentialsId: 'jenkins-sonar') {
                    sh 'sonar-scanner'
                }
            }
        }
    }
}
