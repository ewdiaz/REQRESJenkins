pipeline {
    agent any
    environment {
        appName = 'MiAplicacion' 
        GRADLE_HOME = tool name: 'Gradle', type: 'hudson.plugins.gradle.GradleInstallation'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    bat "%GRADLE_HOME%\\gradle.bat" 
                }
            }
        }
    }
    post {
        always {
            echo 'Fase always'
        }
        success {
            echo 'Fase success'
            
        }
        failure {
            echo 'Fase failure'
            
        }
    }
}

