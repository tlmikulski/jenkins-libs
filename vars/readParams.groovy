def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each { key, props ->
    params.add(booleanParam(name: "BUILD_${key}", defaultValue: "${props.checked}", description: "${props.desc}"))
  }

  properties([parameters (params)])
}
