pipeline {
    agent any
    stages {
        stage('Clone repo and clean it') {
            steps {
                bat "mvn clean "
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                bat "mvn package"
                bat "java -jar target/integrate-0.0.1-SNAPSHOT.jar"
            }
        }
    }
}
