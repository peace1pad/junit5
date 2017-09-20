pipeline {
    agent { docker 'docker-java8-maven' }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
