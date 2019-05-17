package dao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.accident.*;

import jdbctool.jdbctool;
public class Logistics_AccidentDao {
	public ArrayList<accident> Inquire() {
		Connection conn = jdbctool.conn();
		ArrayList<accident> list = new ArrayList<accident>();
		String sql = "select * from logistics_accident";
		PreparedStatement prepareStatement;
		try {
			prepareStatement = conn.prepareStatement(sql);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				accident accident = new accident(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5), executeQuery.getString(6));
				list.add(accident);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
