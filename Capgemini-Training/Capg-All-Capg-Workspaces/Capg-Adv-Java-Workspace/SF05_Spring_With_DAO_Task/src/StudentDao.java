//AccountDao.java
public interface StudentDao {
	public void save(Student student);
	public void update(Student student);
	public void remove(int id);
	public Student get(int id);

}