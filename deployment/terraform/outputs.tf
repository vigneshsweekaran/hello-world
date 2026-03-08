output "environment" {
  description = "The target environment"
  value       = var.environment
}

output "config_file_path" {
  description = "Path of the generated config file"
  value       = local_file.app_config.filename
}
