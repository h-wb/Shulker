/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.shulkermc.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecAffinity;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecMinecraftClusterRef;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecPodOverrides;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecResources;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecService;
import io.shulkermc.models.V1alpha1ProxyDeploymentSpecVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProxyDeploymentSpec defines the desired state of ProxyDeployment
 */
@ApiModel(description = "ProxyDeploymentSpec defines the desired state of ProxyDeployment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T15:48:55.272Z[Etc/UTC]")
public class V1alpha1ProxyDeploymentSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1alpha1ProxyDeploymentSpecAffinity affinity;

  public static final String SERIALIZED_NAME_MAX_PLAYERS = "maxPlayers";
  @SerializedName(SERIALIZED_NAME_MAX_PLAYERS)
  private Long maxPlayers;

  public static final String SERIALIZED_NAME_MINECRAFT_CLUSTER_REF = "minecraftClusterRef";
  @SerializedName(SERIALIZED_NAME_MINECRAFT_CLUSTER_REF)
  private V1alpha1ProxyDeploymentSpecMinecraftClusterRef minecraftClusterRef;

  public static final String SERIALIZED_NAME_MOTD = "motd";
  @SerializedName(SERIALIZED_NAME_MOTD)
  private String motd;

  public static final String SERIALIZED_NAME_POD_OVERRIDES = "podOverrides";
  @SerializedName(SERIALIZED_NAME_POD_OVERRIDES)
  private V1alpha1ProxyDeploymentSpecPodOverrides podOverrides;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1ProxyDeploymentSpecResources resources;

  public static final String SERIALIZED_NAME_SERVER_ICON = "serverIcon";
  @SerializedName(SERIALIZED_NAME_SERVER_ICON)
  private String serverIcon;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private V1alpha1ProxyDeploymentSpecService service;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private V1alpha1ProxyDeploymentSpecVersion version;


  public V1alpha1ProxyDeploymentSpec affinity(V1alpha1ProxyDeploymentSpecAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ProxyDeploymentSpecAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1alpha1ProxyDeploymentSpecAffinity affinity) {
    this.affinity = affinity;
  }


  public V1alpha1ProxyDeploymentSpec maxPlayers(Long maxPlayers) {
    
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * Number of maximum players that can connect to the Proxy Deployment.
   * @return maxPlayers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of maximum players that can connect to the Proxy Deployment.")

  public Long getMaxPlayers() {
    return maxPlayers;
  }


  public void setMaxPlayers(Long maxPlayers) {
    this.maxPlayers = maxPlayers;
  }


  public V1alpha1ProxyDeploymentSpec minecraftClusterRef(V1alpha1ProxyDeploymentSpecMinecraftClusterRef minecraftClusterRef) {
    
    this.minecraftClusterRef = minecraftClusterRef;
    return this;
  }

   /**
   * Get minecraftClusterRef
   * @return minecraftClusterRef
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1ProxyDeploymentSpecMinecraftClusterRef getMinecraftClusterRef() {
    return minecraftClusterRef;
  }


  public void setMinecraftClusterRef(V1alpha1ProxyDeploymentSpecMinecraftClusterRef minecraftClusterRef) {
    this.minecraftClusterRef = minecraftClusterRef;
  }


  public V1alpha1ProxyDeploymentSpec motd(String motd) {
    
    this.motd = motd;
    return this;
  }

   /**
   * Message to display when the players query the status of the Proxy Deployment.
   * @return motd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message to display when the players query the status of the Proxy Deployment.")

  public String getMotd() {
    return motd;
  }


  public void setMotd(String motd) {
    this.motd = motd;
  }


  public V1alpha1ProxyDeploymentSpec podOverrides(V1alpha1ProxyDeploymentSpecPodOverrides podOverrides) {
    
    this.podOverrides = podOverrides;
    return this;
  }

   /**
   * Get podOverrides
   * @return podOverrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ProxyDeploymentSpecPodOverrides getPodOverrides() {
    return podOverrides;
  }


  public void setPodOverrides(V1alpha1ProxyDeploymentSpecPodOverrides podOverrides) {
    this.podOverrides = podOverrides;
  }


  public V1alpha1ProxyDeploymentSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of replicas the Proxy Deployment should have.
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of replicas the Proxy Deployment should have.")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1alpha1ProxyDeploymentSpec resources(V1alpha1ProxyDeploymentSpecResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ProxyDeploymentSpecResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1ProxyDeploymentSpecResources resources) {
    this.resources = resources;
  }


  public V1alpha1ProxyDeploymentSpec serverIcon(String serverIcon) {
    
    this.serverIcon = serverIcon;
    return this;
  }

   /**
   * Server icon image in base64 format.
   * @return serverIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Server icon image in base64 format.")

  public String getServerIcon() {
    return serverIcon;
  }


  public void setServerIcon(String serverIcon) {
    this.serverIcon = serverIcon;
  }


  public V1alpha1ProxyDeploymentSpec service(V1alpha1ProxyDeploymentSpecService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ProxyDeploymentSpecService getService() {
    return service;
  }


  public void setService(V1alpha1ProxyDeploymentSpecService service) {
    this.service = service;
  }


  public V1alpha1ProxyDeploymentSpec version(V1alpha1ProxyDeploymentSpecVersion version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ProxyDeploymentSpecVersion getVersion() {
    return version;
  }


  public void setVersion(V1alpha1ProxyDeploymentSpecVersion version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ProxyDeploymentSpec v1alpha1ProxyDeploymentSpec = (V1alpha1ProxyDeploymentSpec) o;
    return Objects.equals(this.affinity, v1alpha1ProxyDeploymentSpec.affinity) &&
        Objects.equals(this.maxPlayers, v1alpha1ProxyDeploymentSpec.maxPlayers) &&
        Objects.equals(this.minecraftClusterRef, v1alpha1ProxyDeploymentSpec.minecraftClusterRef) &&
        Objects.equals(this.motd, v1alpha1ProxyDeploymentSpec.motd) &&
        Objects.equals(this.podOverrides, v1alpha1ProxyDeploymentSpec.podOverrides) &&
        Objects.equals(this.replicas, v1alpha1ProxyDeploymentSpec.replicas) &&
        Objects.equals(this.resources, v1alpha1ProxyDeploymentSpec.resources) &&
        Objects.equals(this.serverIcon, v1alpha1ProxyDeploymentSpec.serverIcon) &&
        Objects.equals(this.service, v1alpha1ProxyDeploymentSpec.service) &&
        Objects.equals(this.version, v1alpha1ProxyDeploymentSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, maxPlayers, minecraftClusterRef, motd, podOverrides, replicas, resources, serverIcon, service, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ProxyDeploymentSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    minecraftClusterRef: ").append(toIndentedString(minecraftClusterRef)).append("\n");
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
    sb.append("    podOverrides: ").append(toIndentedString(podOverrides)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    serverIcon: ").append(toIndentedString(serverIcon)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

