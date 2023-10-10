use k8s_openapi::api::apps::v1::DeploymentStrategy;
use kube::{core::ObjectMeta, CustomResource};
use schemars::JsonSchema;
use serde::{Deserialize, Serialize};

use super::game_server::GameServerSpec;

#[derive(CustomResource, Deserialize, Serialize, Clone, Debug, JsonSchema, Default)]
#[kube(
    kind = "Fleet",
    group = "agones.dev",
    version = "v1",
    namespaced,
    status = "FleetStatus"
)]
#[serde(rename_all = "camelCase")]
pub struct FleetSpec {
    pub replicas: Option<i32>,
    pub strategy: Option<DeploymentStrategy>,
    pub scheduling: Option<String>,
    pub template: FleetTemplate,
}

#[derive(Deserialize, Serialize, Clone, Debug, JsonSchema, Default)]
#[serde(rename_all = "camelCase")]
pub struct FleetTemplate {
    pub metadata: Option<ObjectMeta>,
    pub spec: GameServerSpec,
}

#[derive(Deserialize, Serialize, Clone, Debug, JsonSchema, Default)]
#[serde(rename_all = "camelCase")]
pub struct FleetStatus {
    pub replicas: i32,
    pub ready_replicas: i32,
    pub reserved_replicas: i32,
    pub allocated_replicas: i32,
}
