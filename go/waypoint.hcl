project = "waypoint-demo"

app "example-go" {
  labels = {
    "service" = "example-go",
    "env" = "dev"
  }

  build {
    use "pack" {}
  }

  deploy { 
    use "docker" {}
  }
}
