package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Sforce_dao {
	@Autowired
	private JdbcTemplate jdbcTemplete;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;
	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall6;
	SimpleJdbcCall getAllStatesJdbcCall7;
	SimpleJdbcCall getAllStatesJdbcCall8;
	SimpleJdbcCall getAllStatesJdbcCall9;
	SimpleJdbcCall getAllStatesJdbcCall10;
	SimpleJdbcCall getAllStatesJdbcCall11;
	SimpleJdbcCall getAllStatesJdbcCall12;
	SimpleJdbcCall getAllStatesJdbcCall13;
	SimpleJdbcCall getAllStatesJdbcCall14;
	SimpleJdbcCall getAllStatesJdbcCall15;
	SimpleJdbcCall getAllStatesJdbcCall16;
	SimpleJdbcCall getAllStatesJdbcCall17;
	SimpleJdbcCall getAllStatesJdbcCall18;
	SimpleJdbcCall getAllStatesJdbcCall19;
	SimpleJdbcCall getAllStatesJdbcCall20;
	SimpleJdbcCall getAllStatesJdbcCall21;
	SimpleJdbcCall getAllStatesJdbcCall22;
	SimpleJdbcCall getAllStatesJdbcCall23;
	SimpleJdbcCall getAllStatesJdbcCall24;
	SimpleJdbcCall getAllStatesJdbcCall25;
//new
	SimpleJdbcCall getAllStatesJdbcCall100;
	SimpleJdbcCall getAllStatesJdbcCall101;
	SimpleJdbcCall getAllStatesJdbcCall102;
	SimpleJdbcCall getAllStatesJdbcCall103;
	SimpleJdbcCall getAllStatesJdbcCall104;
	SimpleJdbcCall getAllStatesJdbcCall105;
	SimpleJdbcCall getAllStatesJdbcCall106;
	SimpleJdbcCall getAllStatesJdbcCall107;
	SimpleJdbcCall getAllStatesJdbcCall108;
	// today
	SimpleJdbcCall getAllStatesJdbcCall109;
	SimpleJdbcCall getAllStatesJdbcCall110;
	SimpleJdbcCall getAllStatesJdbcCall111;
	SimpleJdbcCall getAllStatesJdbcCall112;
	SimpleJdbcCall getAllStatesJdbcCall113;
	SimpleJdbcCall getAllStatesJdbcCall114;
	SimpleJdbcCall getAllStatesJdbcCall115;
	SimpleJdbcCall getAllStatesJdbcCall116;
	SimpleJdbcCall getAllStatesJdbcCall117;
	SimpleJdbcCall getAllStatesJdbcCall118;
	SimpleJdbcCall getAllStatesJdbcCall119;
	SimpleJdbcCall getAllStatesJdbcCall120;
	SimpleJdbcCall getAllStatesJdbcCall121;
	SimpleJdbcCall getAllStatesJdbcCall122;
	SimpleJdbcCall getAllStatesJdbcCall123;
	SimpleJdbcCall getAllStatesJdbcCall124;
	SimpleJdbcCall getAllStatesJdbcCall125;
	SimpleJdbcCall getAllStatesJdbcCall126;
	SimpleJdbcCall getAllStatesJdbcCall127;
	SimpleJdbcCall getAllStatesJdbcCall128;
	SimpleJdbcCall getAllStatesJdbcCall129;
	SimpleJdbcCall getAllStatesJdbcCall130;
	SimpleJdbcCall getAllStatesJdbcCall131;
	SimpleJdbcCall getAllStatesJdbcCall132;
	SimpleJdbcCall getAllStatesJdbcCall133;
	SimpleJdbcCall getAllStatesJdbcCall134;
	SimpleJdbcCall getAllStatesJdbcCall135;
	SimpleJdbcCall getAllStatesJdbcCall136;
	SimpleJdbcCall getAllStatesJdbcCall137;
	SimpleJdbcCall getAllStatesJdbcCall138;
	SimpleJdbcCall getAllStatesJdbcCall139;
	SimpleJdbcCall getAllStatesJdbcCall140;
	SimpleJdbcCall getAllStatesJdbcCall141;






	public Sforce_dao(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall7 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall8 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall9 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall10 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall11 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall12 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall13 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall14 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall15 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall16 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall17 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall18 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall19 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall20 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall21 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall22 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall23 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall24 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall25 = new SimpleJdbcCall(dataSource);

//new
		this.getAllStatesJdbcCall100 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall101 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall102 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall103 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall104 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall105 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall106 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall107 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall108 = new SimpleJdbcCall(dataSource);

		// today
		this.getAllStatesJdbcCall109 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall110 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall111 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall112 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall113 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall114 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall115 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall116 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall117 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall118 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall119 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall120 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall121 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall122 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall123 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall124 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall125 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall126 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall127 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall128 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall129 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall130 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall131 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall132 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall133 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall134 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall135 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall136 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall137 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall138 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall139 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall140 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall141 = new SimpleJdbcCall(dataSource);


	} 

	public int inset_designation_Hy(String part) {

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("INFO")
				.withProcedureName("inset_designation_Hy")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(part);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		// System.out.println(val);

		// System.out.println(val);
		return val;

	}

	public List<Employee_Model> showTable_Employee() {
		ArrayList<Employee_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("INFO").withProcedureName("find_EMP_MST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Employee_Model(Integer.valueOf(jsonData.getString("EMP_ID")),
					jsonData.getString("EMP_CODE"), jsonData.getString("EMP_NAME"), jsonData.getString("DESIG_CODE"),
					jsonData.getString("SHORT_NAME"), Integer.valueOf(jsonData.getString("PARENT_EMP_ID")),
					jsonData.getString("EMAIL"), jsonData.getString("MBILE_NO")));
		}

		// System.out.println("this is dao" + showList);
		return showList;

	}

	// Designation
	public List<Designation> showTable_Designation() {
		ArrayList<Designation> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("INFO").withProcedureName("PRK_SF_DESIG_MST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Designation(jsonData.getString("DESIG_CODE"), jsonData.getString("DESIG_DESCR")));
		}

		// System.out.println("this is dao"+showList);
		return showList;

	}

	public int insert_Employee(Employee_Model insert_st) {

		// System.out.println(insert_st);

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("INFO").withProcedureName("insert_EMP_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_st.getEmployee_code(), insert_st.getEmployee_name(), insert_st.getShortname(),
						insert_st.getDesignation_code(), insert_st.getParent_Emp_id(), insert_st.getEmail(),
						insert_st.getMobile());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println(val);
		return val;

	}

	public Employee_Model edit_Employee(int id) {

		Employee_Model obj = new Employee_Model();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("INFO").withProcedureName("edit_Employee")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			obj = (new Employee_Model(Integer.valueOf(jsonData.getString("EMP_ID")), jsonData.getString("EMP_CODE"),
					jsonData.getString("EMP_NAME"), jsonData.getString("DESIG_CODE"), jsonData.getString("SHORT_NAME"),
					Integer.valueOf(jsonData.getString("PARENT_EMP_ID")), jsonData.getString("EMAIL"),
					jsonData.getString("MBILE_NO")));
		}

		// System.out.println(obj);
		// return val;

		return obj;
	}

	public int update_Employee(Employee_Model insert_st) {

		// System.out.println("this is updated"+update_st);

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("INFO").withProcedureName("update_Employee")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_st.getEmployee_id(), insert_st.getEmployee_code(), insert_st.getEmployee_name(),
						insert_st.getShortname(), insert_st.getDesignation_code(), insert_st.getParent_Emp_id(),
						insert_st.getEmail(), insert_st.getMobile());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println(val);
		return val;

