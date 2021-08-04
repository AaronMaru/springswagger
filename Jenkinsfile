pipeline {
    agent any
    stages {
        stage('Clone repo and clean it') {
            steps {
                sh "mvn clean "
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn package"
                sh "pid=\$(lsof -i:8585 -t); kill -TERM \$pid || kill -KILL \$pid"
                withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                    sh 'nohup java -jar integrate-0.0.1-SNAPSHOT.jar &'
                }   
            }
        }
    }
}
