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
                sh "nohup java -jar target/integrate-0.0.1-SNAPSHOT.jar &"
            }
        }
    }
}
