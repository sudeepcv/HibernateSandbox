package test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Person {
    private String name;
    
        public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    private Long id;
    
            public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
