
import Util.ConnectionUtil;
import Util.FileUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * SQL sublanguage: DML (Data Manipulation Language)
 *
 * Now that we can create and drop tables, we need to be able to insert records into the table.
 *
 * The syntax for inserting a record is as follows:
 *  INSERT INTO table_name (col_1, col_2, ...col_N) VALUES (val_1, val_2, ...val_N);
 *
 *  in the above statement:
 *      - "col_1, col_2, ...col_N"  is referring to the column name of the table.
 *      - "val_1, val_2, ...val_N" is referring to the data we are trying to insert into that specific column.
 *
 * Additional reference material if needed: https://www.w3schools.com/sql/sql_insert.asp
 * */
public class InsertARecord {

    /**
     * Activity: Assuming the table "song" already exists, write the sql statement in the problem1.sql file that allows
     * us to add a new record into the table "song". It should work with any values for title and artist!
     *
     *          song Table Diagram:
     *          |      title        |        artist         |
     *          ---------------------------------------------
     *          |'Let it be'        |'Beatles'              |
     *          |'Hotel California' |'Eagles'               |
     *          |'Kashmir'          |'Led Zeppelin'         |
     *
     * Note: when inserting strings, you wrap the string in a single quote. 'like this'
     * */
    public boolean problem1(){
        String sql = FileUtil.parseSQLFile("problem1.sql");
        //These are parallel arrays that im going to use a for loop to loop through and enter into the database
        String[] titleData = {"Vogue", "Wonderwall", "Jump", "Bitter Sweet Symphony", "Good Vibrations"};
        
        String[] artistData = {"Madonna", "Oasis", "Kriss Kross", "The Verve", "Marky Mark and the Funky Bunch"};
        
        

        
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            //Looping through and inserting the corresponding values into the database
            for(int count = 0; count < titleData.length; count++)
            {   
                String statement = "INSERT INTO song (title, artist) VALUES" + "(" +"\'"+  titleData[count]  +"\'"+" ,"  +"\'"+ artistData[count]  +"\'"+ ")";
                System.out.println(statement);
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(statement);
            }

            return s.executeUpdate(sql) != 0;

            

        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }

        return false;
    }
}
