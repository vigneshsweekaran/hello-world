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
               sh 'cd /home/ec2-user/jenkins/workspace/hello-world'
                sh 'mvn clean install'
            }
        }
        
    }
}
