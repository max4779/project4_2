package com.example.project4_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	private final String BOARD_INSERT = "insert into 4_2_BOARD (name, phone_number,email,address,college,department,hobby,religion,favorite_food,favorite_juice) values (?,?,?,?,?,?,?,?,?,?)";
	private final String BOARD_UPDATE = "update 4_2_BOARD set name=?, phone_number=?,email=?,address=?,college=?,department=?,hobby=?,religion=?,favorite_food=?,favorite_juice=? where seq=?";
	private final String BOARD_DELETE = "delete from 4_2_BOARD  where seq=?";
	private final String BOARD_GET = "select * from 4_2_BOARD  where seq=?";
	private final String BOARD_LIST = "select * from 4_2_BOARD order by seq desc";

	public int insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getName());
			stmt.setInt(2, vo.getNumber());
			stmt.setString(3, vo.getEmail());
			stmt.setString(4, vo.getAddress());
			stmt.setString(5, vo.getCollege());
			stmt.setString(6, vo.getDepartment());
			stmt.setString(7, vo.getHobby());
			stmt.setString(8, vo.getReligion());
			stmt.setString(9, vo.getFood());
			stmt.setString(10, vo.getJuice());
			stmt.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getName());
			stmt.setInt(2, vo.getNumber());
			stmt.setString(3, vo.getEmail());
			stmt.setString(4, vo.getAddress());
			stmt.setString(5, vo.getCollege());
			stmt.setString(6, vo.getDepartment());
			stmt.setString(7, vo.getHobby());
			stmt.setString(8, vo.getReligion());
			stmt.setString(9, vo.getFood());
			stmt.setString(10, vo.getJuice());
			stmt.setInt(11, vo.getSeq());


			System.out.println(vo.getName() + "-" + vo.getNumber() + "-" +vo.getEmail() + "-" +vo.getAddress() + "-" +vo.getCollege() + "-" +vo.getDepartment() + "-" +vo.getHobby() + "-" +vo.getReligion() + "-" +vo.getFood() + "-" +vo.getJuice() + "-" +vo.getSeq()	);
			stmt.executeUpdate();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}	
	
	public BoardVO getBoard(int seq) {
		BoardVO one = new BoardVO();
		System.out.println("===> JDBC로 getBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, seq);
			rs = stmt.executeQuery();
			if(rs.next()) {
				one.setSeq(rs.getInt("seq"));
				one.setName(rs.getString("name"));
				one.setNumber(rs.getInt("phone_number"));
				one.setEmail(rs.getString("email"));
				one.setAddress(rs.getString("address"));
				one.setCollege(rs.getString("college"));
				one.setDepartment(rs.getString("department"));
				one.setHobby(rs.getString("hobby"));
				one.setReligion(rs.getString("religion"));
				one.setFood(rs.getString("favorite_food"));
				one.setJuice(rs.getString("favorite_juice"));
				one.setCnt(rs.getInt("cnt"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return one;
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = new ArrayList<BoardVO>();
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO one = new BoardVO();
				one.setSeq(rs.getInt("seq"));
				one.setName(rs.getString("name"));
				one.setNumber(rs.getInt("phone_number"));
				one.setEmail(rs.getString("email"));
				one.setAddress(rs.getString("address"));
				one.setCollege(rs.getString("college"));
				one.setDepartment(rs.getString("department"));
				one.setHobby(rs.getString("hobby"));
				one.setReligion(rs.getString("religion"));
				one.setFood(rs.getString("favorite_food"));
				one.setJuice(rs.getString("favorite_juice"));
				one.setRegdate(rs.getDate("regdate"));
				one.setCnt(rs.getInt("cnt"));
				list.add(one);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
}
