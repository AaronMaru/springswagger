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
                sh 'nohup ./mvnw spring-boot:run -Dserver.port=8585 &'
            }
        }
    }
}
