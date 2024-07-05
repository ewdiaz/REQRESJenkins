pipeline {
    agent any
    environment {
        appName = 'MiAplicacion' // Cambia 'variable' por el nombre real de tu aplicación
        GRADLE_HOME = tool name: 'Gradle', type: 'hudson.plugins.gradle.GradleInstallation'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    bat "%GRADLE_HOME%\\bin\\gradle.bat" // Usa % para variables de entorno en Windows
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
            // Aquí puedes agregar más acciones, como notificar a través de Slack o enviar correos electrónicos
        }
        failure {
            echo 'Fase failure'
            // También puedes agregar acciones específicas para el caso de fallo
        }
    }
}

