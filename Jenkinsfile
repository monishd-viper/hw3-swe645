pipeline {
    agent any
    environment {
        // Timestamp for versioning the Docker image
        TIMESTAMP = "${currentBuild.startTimeInMillis}"
        // Docker credentials and Docker Hub registry
        registryCredential = 'dockerhub-credentials-id'
        registry = 'monish898/studentsurveyapp'
    }

    stages {
        stage("Build war file") {
            steps {
                script {
                    checkout scm
                    bat 'mvn package'
                    dir('/Users/ADMIN/Downloads/StudentSurveyApp/StudentSurveyApp/target') {
                        bat 'del app.jar'
                        bat 'ren StudentSurveyApp-0.0.1-SNAPSHOT.jar app.jar'
                    }
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image
                    dockerImageBuild = docker.build("${registry}:${env.TIMESTAMP}")
                }
            }
        }

        stage('Push Docker Image to DockerHub') {
            steps {
                script {
                    // Push the Docker image to DockerHub
                    docker.withRegistry('', registryCredential) {
                        dockerImageBuild.push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Directly specify the image name in kubectl command
                    bat """
                    kubectl set image deployment/swe-645hw2 container-0=${registry}:${env.TIMESTAMP}
                    """
                }
            }
        }
    }
}
