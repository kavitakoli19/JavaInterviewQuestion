http://tutorials.jenkov.com/jdbc/index.html

```

Class.forName(driver_name);
//url :: consists of ip address+PortNum+dataBaseName

Connection con = DriverManager.getConnection(url,usernm,pwd);

try(Connection con = DriverManager.getConnection(url,usernm,pwd)){

// classes those implment CLoseble interface can be used inside try with resource

  con.setAutoCommit(false);
  String sql  = select * from People where id = ?;

  try(Statment stm = con.prepatedStatement(sql)){
    stm.setInt(1,123);
    stm.executeQuery();
    con.commit();
  }catch(Exception e){
     con.setRollBack(true);
  }
}finally{
   
}
```


## Statement Type

  ### Create Statement : 
  
  ```
        Statement statement = connection.createStatement();

        String    sql       = "update people set name='John' where id=123";

        int rowsAffected    = statement.executeUpdate(sql);
        
  ```
        
        
   ### Prepared Statement ::
      
      ```
      
      String sql = "update people set firstname=? , lastname=? where id=?";

        PreparedStatement preparedStatement =
        connection.prepareStatement(sql);

      preparedStatement.setString(1, "Gary");
      preparedStatement.setString(2, "Larson");
      preparedStatement.setLong  (3, 123);

      int rowsAffected = preparedStatement.executeUpdate();

      preparedStatement.setString(1, "Stan");
      preparedStatement.setString(2, "Lee");
      preparedStatement.setLong  (3, 456);

      int rowsAffected = preparedStatement.executeUpdate();

      ```
      
      
   ### Callable Statment :: 
   
   ```
      CallableStatement callableStatement =
      connection.prepareCall("{call calculateStatistics(?, ?)}");

      callableStatement.setString(1, "param1");
      callableStatement.setInt   (2, 123);
   ```

### Difference ::
  Prepare statement object can be reused again and again by passing different paraments as shown above.
  It is less processing for everytime creating a query.
  
### Methods for different methods :: 
    Insert , Update, Delete :: stmt.executeUpdate();
    Selct                   :: stms.executeQuery();
    Batch                   :: stmt.executeBatch();
    Callable for update     :: stmt.executeUdate();
    Callable Select         :: stms.executeQuery();
    
    
    
 ### Batch Execution : :
 
 #### Batch can be used for Update statements but not for Select queries
 
 ```
 
 String sql = "update people set firstname=? , lastname=? where id=?";


PreparedStatement preparedStatement = null;
try{
    preparedStatement =
            connection.prepareStatement(sql);

    preparedStatement.setString(1, "Gary");
    preparedStatement.setString(2, "Larson");
    preparedStatement.setLong  (3, 123);

    preparedStatement.addBatch();

    preparedStatement.setString(1, "Stan");
    preparedStatement.setString(2, "Lee");
    preparedStatement.setLong  (3, 456);

    preparedStatement.addBatch();

    int[] affectedRecords = preparedStatement.executeBatch();

}finally {
    if(preparedStatement != null) {
        preparedStatement.close();
    }
}
 
 
 ```
  

