terraform {
  required_version = ">= 1.5.0"

  required_providers {
    local = {
      source  = "hashicorp/local"
      version = "~> 2.4"
    }
  }
}

resource "local_file" "app_config" {
  filename = "${path.module}/output/${var.environment}/app.conf"
  content  = "environment = ${var.environment}\n"
}