//    for(int i=0;i<jsonArray.length();i++) {
//    	JSONObject jsonData=jsonArray.getJSONObject(i);
//    	showList.add(new
//    			DEPT(jsonData.getString ("ID"),jsonData.getString ("NAME")));
//    			}

//    return showList;
	}

//	// Registration Page

	public int showSfUserTable(UserRegister insert_ur) {
		System.out.println(insert_ur);

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("INFOR").withProcedureName("insert_SF_USER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_ur.getEmp_code(), insert_ur.getUser_id(), insert_ur.getEmp_pass());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);

		return val;
	}

//	// login Page

	public UserLogin checkUserLogin(UserLogin check_user) {
		System.out.println(check_user);

		UserLogin obj = new UserLogin();

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("INFOR").withProcedureName("user_login")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(check_user.getUser_id(), check_user.getEmp_pass());

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			obj = (new UserLogin(jsonData.getString("USERID"), jsonData.getString("EMP_PASS")));
		}

		return obj;

	}

	public ArrayList<Parent_emp> getEmpList(String n) {

		ArrayList<Parent_emp> EmpList = new ArrayList<Parent_emp>();

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("INFO").withProcedureName("Parent_Emp")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(n);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			EmpList.add(new Parent_emp(Integer.valueOf(jsonData.getString("EMP_ID")), jsonData.getString("EMP_NAME")));

		}

		return EmpList;
	}

//Division
	public List<Division_Model> showTable_Division() {
		ArrayList<Division_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("INFO").withProcedureName("SF_DIVISION")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Division_Model(jsonData.getString("DIV_CODE"), jsonData.getString("DIV_DESC")));
		}

		// System.out.println("this is dao"+showList);
		return showList;

	}

//DB_Point_Type

	public List<DbPointType_Model> showTable_Db_Point_Type(int dbPointId) {
		ArrayList<DbPointType_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("INFO").withProcedureName("SF_DB_POINT_TYPE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(dbPointId);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new DbPointType_Model(jsonData.getString("DB_POINT_TYPE_CODE"),
					jsonData.getString("DB_POINT_TYPE_DESCR")));
		}

		return showList;
	}

//Parent Db Point

	public List<ParentDbPoint_Model> showTable_ParentDbPoint() {
		ArrayList<ParentDbPoint_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("INFO").withProcedureName("ParentDbPoint")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ParentDbPoint_Model(Integer.valueOf(jsonData.getString("DB_POINT_ID")),
					jsonData.getString("DB_POINT_DESCR")));
		}

		// System.out.println("this is dao"+showList);
		return showList;

	}

//District

	public ArrayList<DISTRICT> getDistrict(String divcode) {

		ArrayList<DISTRICT> EmpList = new ArrayList<DISTRICT>();

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("INFO").withProcedureName("SF_DISTRICT")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(divcode);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			EmpList.add(new DISTRICT(jsonData.getString("DIST_CODE"), jsonData.getString("DIST_DESCR")));

		}

		return EmpList;
	}

//Thana

	public ArrayList<THANA> getThana(String discode) {

		ArrayList<THANA> EmpList = new ArrayList<THANA>();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("INFO").withProcedureName("SF_THANA")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(discode);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			EmpList.add(new THANA(jsonData.getString("THANA_CODE"), jsonData.getString("THANA_DESCR")));

		}

		return EmpList;
	}

//zip

	public ArrayList<ZIP> getZip(String discode) {

		ArrayList<ZIP> EmpList = new ArrayList<ZIP>();

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("INFO").withProcedureName("SF_ZIP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(discode);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			EmpList.add(new ZIP(jsonData.getString("ZIP_CODE"), jsonData.getString("AREA_DESCR")));

		}

		return EmpList;
	}

