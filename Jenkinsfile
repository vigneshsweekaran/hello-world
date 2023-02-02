pipeline {
    agent none

    stages {
        stage('CHECKOUT') {
            agent {label 'slave01'}
            steps {
                git branch: 'main', url: 'https://github.com/prajwal1691/hello-world'
             }
        }
        stage('BUILD') {
            agent {label 'slave01'}
            steps {
               sh '''cd /home/ec2-user/jenkins/workspace/JenkinsDockerBuild
                mvn clean install'''
            }
        }
        stage('DEPLOY') {
            agent {label 'slave01'}
            steps {
               sh '''cd /home/ec2-user/jenkins/workspace/JenkinsDockerBuild/target
                sudo cp *.war /opt/tomcat10/webapps'''
            }
        }
    }
}
