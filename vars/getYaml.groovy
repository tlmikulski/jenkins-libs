def call() {
  def cfg = libraryResource 'config.yaml'
  def code = readYaml text: cfg
  return code.tools.jdk.path
  
}
