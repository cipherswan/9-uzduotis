package lt.java.uzduotys.uzduotishelpme;

import javax.persistence.*;

@Entity
@Table(name = "label")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String labelName;

    public Label(){}

    public Label(String labelName) {
        this.labelName = labelName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                '}';
    }
}
