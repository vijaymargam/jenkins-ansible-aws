pipeline {
  agent any
  parameters {
    string(name: 'EUREKA_IPADDRESS', description: 'localhost')
  }
  tools { 
        maven 'maven'
  }
  stages {
    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace... */
      steps {
        checkout scm
      }
    }
    stage('Build') {
      steps {
        sh 'sed -i "s/localhost/$EUREKA_IPADDRESS/g" $WORKSPACE/src/main/resources/application.properties'
        sh 'mvn -B -DskipTests clean package'
        sh 'echo $USER'
        sh 'echo whoami'
      }
    }
    stage('CreateInstance') {
      steps {
        node('Ansible'){
          checkout scm
        //ansiblePlaybook credentialsId: 'ab13a9b0-7986-420a-af3f-3048a2288ffd', installation: 'Anisble', playbook: '$WORKSPACE/createInstance.yaml'
        
        ansiblePlaybook playbook: '$WORKSPACE/createInstance.yaml'
      }
      }}
    stage('DeployArtifact') {
      steps {
        node('Ansible'){
        sh 'mvn clean package -DskipTests'
       ansiblePlaybook become: true, colorized: true, credentialsId: 'windows', disableHostKeyChecking: true, inventory: '/tmp/hosts_product', playbook: 'deployArtifact.yaml'
        
        }}
   }

  }
}
