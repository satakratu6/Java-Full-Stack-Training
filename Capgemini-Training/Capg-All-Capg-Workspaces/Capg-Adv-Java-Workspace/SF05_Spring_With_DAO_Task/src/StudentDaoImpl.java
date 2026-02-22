import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

        //   Step 10
public class StudentDaoImpl implements StudentDao {
   	
    // dataSource reference wants database connection 
	 // username,password,url,database 
	  // how this dataSource gets : driver class,url ,username,pass
	  // this dataSource gets username,password like .. from applicationContex_Dao.xml
	private DataSource dataSource;   //Step 11
	//dataSource=dataSourceRam
	             // driver = driverClassName(Spring attribute)
	
	public StudentDaoImpl() {
		
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; //driverclass ,url ,username,pass
	}
	
	    
	         //Step 15      // 59  Ravi Saving1 7777
	public void save(Student student) {
		  System.out.println("StudenttDaoImpl  save()");
		// Declare resources
		Connection connection = null;
		PreparedStatement pstmt = null;
		try { // Get connection.
			connection = dataSource.getConnection();  //Step 16  (internally goto Step 11 and take db connection)
			// Create statement.                          
			pstmt = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			// Set parameters.
			pstmt.setInt(1, student.getId());  
			pstmt.setString(2, student.getName()); 
			pstmt.setInt(3, student.getRollno()); 
			pstmt.setString(4, student.getAddress());   
			// Execute statement.
			pstmt.execute();
			// Handle Exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Clean up resources to avoid memory leaks problems.
		finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Student get(int id) {
		// Declare resources.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Student avo = null;
		try {
			con = dataSource.getConnection();
			// Create statement object.
			stmt = con.createStatement();
			// Prepare query.
			String query = "SELECT * FROM student WHERE id=" + id;
			// Execute query.
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				avo = new Student();
				avo.setId(rs.getInt(1));
				avo.setName(rs.getString(2));
				avo.setRollno(rs.getInt(3));
				avo.setAddress(rs.getString(4));
			}
			// Handle exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Release resources to avoid memory leaks.
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return avo;
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	

	

}
