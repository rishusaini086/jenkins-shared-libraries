def call(string dockerHubUser, string imageName, string imageTag){
  sh "docker build -t ${dockerHubUser}/${imageName}:${imageTag} ."
}
