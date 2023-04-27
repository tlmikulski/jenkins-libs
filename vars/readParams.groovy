def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each {
    params.add(booleanParam(name: "BUILD_${it}", defaultValue: "Abc", description: "${it.desc}"))
  }

  properties([parameters (params)])
}