//add store
	public int insert_newStore(AddNewStore insert_st) {

		// System.out.println(insert_st);

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("INFO").withProcedureName("insert_NewStore")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_st.getDB_POINT_DESCR(), insert_st.getDB_POINT_TYPE_CODE(),
						insert_st.getPARENT_DB_POINT_ID(), insert_st.getDIV_CODE(), insert_st.getDIST_CODE(),
						insert_st.getTHANA_CODE(), insert_st.getZIP_CODE(), insert_st.getCONT_PERSION1(),
						insert_st.getMOBILE1(), insert_st.getADDR1(), insert_st.getCONT_PERSION2(),
						insert_st.getMOBILE2(), insert_st.getADDR2(), insert_st.getEmail(), insert_st.getWebadd(),
						insert_st.getTRADE_LIC_NO(), insert_st.getVAT_REG_NO()

				);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		// System.out.println("DAO_SHOP "+val);
		return val;

	}

//shop Show

	public List<Shop_show> Shop_show() {
		ArrayList<Shop_show> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("INFO").withProcedureName("shop_show")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Shop_show(Integer.valueOf(jsonData.getString("DB_POINT_ID")),
					jsonData.getString("DB_POINT_DESCR"), jsonData.getString("DIV_CODE"),
					jsonData.getString("DIV_DESC")));
		}

		// System.out.println("this is dao" + showList);
		return showList;

	}

//Edit Shop

	public AddNewStore edit_shop(int id) {

		AddNewStore obj = new AddNewStore();

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("INFO").withProcedureName("edit_shop")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			obj = (new AddNewStore(Integer.valueOf(jsonData.getString("DB_POINT_ID")),
					jsonData.getString("DB_POINT_DESCR"), jsonData.getString("DB_POINT_TYPE_CODE"),
					Integer.valueOf(jsonData.getString("PARENT_DB_POINT_ID")), jsonData.getString("DIV_CODE"),
					jsonData.getString("DIST_CODE"), jsonData.getString("THANA_CODE"), jsonData.getString("ZIP_CODE"),
					jsonData.getString("EMAIL"), jsonData.getString("WEB_ADDR"), jsonData.getString("CONT_PERSION1"),
					jsonData.getString("MOBILE1"), jsonData.getString("ADDR1"), jsonData.getString("CONT_PERSION2"),
					jsonData.getString("MOBILE2"), jsonData.getString("ADDR2"), jsonData.getString("TRADE_LIC_NO"),
					jsonData.getString("VAT_REG_NO")));
		}

		// System.out.println(obj);
		// return val;

		return obj;
	}

//update Shop

	public int update_newStore(AddNewStore insert_st) {

		System.out.println(insert_st);

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("INFO").withProcedureName("update_NewStore")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_st.getDB_POINT_ID(), insert_st.getDB_POINT_DESCR(), insert_st.getDB_POINT_TYPE_CODE(),
						insert_st.getPARENT_DB_POINT_ID(), insert_st.getDIV_CODE(), insert_st.getDIST_CODE(),
						insert_st.getTHANA_CODE(), insert_st.getZIP_CODE(), insert_st.getCONT_PERSION1(),
						insert_st.getMOBILE1(), insert_st.getADDR1(), insert_st.getCONT_PERSION2(),
						insert_st.getMOBILE2(), insert_st.getADDR2(), insert_st.getEmail(), insert_st.getWebadd(),
						insert_st.getTRADE_LIC_NO(), insert_st.getVAT_REG_NO()

				);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println("DAO_SHOP " + val);
		return val;

	}

