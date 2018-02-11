package com.hillel;

public class City implements Cloneable {

  private String name;

  public City(String name) {
    this.name = name;
  }

  public City(City city) {
    this.name = new String(city.name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    City city = (City) o;

    return name.equals(city.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected City copyCity() throws CloneNotSupportedException {
    return (City) super.clone();
  }
}
