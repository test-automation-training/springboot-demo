pipeline {
    agent any
    stages {
        stage('Unit Test') {
            steps {
                sh './gradlew test --tests "name.huhao.springbootdemo.unit.*"'
            }
        }
        stage('Integration Test') {
            steps {
                sh './gradlew test --tests "name.huhao.springbootdemo.integration.*"'
            }
        }
        stage('E2E Test') {
            steps {
                sh './gradlew test --tests "name.huhao.springbootdemo.e2e.*"'
            }
        }
        stage('Package') {
            steps {
                sh './gradlew bootJar'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker-compose down --rmi local'
                sh 'docker-compose build'
                sh 'docker-compose up -d'
            }
        }
    }
}