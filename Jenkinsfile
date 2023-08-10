pipeline{

    agent any

	environment {
		DOCKERHUB_CREDENTIALS = credentials('dockerhub')
		}

    stages{
      stage('start'){
		steps{
			bat '''
				echo 'starting ....'
			'''
		}
	  }
      stage('build') {
		steps {
			bat '''
				D:/Softwares/gradle-8.2.1-all/gradle-8.2.1/bin/gradle clean build
			'''
			bat 'docker build -t tarkesh88/jenkins-docker-hub-tr .'
			}
		}
	  stage('Login') {
		steps {
			bat 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}
      stage('Push') {
		steps {
			bat 'docker push tarkesh88/jenkins-docker-hub-tr'
			}
		}
	}
	post {
		always {
			bat 'docker logout'
			}
		}
      
}