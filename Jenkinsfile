pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    bat './gradlew clean build --info --stacktrace'
                }
            }
        }
    }
}
