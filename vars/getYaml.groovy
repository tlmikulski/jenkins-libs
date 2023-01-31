def call() {
  def cfg = libraryResource 'config.yaml'
  def readYaml text: cfg
  
}
