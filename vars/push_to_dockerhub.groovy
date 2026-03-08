def call(){

    echo 'Pushing Image to Docker Hub'

    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCred',
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {

        sh 'docker login -u $dockerHubUser -p $dockerHubPass'
        sh 'docker tag notes-app:latest $dockerHubUser/notes-app:latest'
        sh 'docker push $dockerHubUser/notes-app:latest'
    }

}
