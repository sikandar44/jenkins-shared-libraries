def call(){

    echo 'Deploying with Docker Compose'

    sh '''
    docker compose down || true
    docker compose up -d --build
    '''

}
