pipeline {
    agent any

    stages {
        stage('CHECKOUT') {
            steps {
                git branch: 'main', url: 'https://github.com/prajwal1691/hello-world'
             }
        }
        stage('BUILD') {
            steps {
               sh 'cd /var/jenkins_home/workspace/sonar'
                sh 'mvn clean install'
            }
        }
        stage('Sonarqube') {
            environment {
              scannerHome = tool 'SonarQubeScanner'
             }
            steps {
              withSonarQubeEnv('sonarqube') {
               sh "${scannerHome}/bin/sonar-scanner -Dsonar.java.binaries=/var/jenkins_home/workspace/sonar/target"
                }
               timeout(time: 1, unit: 'MINUTES') {
              waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
