pipeline {
    agent any

    stages {
        stage('CHECKOUT') {
            
            steps {
                git branch: 'main', url: 'https://github.com/prajwal1691/hello-world'
             }
        }
        stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarScanner';
    withSonarQubeEnv() {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
 }
}
