pipeline {
    agent any
    stages {
        stage('Clone repo and clean it') {
            steps {
                bat "del -f springswagger"
                bat "git clone https://github.com/AaronMaru/springswagger.git"
                bat "mvn clean -f springswagger"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test -f springswagger"
            }
        }
        stage('Deploy') {
            steps {
                bat "mvn package -f springswagger"
            }
        }
    }
}
