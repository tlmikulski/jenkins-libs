def call() {
  def cfg = libraryResource 'config.yaml'
  def code = readYaml text: cfg
  echo code.tools.jdk.path
  
}
