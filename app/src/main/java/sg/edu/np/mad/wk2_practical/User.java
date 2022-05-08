package sg.edu.np.mad.wk2_practical;

public class User {
    String name;
    String description;
    Integer id;
    Boolean followed;
    /*private String name;

    public String getName(){ return name; }

    private String description;

    public String getDescription(){ return description; }

    private Integer id;

    public Integer getId(){ return id; }

    private Boolean followed;

    public Boolean getFollowed(){ return followed; } */

    public User(){
    this.id = 0;
    this.followed = false;
    }
}
