pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                // Pruebas unitarias
                script {
                    sh './gradlew clean test --info --stacktrace'
                }
            }
        }
        stage('Build') {
        // Construir tu proyecto
            steps {
                script {
                    bat './gradlew clean build --info --stacktrace'
                }
            }
        }
    }
}
