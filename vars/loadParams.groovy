def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each { key, props ->
    switch(props.type) {
      case 'booleanParam':
        params.add(booleanParam(name: key, defaultValue: props.defaultValue, description: props.description))
      break

      case 'string':
        params.add(string(name: key, defaultValue: props.defaultValue, description: props.description, trim: props.trim))
      break

      case 'choice':
        params.add(choice(name: key, choices: props.choices, description: props.description))
      break
    }
  }

  properties([parameters (params)])
}
