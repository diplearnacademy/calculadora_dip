pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh './gradlew clean build --info --stacktrace'
                }
            }
        }
    }
}
