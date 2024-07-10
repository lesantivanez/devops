pipeline {
    agent {
	docker {
		image "maven:3.6.0-jdk-13"
		label "docker"
	}
   } 

    stages {
        stage('Verify Docker Installation') {
            steps {
                script {
                    // Verifica que Docker esté instalado
                    sh 'docker --version'
                    

                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // Construye la imagen Docker usando el Dockerfile en el directorio de trabajo
                    sh 'mvn clean'
                }
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline completed'
        }
        success {
            echo 'Pipeline succeeded'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}