//new added
// location View
	public List<Locationheirarchy> showTable_location() {
		ArrayList<Locationheirarchy> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall100.withCatalogName("LOCATION_INFO")
				.withProcedureName("show_LOCATION")
				.declareParameters(new SqlOutParameter("showLocaData", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("showLocaData").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Locationheirarchy(jsonData.getString("DB_POINT_TYPE_ID"),
					jsonData.getString("DB_POINT_TYPE_DESCR"), jsonData.getString("PARENT_LOC")));
		}

		System.out.println("this is dao" + showList);
		return showList;

	}

	// designation View
	public List<designationHierarchy> showTable_designation() {
		ArrayList<designationHierarchy> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall101.withCatalogName("DESIG_INFO")
				.withProcedureName("show_DESIGNATION")
				.declareParameters(new SqlOutParameter("showDesigData", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String showDes = json.get("showDesigData").toString();
		JSONArray jsonArray = new JSONArray(showDes);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new designationHierarchy(jsonData.getString("DESIG_ID"), jsonData.getString("DESIG_DESCR"),
					jsonData.getString("PARENT_LOC")));
		}

		System.out.println("this is dao" + showList);
		return showList;

	}

	// product View
	public List<ProductHierarchy> showTable_product() {
		ArrayList<ProductHierarchy> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall106.withCatalogName("PRODUCT_INFO")
				.withProcedureName("show_PRODUCT")
				.declareParameters(new SqlOutParameter("showProData", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String showDes = json.get("showProData").toString();
		JSONArray jsonArray = new JSONArray(showDes);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductHierarchy(jsonData.getString("CAT_ID"), jsonData.getString("CAT_DESCR"),
					jsonData.getString("PARENT_LOC")));
		}

		System.out.println("this is product" + showList);
		return showList;

	}

	// designation_edit

	public Designation edit_designation(int id) {

		Designation obj = new Designation();

		Map<String, Object> result = getAllStatesJdbcCall102.withCatalogName("DESIG_INFO")
				.withProcedureName("DESIG_SINGLE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			obj = (new Designation(jsonData.getString("DESIG_ID"), jsonData.getString("DESIG_DESCR")));
		}

		// System.out.println(obj);
		// return val;

		return obj;
	}

	// designation_update
	public int update_designation(Designation obj) {

		System.out.println("d:");
		System.out.println(obj);
		// System.out.println("this is updated"+update_st);

		Map<String, Object> result = getAllStatesJdbcCall103.withCatalogName("DESIG_INFO")
				.withProcedureName("update_DESIGNATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(obj.getDESIG_DESCR(), Integer.valueOf(obj.getDESIG_CODE()));

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println(val);
		return val;

	}

	// location_edit

	public Location edit_location(int id) {

		Location object = new Location();

		Map<String, Object> result = getAllStatesJdbcCall104.withCatalogName("LOCATION_INFO")
				.withProcedureName("edit_LOCATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EDITLOCADATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			object = (new Location(jsonData.getString("DB_POINT_TYPE_ID"), jsonData.getString("DB_POINT_TYPE_DESCR")));
		}

		// System.out.println(obj);
		// return val;

		return object;
	}

	// location_update
	public int update_location(Location object) {

		System.out.println("d:");
		System.out.println(object);
		// System.out.println("this is updated"+update_st);

		Map<String, Object> result = getAllStatesJdbcCall105.withCatalogName("LOCATION_INFO")
				.withProcedureName("update_LOCATION_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(object.getLocationDecs(), Integer.valueOf(object.getLocationId()));

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println(val);
		return val;

	}

	// product_edit

	public Product edit_product(int id) {

		Product object = new Product();

		Map<String, Object> result = getAllStatesJdbcCall107.withCatalogName("PRODUCT_INFO")
				.withProcedureName("edit_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EDITPRODATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			object = (new Product(jsonData.getString("CAT_ID"), jsonData.getString("CAT_DESCR")));
		}

		// System.out.println(obj);
		// return val;

		return object;
	}

	// product_update
	public int product_update(Product object) {

		System.out.println("d:");
		System.out.println(object);

		Map<String, Object> result = getAllStatesJdbcCall108.withCatalogName("PRODUCT_INFO")
				.withProcedureName("update_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(object.getProductDecs(), Integer.valueOf(object.getProductId()));

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		System.out.println(val);
		return val;

	}

	// Store Allocation for Null Parent
	public List<Shop_alloc_Model> showTable_shopAlloc_Parent_Null() {
		ArrayList<Shop_alloc_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("INFO")
				.withProcedureName("shopAlloc_Parent")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		// System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Shop_alloc_Model(jsonData.getString("DB_POINT_DESCR"),
					Integer.valueOf(jsonData.getString("DB_POINT_ID"))));
		}

		System.out.println("this is dao" + showList);
		return showList;

	}

	// Store Allocation for child

	public ArrayList<Shop_alloc_Model> showTable_shopAlloc_child(int id) {
		ArrayList<Shop_alloc_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("INFO").withProcedureName("shopAlloc_Child")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Shop_alloc_Model(jsonData.getString("DB_POINT_DESCR"),
					Integer.valueOf(jsonData.getString("DB_POINT_ID"))));
		}

		return showList;

	}

	// Store Allocation for shop

	public ArrayList<Shopalloc_shop_Model> showTable_shopAlloc_store(int id) {
		ArrayList<Shopalloc_shop_Model> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("INFO").withProcedureName("shopAlloc_store")
				.declareParameters(new SqlOutParameter("EMPDATA", OracleTypes.CURSOR)).execute(id);

		System.out.println(result);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < 10; i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Shopalloc_shop_Model(jsonData.getString("DB_POINT_DESCR"),
					Integer.valueOf(jsonData.getString("DB_POINT_ID"))));
		}

		System.out.println("this is dao" + showList);
		return showList;

	}

	// Store Allocation Employee

	public ArrayList<Store_emp> showTable_shopAlloc_emp() {
		ArrayList<Store_emp> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("INFO").withProcedureName("shopAlloc_EMP")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Store_emp(jsonData.getString("EMP_NAME"), Integer.valueOf(jsonData.getString("EMP_ID"))));
		}

		return showList;

	}

//	bill cycle dropdown starts
	public ArrayList<Add_store_alloc> getBillCycleList(int id) {

		ArrayList<Add_store_alloc> billCycleList = new ArrayList<Add_store_alloc>();

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("INFO").withProcedureName("shopAlloc_store")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR)).execute(7);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			billCycleList.add(new Add_store_alloc(jsonData.getString("DB_POINT_DESCR"),
					Integer.valueOf(jsonData.getString("DB_POINT_ID"))));

		}

		return billCycleList;

	}

//	bill cycle dropdown ends

	// Emp_shop_map insert

	public int insert_Emp_shop_map(int id1, int id2) {

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("INFO")
				.withProcedureName("insert_store_emp_map")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id1, id2);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);

		return val;
	}

	// Shop_alloc Description

	public ArrayList<Shop_alloc_description> showTable_shopAlloc_desc() {
		ArrayList<Shop_alloc_description> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("INFO")
				.withProcedureName("shopAlloc_Description")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Shop_alloc_description(Integer.valueOf(jsonData.getString("EMP_ID")),
					jsonData.getString("EMP_NAME"), Integer.valueOf(jsonData.getString("DB_POINT_ID")),
					jsonData.getString("DB_POINT_DESCR")));
		}
		return showList;

	}

	public ArrayList<Model_Van_Report> getReport_van(int dl_id, int db_point_id) {

		ArrayList<Model_Van_Report> billCycleList = new ArrayList<Model_Van_Report>();

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("INFO").withProcedureName("Report_for_van")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(dl_id, db_point_id);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			billCycleList.add(new Model_Van_Report(Integer.valueOf(jsonData.getString("DL_ID")),
					Integer.valueOf(jsonData.getString("ITEM_ID")), jsonData.getString("BRAND_NAME"),
					jsonData.getString("ITEM_NAME"), Integer.valueOf(jsonData.getString("QNTY"))));

		}

		return billCycleList;

	}

	public List<Van_Report_Location> ShowTable_Van_Report_Loc() {
		ArrayList<Van_Report_Location> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("INFO")
				.withProcedureName("Report_van_location")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();
		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new Van_Report_Location(Integer.valueOf(jsonData.getString("DB_POINT_ID")),
					jsonData.getString("DB_POINT_DESCR")));
		}
		return showList;

	}

