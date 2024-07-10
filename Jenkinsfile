pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
    }
    agent {
        dockerfile {
            args '-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2'
        }
    }
    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio desde GitHub
                git url: 'https://github.com/3ct-mx/spring-boot-computadoras.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Compilar el proyecto usando Maven
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

