pipeline {
    agent any

    stages {
        stage('This is the pipeline for seed job 2') {
            steps {
                echo "Hello from this branch: ${env.GIT_BRANCH}"
                sh "printenv"
            }
        }
    }
}