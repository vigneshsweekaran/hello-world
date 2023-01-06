pipeline {
    agent none

    stages {
        stage('CHECKOUT') {
            agent {label 'slave01'}
            steps {
                git branch: 'main', url: 'https://github.com/prajwal1691/hello-world'
                sh 'sleep 5'
                }
                
            }
            stage('BUILD') {
            agent {label 'slave01'}
                steps {
            sh '''cd /home/ec2-user/jenkins/workspace/agentpipeline
                mvn clean install'''
                sh 'sleep 10'
                }
        }
        stage('DEPLOY') {
            agent {label 'slave01'}
            steps {
               sh '''cd /home/ec2-user/jenkins/workspace/agentpipeline/target
                sudo cp *.war /opt/tomcat9/webapps'''
                sh 'sleep 5'
            }
        }
    }
}
