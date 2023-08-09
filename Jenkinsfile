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
			bat '''
				D:/Softwares/gradle-8.2.1-all/gradle-8.2.1/bin/gradle clean build
			'''
		}
      
      }
    }
}