//	level 1 table show starts

	public ArrayList<ProductMst> showTableLevel1() {
		ArrayList<ProductMst> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall109.withCatalogName("PRODUCT_INFO")
				.withProcedureName("SHOW_ITEM_CAT_MST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductMst(jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_CODE"),
					jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_ID"), jsonData.getString("ITEM_DESCR"),
					jsonData.getString("STATUS"),jsonData.getString("PARENT_ITEM_ID")));
		}
		return showList;

	}

//level 1 table show ends 
//level 2 table show starts

	public ArrayList<ProductMst> showTableLevel2(String id, String catCode) {
		ArrayList<ProductMst> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall110.withCatalogName("PRODUCT_INFO")
				.withProcedureName("SHOW_MAJORE_CAT")
				.declareParameters(new SqlOutParameter("SHOWMAJORE", OracleTypes.CURSOR)).execute(id, catCode);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("SHOWMAJORE").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductMst(jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_CODE"),
					jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_ID"), jsonData.getString("ITEM_DESCR"),
					jsonData.getString("STATUS"),jsonData.getString("PARENT_ITEM_ID")));
		}
		return showList;

	}

//level 2 table show ends 

//level2 data insert
 
	public int insert_lvl2(Level2_data insert_lvl2) {

		if (insert_lvl2.getSTATUS() == null) {
			insert_lvl2.setSTATUS("0");
		}

		Map<String, Object> result = getAllStatesJdbcCall111.withCatalogName("PRODUCT_INFO")
				.withProcedureName("INSERT_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_lvl2.getITEM_CODE(), insert_lvl2.getITEM_DESCR(), insert_lvl2.getSTATUS(),
						Integer.valueOf(insert_lvl2.getPARENT_ITEM_ID()), insert_lvl2.getCAT_CODE());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

//	level 3 table show starts

	public ArrayList<ProductMst> showTableLevel3(String id, String catCode) {
		ArrayList<ProductMst> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall112.withCatalogName("PRODUCT_INFO")
				.withProcedureName("SHOW_MINOR_CAT")
				.declareParameters(new SqlOutParameter("SHOWMINOR", OracleTypes.CURSOR)).execute(id, catCode);

		JSONObject json = new JSONObject(result);
		String s = json.get("SHOWMINOR").toString();
		JSONArray jsonArray = new JSONArray(s);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductMst(jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_CODE"),
					jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_ID"), jsonData.getString("ITEM_DESCR"),
					jsonData.getString("STATUS"),jsonData.getString("PARENT_ITEM_ID")));
		}
		return showList;

	}

//	level 3 table show ends 

//	level3 data insert

	public int insert_lvl3(Level3_data insert_lvl3) {

		if (insert_lvl3.getSTATUS() == null) {
			insert_lvl3.setSTATUS("0");
		}

		System.out.println(insert_lvl3);

		Map<String, Object> result = getAllStatesJdbcCall113.withCatalogName("PRODUCT_INFO")
				.withProcedureName("INSERT_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_lvl3.getITEM_CODE(), insert_lvl3.getITEM_DESCR(), insert_lvl3.getSTATUS(),
						Integer.valueOf(insert_lvl3.getPARENT_ITEM_ID()), insert_lvl3.getCAT_CODE());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);

		return val;
	}

//		level 4 table show starts

	public ArrayList<ProductMst> showTableLevel4(String id, String catCode) {
		ArrayList<ProductMst> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall114.withCatalogName("PRODUCT_INFO")
				.withProcedureName("MINOR_CAT")
				.declareParameters(new SqlOutParameter("MINORCAT", OracleTypes.CURSOR)).execute(id, catCode);
		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("MINORCAT").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductMst(jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_CODE"),
					jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_ID"), jsonData.getString("ITEM_DESCR"),
					jsonData.getString("STATUS"),jsonData.getString("PARENT_ITEM_ID")));
		}
		return showList;

	}


//		level 4 table show ends 

//		level4 data insert

	public int insert_lvl4(Level2_data insert_lvl2) {

		if (insert_lvl2.getSTATUS() == null) {
			insert_lvl2.setSTATUS("0");
		}

		System.out.println(insert_lvl2);

		Map<String, Object> result = getAllStatesJdbcCall115.withCatalogName("PRODUCT_INFO")
				.withProcedureName("INSERT_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_lvl2.getITEM_CODE(), insert_lvl2.getITEM_DESCR(), insert_lvl2.getSTATUS(),
						Integer.valueOf(insert_lvl2.getPARENT_ITEM_ID()), insert_lvl2.getCAT_CODE());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		System.out.println(val);

		return val;
	}
	
	
