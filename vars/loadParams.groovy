def call(configFile) {
  def libParams = libraryResource "configs/${configFile}.yaml"
  def cfgParams = readYaml text: libParams
  def params = []

  cfgParams.each { key, props ->
    switch(props.type) {
      case 'booleanParam':
        params.add(booleanParam(name: props.name, defaultValue: props.defaultValue, description: props.description))
      break

      case 'string':
        params.add(string(name: props.name, defaultValue: props.defaultValue, description: props.description, trim: props.trim))
      break

      case 'choice':
        params.add(choice(name: props.name, choices: props.choices, description: props.description))
      break
    }
  }

  properties([parameters (params)])
}
