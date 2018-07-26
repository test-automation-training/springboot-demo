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
        stage('Deploy') {
            steps {
                sh './gradlew bootrun'
            }
        }
    }
}