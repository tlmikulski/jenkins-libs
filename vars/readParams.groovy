def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each {
    params.add(booleanParam(name: "BUILD_${it}", defaultValue: "${it.checked}", description: "${it.desc}"))
  }

  properties([parameters (params)])
}
