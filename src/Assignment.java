
public class Assignment {
    private String Title;
    private Date DueDate;

    public Assignment(String title, Date dueDate) {
        Title = title;
        DueDate = dueDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }
}
