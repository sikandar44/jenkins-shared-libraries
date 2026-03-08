def call(){
    echo 'Building Docker Image'
    sh 'docker build -t notes-app:latest .'
}
