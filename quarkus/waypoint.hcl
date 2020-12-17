project = "waypoint-demo"

app "example-quarkus" {
  labels = {
    "service" = "example-quarkus",
    "env" = "dev"
  }

  build {
    use "pack" {
      builder="gcr.io/buildpacks/builder:v1"
    }
  }

  deploy { 
    use "docker" {
      service_port = 8080
    }
  }
}
