pipeline{
    agent none
    stages{
        stage('Build Master'){
            when{
                branch 'master'
            }
            steps{
                echo "Build the master codes"
            }
        }
        stage('Build Dev'){
            when{
                branch 'dev'
            }
            steps{
                echo "Building the Dev codes"
            }
        }
    }
}