//	level 5 table show ends 

	public ArrayList<ProductMst> showTableLevel5(String id, String catCode) {
		ArrayList<ProductMst> showList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall117.withCatalogName("PRODUCT_INFO")
				.withProcedureName("SIZE_CAT")
				.declareParameters(new SqlOutParameter("SIZECAT", OracleTypes.CURSOR)).execute(id, catCode);

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("SIZECAT").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new ProductMst(jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_CODE"),
					jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_ID"), jsonData.getString("ITEM_DESCR"),
					jsonData.getString("STATUS"),jsonData.getString("PARENT_ITEM_ID")));
		}

		return showList;
	}
	
	
	public int insert_lvl1(Level2_data insert_lvl2) {

		if (insert_lvl2.getSTATUS() == null) {
			insert_lvl2.setSTATUS("0");
		}

		Map<String, Object> result = getAllStatesJdbcCall118.withCatalogName("PRODUCT_INFO")
				.withProcedureName("INSERT_PRODUCT_BRAND")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insert_lvl2.getITEM_CODE(), insert_lvl2.getITEM_DESCR(), insert_lvl2.getSTATUS(), insert_lvl2.getCAT_CODE());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}
	
	public ArrayList<Parents> callRoot() {
		ArrayList<Parents> rootList = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall119.withCatalogName("PRODUCT_INFO")
				.withProcedureName("ROOT_PKG_LIST")
				.declareParameters(new SqlOutParameter("ROOT_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String stringdata = json.get("ROOT_DATA").toString();
		JSONArray jsonArray = new JSONArray(stringdata);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			rootList.add(new Parents(jsonData.getString("LEVEL"), jsonData.getString("CAT_CODE"),
					jsonData.getString("CAT_DESCR"), jsonData.getString("CAT_ID"), jsonData.getString("PARENT_CAT_ID"),
					jsonData.getString("PD")));
		}

		return rootList;
	}
	
	

	public ArrayList<FindParent> findParents(String id) {
		ArrayList<FindParent> findParent = new ArrayList<>();
		Map<String, Object> result = getAllStatesJdbcCall120.withCatalogName("PRODUCT_INFO")
				.withProcedureName("PARENT_DESCR")
				.declareParameters(new SqlOutParameter("ROOT_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String stringdata = json.get("N_PARENT").toString();
		JSONArray jsonArray = new JSONArray(stringdata);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			findParent.add(new FindParent(jsonData.getString("ITEM_CODE"), jsonData.getString("ITEM_DESCR")));
		}

		return findParent;
	}
	
	public EditProduct editProduct(int id) {
		EditProduct editProduct = new EditProduct();

		Map<String, Object> result = getAllStatesJdbcCall121.withCatalogName("PRODUCT_INFO").withProcedureName("EDIT_PRODUCTS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		String string_json = json.get("PROEDIT").toString();
		JSONArray jsonArray = new JSONArray(string_json);
		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			editProduct = (new EditProduct(jsonData.getString("ITEM_CODE"),
					jsonData.getString("ITEM_DESCR"),jsonData.getString("STATUS")));
		}
		return editProduct;
	}
	
	public int updateProducts(EditProduct editProduct, int productId){
		
		Map<String, Object> result = getAllStatesJdbcCall122.withCatalogName("PRODUCT_INFO").withProcedureName("UPDATE_PRODUCTS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(editProduct.getProCode() ,editProduct.getProDescr(), editProduct.getStatus(), productId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}
	
	  public int deleteproduct(int itemId) {
			
			Map<String, Object> result = getAllStatesJdbcCall123.withCatalogName("PRODUCT_INFO").withProcedureName("DETELE_PRODUCT")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(itemId);
			
			JSONObject json = new JSONObject(result);
			int val = Integer.valueOf(json.get("OUTPUT").toString());

			return val;
		}
		
//Location Start
	  

		public ArrayList<National> showNation() {
			ArrayList<National> showList = new ArrayList<>();
			Map<String, Object> result = getAllStatesJdbcCall124.withCatalogName("DB_POINT_INFO")
					.withProcedureName("NATIONAL_DATA")
					.declareParameters(new SqlOutParameter("NDATAS", OracleTypes.CURSOR)).execute();

			JSONObject json = new JSONObject(result);
			String string_json = json.get("NDATAS").toString();
			JSONArray jsonArray = new JSONArray(string_json);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				showList.add(new National(jsonData.getString("DB_POINT_TYPE_CODE"), jsonData.getString("DB_POINT_CODE"),
						jsonData.getString("DB_POINT_ID"), jsonData.getString("DB_POINT_TYPE_DESCR"), jsonData.getString("DB_POINT_DESCR"),
						jsonData.getString("STATUS"),jsonData.getString("PARENT_DB_POINT_ID"),jsonData.getString("PARENT_DB_POINT_TYPE_ID")));
			}
			return showList;

		}
		
		
		public ArrayList<LocationMst> locationMst() {
			ArrayList<LocationMst> locMstList = new ArrayList<>();
			Map<String, Object> result = getAllStatesJdbcCall125.withCatalogName("DB_POINT_INFO")
					.withProcedureName("LOCATION_LEVEL")
					.declareParameters(new SqlOutParameter("LOC_LEVEL", OracleTypes.CURSOR)).execute();

			JSONObject json = new JSONObject(result);
			String stringdata = json.get("LOC_LEVEL").toString();
			JSONArray jsonArray = new JSONArray(stringdata);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				locMstList.add(new LocationMst(jsonData.getString("LEVEL"), jsonData.getString("DB_POINT_TYPE_DESCR"), jsonData.getString("DB_POINT_TYPE_CODE"),
						jsonData.getString("DB_POINT_TYPE_ID"), jsonData.getString("PARENT_DB_POINT_TYPE_ID"), jsonData.getString("PD")));
			}

			return locMstList;
		}
		
		public int insertPLocation(InsertParentLocation insertParentLocation) {

			if (insertParentLocation.getStatus() == null) {
				insertParentLocation.setStatus("0");
			}

			Map<String, Object> result = getAllStatesJdbcCall126.withCatalogName("DB_POINT_INFO")
					.withProcedureName("INSERT_ROOT_LOCATION")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(insertParentLocation.getDbPointTypeCode(), insertParentLocation.getDbPointDescr(), insertParentLocation.getStatus());  

			JSONObject json = new JSONObject(result);
			int val = Integer.valueOf(json.get("OUTPUT").toString());
			return val;
		}
		
		
		public ArrayList<National> showChildLocation(String dbPointTypeCode, int pathVariable) {
			ArrayList<National> showList = new ArrayList<>();
			Map<String, Object> result = getAllStatesJdbcCall127.withCatalogName("DB_POINT_INFO")
					.withProcedureName("LOCATION_CHILD")
					.declareParameters(new SqlOutParameter("CHILDLOCATION", OracleTypes.CURSOR)).execute(dbPointTypeCode, pathVariable);

			JSONObject json = new JSONObject(result);
			String string_json = json.get("CHILDLOCATION").toString();
			JSONArray jsonArray = new JSONArray(string_json);

			for (int i = 0; i < jsonArray.length(); i++) { 
				JSONObject jsonData = jsonArray.getJSONObject(i);
				showList.add(new National(jsonData.getString("DB_POINT_TYPE_CODE"), jsonData.getString("DB_POINT_CODE"),
						jsonData.getString("DB_POINT_ID"), jsonData.getString("DB_POINT_TYPE_DESCR"), jsonData.getString("DB_POINT_DESCR"),
						jsonData.getString("STATUS"),jsonData.getString("PARENT_DB_POINT_ID"),jsonData.getString("PARENT_DB_POINT_TYPE_ID")));
			}
			return showList;

		}
		
		
		public int insertCLocation(InsertChildLocation insertChildLocation) {

			if (insertChildLocation.getStatus() == null) {
				insertChildLocation.setStatus("0");
			}

			Map<String, Object> result = getAllStatesJdbcCall128.withCatalogName("DB_POINT_INFO")
					.withProcedureName("INSERT_LOCATION")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(insertChildLocation.getDbPointTypeCode(), insertChildLocation.getParentDbPointId(),insertChildLocation.getDbPointDescr(),insertChildLocation.getStatus());  

			JSONObject json = new JSONObject(result);
			int val = Integer.valueOf(json.get("OUTPUT").toString());
			return val;
		}
		
		public ArrayList<LocDescr> findLocationDescr(int id) {
			ArrayList<LocDescr> locDescr = new ArrayList<>();
			Map<String, Object> result = getAllStatesJdbcCall129.withCatalogName("DB_POINT_INFO")
					.withProcedureName("SHOW_DB_POINT")
					.declareParameters(new SqlOutParameter("DBPOINT", OracleTypes.CURSOR)).execute(id);

			JSONObject json = new JSONObject(result);
			String stringdata = json.get("DBPOINT").toString();
			JSONArray jsonArray = new JSONArray(stringdata);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				locDescr.add(new LocDescr(jsonData.getString("DB_POINT_DESCR")));
			}
			
			return locDescr;
		}
		
		public EditLocations editLocation(int id) {
			EditLocations editLocations = new EditLocations();

			Map<String, Object> result = getAllStatesJdbcCall130.withCatalogName("DB_POINT_INFO").withProcedureName("EDIT_LOCATIONS")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

			JSONObject json = new JSONObject(result);
			String string_json = json.get("LOCEDIT").toString();
			JSONArray jsonArray = new JSONArray(string_json);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				editLocations = (new EditLocations(jsonData.getString("DB_POINT_DESCR"),jsonData.getString("STATUS")));
			}
			return editLocations;
		}
		
		
		
		public int updateLocation(EditLocations editLocations, int id) {

			if (editLocations.getStatus() == null) {
				editLocations.setStatus("0");
			}

			Map<String, Object> result = getAllStatesJdbcCall131.withCatalogName("DB_POINT_INFO")
					.withProcedureName("UPDATE_LOCATIONS")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(editLocations.getLocationDesc(), editLocations.getStatus(),id);  

			JSONObject json = new JSONObject(result);
			int val = Integer.valueOf(json.get("OUTPUT").toString());
			return val;
		}
		
		  public int deleteLocation(int locationId) {
				
				Map<String, Object> result = getAllStatesJdbcCall132.withCatalogName("DB_POINT_INFO").withProcedureName("DETELE_LOCATION")
						.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
						.execute(locationId);
				
				JSONObject json = new JSONObject(result);
				int val = Integer.valueOf(json.get("OUTPUT").toString());

				return val;
			}
		  
		  
		  public ArrayList<Outlet> showOutlet(int pathVariable) {
				ArrayList<Outlet> showList = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall133.withCatalogName("DB_POINT_INFO")
						.withProcedureName("OUTLET_DETAILS")
						.declareParameters(new SqlOutParameter("OUTLETS", OracleTypes.CURSOR)).execute(pathVariable);

				JSONObject json = new JSONObject(result);
				String string_json = json.get("OUTLETS").toString();
				JSONArray jsonArray = new JSONArray(string_json);

				for (int i = 0; i < jsonArray.length(); i++) { 
					JSONObject jsonData = jsonArray.getJSONObject(i);
					showList.add(new Outlet(jsonData.getString("DB_POINT_ID"), jsonData.getString("DB_POINT_DESCR"),
							jsonData.getString("ADDR1"),jsonData.getString("ADDR2")));
				}
				return showList;
			}
		  
		  
		  public ArrayList<DesignationMaster> designationMst() {
				ArrayList<DesignationMaster> designationMaster = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall134.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("DESIGNATION_LEVEL")
						.declareParameters(new SqlOutParameter("DESIG_LEVEL", OracleTypes.CURSOR)).execute();

				JSONObject json = new JSONObject(result);
				String stringdata = json.get("DESIG_LEVEL").toString();
				JSONArray jsonArray = new JSONArray(stringdata);

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					designationMaster.add(new DesignationMaster(jsonData.getString("LEVEL"), jsonData.getString("DESIG_DESCR"), jsonData.getString("DESIG_CODE"),
							jsonData.getString("DESIG_ID"), jsonData.getString("PARENT_DESIG_ID"), jsonData.getString("PD")));
				}

				return designationMaster;
			}
		  
		  
		  
		  public ArrayList<EmployeeShow> employee_show() {
				ArrayList<EmployeeShow> employeeShow = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall135.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("DESIG_DATA")
						.declareParameters(new SqlOutParameter("DESIGNATION", OracleTypes.CURSOR)).execute();

				JSONObject json = new JSONObject(result);
				String stringdata = json.get("DESIGNATION").toString();
				JSONArray jsonArray = new JSONArray(stringdata);

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					employeeShow.add(new EmployeeShow(jsonData.getString("EMP_ID"), jsonData.getString("EMP_NAME"), jsonData.getString("MBILE_NO"),
							jsonData.getString("EMAIL"), jsonData.getString("DESIG_DESCR")));
				}

				return employeeShow;
			}
		  
		  
		  
		  public int insertEmployee(InsertDesignation insertDesignation) {
			  
			  System.out.println(insertDesignation);

				if (insertDesignation.getStatus() == null) {
					insertDesignation.setStatus("0");
				}

				Map<String, Object> result = getAllStatesJdbcCall136.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("INSERT_DES")
						.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
						.execute(insertDesignation.getEmpName(),insertDesignation.getDesigCode(),insertDesignation.getStatus(), 
								insertDesignation.getShortName(),Integer.valueOf(insertDesignation.getParentEmpId()), insertDesignation.getPhoneNumber(), 
								insertDesignation.getEmail());  

				JSONObject json = new JSONObject(result);
				int val = Integer.valueOf(json.get("OUTPUT").toString());
				return val;
			}
		  
		  
		  public ArrayList<EmployeeShow> child_employee_show(int parentEmpId, String catCode) {
				ArrayList<EmployeeShow> employeeShow = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall137.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("DESIG_CHILD")
						.declareParameters(new SqlOutParameter("CHILDDESIG", OracleTypes.CURSOR)).execute(parentEmpId, catCode);

				JSONObject json = new JSONObject(result);
				String stringdata = json.get("CHILDDESIG").toString();
				JSONArray jsonArray = new JSONArray(stringdata);

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					employeeShow.add(new EmployeeShow(jsonData.getString("EMP_ID"), jsonData.getString("EMP_NAME"), jsonData.getString("MBILE_NO"),
							jsonData.getString("EMAIL"), jsonData.getString("DESIG_DESCR")));
				}

				return employeeShow;
			}
		  
		  public ArrayList<DesigDescr> empName(int empId) {
				ArrayList<DesigDescr> desigDescr = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall138.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("NAME_EMP")
						.declareParameters(new SqlOutParameter("EMPNAME", OracleTypes.CURSOR)).execute(empId);

				JSONObject json = new JSONObject(result);
				String stringdata = json.get("EMPNAME").toString();
				JSONArray jsonArray = new JSONArray(stringdata);

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					desigDescr.add(new DesigDescr(jsonData.getString("EMP_NAME")));
				}

				return desigDescr;
			}
			
		  
		  public ArrayList<EditEmployee> empEdit(int empId) {
				ArrayList<EditEmployee> editEmployee = new ArrayList<>();
				Map<String, Object> result = getAllStatesJdbcCall139.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("EDIT_EMPLOYEE")
						.declareParameters(new SqlOutParameter("EMPEDIT", OracleTypes.CURSOR)).execute(empId);

				JSONObject json = new JSONObject(result);
				String stringdata = json.get("EMPEDIT").toString();
				JSONArray jsonArray = new JSONArray(stringdata);

				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					editEmployee.add(new EditEmployee(jsonData.getString("EMP_NAME"),jsonData.getString("STATUS"),jsonData.getString("SHORT_NAME"),
							jsonData.getString("MBILE_NO"),jsonData.getString("EMAIL")));
				}

				return editEmployee;
			}
			
		  
			public int updateDesignation(EditEmployee editEmployee, int id) {

				if (editEmployee.getStatus() == null) {
					editEmployee.setStatus("0");
				}

				Map<String, Object> result = getAllStatesJdbcCall140.withCatalogName("DESIGNATION_INFO")
						.withProcedureName("UPDATE_DESIGNATIONS")
						.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
						.execute(editEmployee.getEmpName(), editEmployee.getStatus(), editEmployee.getShortName(), editEmployee.getMobileNo(), editEmployee.getEmail(),id );  

				JSONObject json = new JSONObject(result);
				int val = Integer.valueOf(json.get("OUTPUT").toString());
				return val;
			}
			
			
			public int deleteEmployee(int empId) {
				
				Map<String, Object> result = getAllStatesJdbcCall141.withCatalogName("DESIGNATION_INFO").withProcedureName("DETELE_EMPLOYEE")
						.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
						.execute(empId);
				
				JSONObject json = new JSONObject(result);
				int val = Integer.valueOf(json.get("OUTPUT").toString());

				return val;
			}
}
