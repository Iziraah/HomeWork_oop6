
class Person {
    private String fullName;
    Sex sex;
      
    public String getFullName() {
        return fullName;
    }
      
    public Person(String fullName, Sex sex) {
        this.fullName = fullName;
        this.sex = sex;
    }
      
    @Override
    public String toString() {
        return String.format("(%s)", this.fullName);
    }
}
      
enum Relationship {
    PARENT,
    CHILDREN,
    SPOUSE
  }
  
  enum Sex {
    MALE,
    FEMALE
  }
