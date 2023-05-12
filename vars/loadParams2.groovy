def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each { key, props ->
    switch(props.type) {
      case 'booleanParam':
        params.add(booleanParam(name: key, value: true))
      break

      case 'string':
        params.add(string(name: key, value: 'StringValHardcoded'))
      break

      case 'choice':
        params.add(string(name: key, choice: 'hoice4'))
      break
    }
  }

  return params
}
