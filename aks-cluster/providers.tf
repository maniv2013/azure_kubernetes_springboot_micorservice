provider "azurerm" {
  /*subscription_id = var.subscription_id
  tenant_id = var.tenant_id
  client_id = var.client_id
  client_secret = var.client_secret*/
  features {}
}


terraform {
  backend "azurerm" {
    resource_group_name = "tf-deployment-rg"
    storage_account_name = "tfstatesan"
    container_name = "tfstate"
    key = "dev.terraform.tfstate"
  }
  
}