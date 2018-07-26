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
                sh './gradlew bootjar'
            }
        }
//        stage('Deploy') {
//            steps {
//                sh 'java -jar build/libs/springboot-demo-0.0.1-SNAPSHOT.jar --server.port=8081'
//            }
//        }
    }
}