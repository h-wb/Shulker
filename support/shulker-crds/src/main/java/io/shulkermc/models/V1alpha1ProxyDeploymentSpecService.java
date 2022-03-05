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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The desired state of the Kubernetes Service to create for the Proxy Deployment.
 */
@ApiModel(description = "The desired state of the Kubernetes Service to create for the Proxy Deployment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T15:48:55.272Z[Etc/UTC]")
public class V1alpha1ProxyDeploymentSpecService {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  /**
   * Type of Service to create. Must be one of: ClusterIP, LoadBalancer, NodePort. More info: https://pkg.go.dev/k8s.io/api/core/v1#ServiceType
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLUSTERIP("ClusterIP"),
    
    LOADBALANCER("LoadBalancer"),
    
    NODEPORT("NodePort");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public V1alpha1ProxyDeploymentSpecService annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ProxyDeploymentSpecService putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations to add to the Service.
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to add to the Service.")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1ProxyDeploymentSpecService enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether to create a Service for the Proxy Deployment. Defaults to false.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to create a Service for the Proxy Deployment. Defaults to false.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public V1alpha1ProxyDeploymentSpecService type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of Service to create. Must be one of: ClusterIP, LoadBalancer, NodePort. More info: https://pkg.go.dev/k8s.io/api/core/v1#ServiceType
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of Service to create. Must be one of: ClusterIP, LoadBalancer, NodePort. More info: https://pkg.go.dev/k8s.io/api/core/v1#ServiceType")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ProxyDeploymentSpecService v1alpha1ProxyDeploymentSpecService = (V1alpha1ProxyDeploymentSpecService) o;
    return Objects.equals(this.annotations, v1alpha1ProxyDeploymentSpecService.annotations) &&
        Objects.equals(this.enabled, v1alpha1ProxyDeploymentSpecService.enabled) &&
        Objects.equals(this.type, v1alpha1ProxyDeploymentSpecService.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, enabled, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ProxyDeploymentSpecService {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

