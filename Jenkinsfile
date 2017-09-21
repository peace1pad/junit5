pipeline {
    agent { docker 'maven' }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
