pipeline {
    agent any
    
    tools {
       maven 'Maven Apache'
    }
    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio desde GitHub
                git url: 'https://github.com/lesantivanez/devops.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                // Compilar el proyecto usando Maven
                script {
                // Instalar Maven si no está disponible
                    if (!isUnix()) {
                        bat 'mvn -version || echo Maven is not installed'
                    } else {
                        sh 'mvn -version || echo Maven is not installed'
                    }                    
                }
                
                // Compilar proyecto
                sh 'mvn clean install'
            }
        }
    }
    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
