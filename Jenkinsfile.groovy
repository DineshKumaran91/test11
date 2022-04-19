pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                changelog ".*some_text.*"
            }
            steps {
                echo "Hello Build Tags"
            }
        }
    }
}