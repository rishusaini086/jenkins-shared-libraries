def call(string dockerUser, string image, string tag) {
  withCredentials([usernamePassword(credentialsId:"docker-creds",usernameVariable:"dockerUser",passwordVariable:"dockerPass")]){
    sh "docker login -u ${dockerUser} -p ${dockerPass}
  }
    sh "docker push ${dockerUser}/${image}:${tag}"
}
