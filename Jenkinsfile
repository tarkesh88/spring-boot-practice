pipeline{

    agent any

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
			/*bat '''
				D:/Softwares/gradle-8.2.1-all/gradle-8.2.1/bin/gradle clean build
			'''*/
			//bat 'docker build --build-arg JAR_FILE=target/*.jar -t tarkesh88/jenkins-docker-hub-tr:latest .'
			bat 'docker build -t tarkesh88/jenkins-docker-hub-tr .'
			}
		}
	  stage('Login') {
		steps {
			bat 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u tarkesh88 -p dckr_pat_dHzHSFH4caRQZXh-dyxrxr_2eso'
			}
		}
      stage('Push') {
		steps {
			bat 'docker push tarkesh88/jenkins-docker-hub-tr:latest'
			}
		}
	  stage('Deploy') {
		steps {
			bat '''
				echo 'deploy..'
				'''
				
			}
		}	
	}
	post {
		always {
			bat 'docker logout'
			}
		}
      
}