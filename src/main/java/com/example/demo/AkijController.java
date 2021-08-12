package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import oracle.jdbc.internal.OracleTypes;

@Controller
public class AkijController {
	@Autowired
	private JdbcTemplate jdbcTemplete;
	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;
	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall6;
	@Autowired
	Sforce_dao t;
	public int parentid;
	public String typcode;
	public int code = 1101;
	public static int D_code = 1001;

	public static String n = "test";

	ArrayList<String> path = new ArrayList<String>();
	ArrayList<String> breadcrumbs = new ArrayList<String>();
	ArrayList<String> locationpath = new ArrayList<String>();
	ArrayList<String> locbreadcrumbs = new ArrayList<String>();
	ArrayList<String> x_to_y = new ArrayList<String>();
	ArrayList<String> desig_breadcumbs = new ArrayList<String>();
	ArrayList<String> employee_name = new ArrayList<String>();



	public AkijController(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
	}

	@GetMapping("/SignUp")
	public String add_user(Model model) {
		UserRegister insert_user = new UserRegister();
		model.addAttribute("insert_user", insert_user);

		return "SignUp";

	}

	@PostMapping("/SignUp")
	public String inset_table(Model model, UserRegister insert_ur) {
		// System.out.println(insert_ur);

		int result = t.showSfUserTable(insert_ur);
		// System.out.println("hey folks "+insert_ur);

//		if (result == 0)
//			return "register";
//		else
		return "redirect:/login";

	}

	@GetMapping("/login")
	public String user_login(Model model) {
		UserLogin login_user = new UserLogin();
		model.addAttribute("login_user", login_user);

		return "login";

	}

	@PostMapping("/login")
	public String emp_login(Model model, UserLogin check_user) {
		// System.out.println("input" + check_user);

		UserLogin result = t.checkUserLogin(check_user);
		// System.out.println("hey folks "+insert_ur);
		// System.out.println("result 0"+ result.user_id);
		if (result.getUser_id() != null && result.getEmp_pass() != null) {
			// System.out.println("Found");
			// System.out.println("Output" + result);
			// System.out.println(user.getP_User_Id());
			return "Admin";
		} else {
			// System.out.println("not found");
			return "redirect:/login";
		}

	}

	@GetMapping("/Products")
	public String product(Model model) {
		model.addAttribute("message", "Momen");
		return "Products";
	}

	@GetMapping("/Location")
	public String Location(Model Location) {

		n = "ok";

		// System.out.println(n);

		return "Location";
	}

//	@RequestMapping("/Employee.html")
//	public String Employee(Model Employee) {
//		return "Employee";
//	}
	@GetMapping("/Admin")
	public String get_hello(Model model) {
		model.addAttribute("message", "Momen");
		return "Admin";
	}

	@RequestMapping("/addNewEmployee.html")
	public String addNewEmployee(Model addNewEmployee) {
		return "addNewEmployee";
	}

	@RequestMapping("/DesignationView.html")
	public String DesignationView(Model DesignationView) {
		return "DesignationView";
	}

	@RequestMapping("/forgotPassword.html")
	public String forgotPassword(Model forgotPassword) {
		return "forgotPassword";
	}

	@RequestMapping("/login.html")
	public String login(Model login) {
		return "login";
	}

	@RequestMapping("/productHierarchy.html")
	public String productHierarchy(Model productHierarchy) {
		return "productHierarchy";
	}

	@RequestMapping("/designationHierarchy")
	public String designationHierarchy(Model designationHierarchy) {
		return "designationHierarchy";
	}

	@RequestMapping("/locationHierarchy1")
	public String locationHierarchy(Model locationHierarchy) {

		return "locationHierarchy1";
	}

	// location SHOW
	@GetMapping("/locationHierarchy1")
	public String show_location(Model model) {

		ArrayList<Locationheirarchy> showList = (ArrayList<Locationheirarchy>) t.showTable_location();

		System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "locationHierarchy1";
	}

	// location_insert & fetch_parent
	@GetMapping("/location_2/{id}")
	@ResponseBody
	public int get_Loc(@PathVariable("id") String id) {

		System.out.println(id);
		String string = id;
		String[] parts = string.split(",");

		int val = 0;
		int val1 = 0;
		int x;

		// System.out.println(parts.length);

		Map<String, Object> result1 = getAllStatesJdbcCall.withCatalogName("LOCATION_INFO")
				.withProcedureName("SF_LOCATION").declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute();
		System.out.println(result1);

		JSONObject json = new JSONObject(result1);
		String fjfhdj = json.get("LOCADATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			jsonData.getString("MAX(DB_POINT_TYPE_ID)");

			val1 = Integer.valueOf(jsonData.getString("MAX(DB_POINT_TYPE_ID)"));

		}

		System.out.println(val1);

		System.out.println("length:" + parts.length);

		for (int i = 0; i < parts.length; i++) {

			System.out.println(parts[i]);
			x = val1; // max
			System.out.println("print x:" + x);

			val1 = val1 + 1; // parent

			System.out.println("ans" + val1);
			Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("INFO")
					.withProcedureName("insert_Location_Hy")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(parts[i], val1, x);

//			int z = i;
//			
//			System.out.println(z);

		}

		return val;

	}

	// location_popup_view
	@GetMapping("/locationHierarchy1/{id}")
	public String show_location1(Model model) {

		ArrayList<Locationheirarchy> showList = (ArrayList<Locationheirarchy>) t.showTable_location();

//				System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "locationEdit";
	}

	// location_edit

	@GetMapping("/locationHierarchyEdit/{id}")
	public String loc_edit(@PathVariable("id") int id, Model model) {

		model.addAttribute("id", id);
		System.out.println("this is id : " + id);

		Location object = t.edit_location(id);

		System.out.println("this is con" + object);
		model.addAttribute("object", object);
//			ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
//			model.addAttribute("showList_description", showList_description);
//						

		return "locationEdit";

	}

	// location_update
	@PostMapping("/locationHierarchyEdit/{id}")

	public String update_loc(@PathVariable("id") String id, Model model, Location object) {

		System.out.println(id);

		System.out.println("n");
		System.out.println(object);

		object.setLocationId(id);

		System.out.println("te");
		System.out.println(object);

		int result = t.update_location(object);
		System.out.println(result);
		if (result == 0)
			return "locationEdit";
		else
			return "redirect:/locationHierarchy1";
	}

	// DESIGNATION SHOW
	@GetMapping("/designationHierarchy")
	public String showTable_designation(Model model) {

		ArrayList<designationHierarchy> showList = (ArrayList<designationHierarchy>) t.showTable_designation();

		System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "designationHierarchy";
	}

	// designation_insert & fetch_parent

	@GetMapping("/designation_Hy/{id}")
	@ResponseBody
	public int get_designation_Hy(@PathVariable("id") String id) {
		// System.out.println(id);
		String string = id;
		String[] designationHy_parts = string.split(",");

		int val3 = 0;
		int val2 = 0;
		int y;

		System.out.println(designationHy_parts);

		Map<String, Object> result2 = getAllStatesJdbcCall2.withCatalogName("DESIG_INFO")
				.withProcedureName("SF_DESIGNATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute();
		System.out.println(result2);

		JSONObject json = new JSONObject(result2);

		System.out.println(json);
		String fjfhdj = json.get("DESIGDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			jsonData.getString("MAX(DESIG_ID)");

			val2 = Integer.valueOf(jsonData.getString("MAX(DESIG_ID)"));

		}

		System.out.println(val2);

		System.out.println("length:" + designationHy_parts.length);

//		String part1 = designationHy_parts[0]; // 004
//		String part2 = designationHy_parts[1];

		for (int i = 0; i < designationHy_parts.length; i++) {

			System.out.println("this is desinayion" + designationHy_parts[i]);

			y = val2; // max
			System.out.println("print Y:" + y);

			val2 = val2 + 1; // parent

			System.out.println("ans" + val2);
			Map<String, Object> result3 = getAllStatesJdbcCall3.withCatalogName("INFO")
					.withProcedureName("inset_designation_Hy")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(designationHy_parts[i], val2, y);

//			// D_code+=1;
//			int result4 = t.inset_designation_Hy(designationHy_parts[i]);
//			System.out.println(result4);

		}

		return val3;

	}

	// designation_popup_view
	@GetMapping("/designationHierarchy/{id}")
	public String show_designation(Model model) {

		ArrayList<designationHierarchy> showList = (ArrayList<designationHierarchy>) t.showTable_designation();

//		System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "designationEdit";
	}

	// designation_edit

	@GetMapping("/designationHierarchyEdit/{id}")
	public String desig_edit(@PathVariable("id") int id, Model model) {

		model.addAttribute("id", id);
		System.out.println("this is id : " + id);

		Designation obj = t.edit_designation(id);

		System.out.println("this is con" + obj);
//			
		model.addAttribute("insert_desig", obj);
		ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
		model.addAttribute("showList_description", showList_description);
//				

		return "designationEdit";

	}

	// designation_update
	@PostMapping("/designationHierarchyEdit/{id}")

	public String update_desig(@PathVariable("id") String id, Model model, Designation obj) {

		System.out.println(id);

		System.out.println("n");
		System.out.println(obj);

		obj.setDESIG_CODE(id);

		System.out.println("te");
		System.out.println(obj);

		int result = t.update_designation(obj);
		System.out.println(result);
		if (result == 0)
			return "designationEdit";
		else
			return "redirect:/designationHierarchy";
	}

	// Product SHOW
	@GetMapping("/productHierarchy")
	public String showTable_product(Model model) {

		ArrayList<ProductHierarchy> showList = (ArrayList<ProductHierarchy>) t.showTable_product();

		System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "productHierarchy";
	}

	// product_insert & fetch_parent

	@GetMapping("/product_Hy/{id}")
	@ResponseBody
	public int get_product_Hy(@PathVariable("id") String id) {
		// System.out.println(id);
		String string = id;
		String[] productHy_parts = string.split(",");

		int val3 = 0;
		int val2 = 0;
		int y;

		System.out.println(productHy_parts);

		Map<String, Object> result2 = getAllStatesJdbcCall3.withCatalogName("PRODUCT_INFO")
				.withProcedureName("MxVal_PRODUCT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute();
		System.out.println(result2);

		JSONObject json = new JSONObject(result2);

		System.out.println(json);
		String fjfhdj = json.get("PRODUCTDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			jsonData.getString("MAX(CAT_ID)");

			val2 = Integer.valueOf(jsonData.getString("MAX(CAT_ID)"));

		}

		System.out.println(val2);

		System.out.println("length:" + productHy_parts.length);

//				String part1 = designationHy_parts[0]; // 004
//				String part2 = designationHy_parts[1];

		for (int i = 0; i < productHy_parts.length; i++) {

			System.out.println("this is product" + productHy_parts[i]);

			y = val2; // max
			System.out.println("print Y:" + y);

			val2 = val2 + 1; // parent

			System.out.println("ans" + val2);
			Map<String, Object> result3 = getAllStatesJdbcCall4.withCatalogName("PRODUCT_INFO")
					.withProcedureName("inset_product_Hy")
					.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
					.execute(productHy_parts[i], val2, y);

//					// D_code+=1;
//					int result4 = t.inset_designation_Hy(designationHy_parts[i]);
//					System.out.println(result4);

		}

		return val3;

	}

	// product_popup_view
	@GetMapping("/productHierarchy/{id}")
	public String show_product(Model model) {

		ArrayList<ProductHierarchy> showList = (ArrayList<ProductHierarchy>) t.showTable_product();

//				System.out.println("this show data" + showList);
		model.addAttribute("showList", showList);

		return "productEdit";
	}

	// product_edit

	@GetMapping("/productHierarchyEdit/{id}")
	public String product_edit(@PathVariable("id") int id, Model model) {

		model.addAttribute("id", id);
		System.out.println("this is id : " + id);

		Product object = t.edit_product(id);

		System.out.println("this is con" + object);
		model.addAttribute("object", object);
//						ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
//						model.addAttribute("showList_description", showList_description);
//									

		return "productEdit";

	}

	// product_update
	@PostMapping("/productHierarchyEdit/{id}")

	public String update_product(@PathVariable("id") String id, Model model, Product object) {

		System.out.println(id);

		System.out.println("n");
		System.out.println(object);

		object.setProductId(id);

		System.out.println("te");
		System.out.println(object);

		int result = t.product_update(object);
		System.out.println(result);
		if (result == 0)
			return "productEdit";
		else
			return "redirect:/productHierarchy";
	}

	@GetMapping("/Employee_show")
	public String show_employee(Model model) {

		ArrayList<Employee_Model> showList = (ArrayList<Employee_Model>) t.showTable_Employee();
		// System.out.println("this show data"+showList);

		ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
		model.addAttribute("showList_description", showList_description);

		for (int i = 0; i < showList.size(); i++) {

			for (int j = 0; j < showList_description.size(); j++) {

				if (showList_description.get(j).getDESIG_CODE().equals(showList.get(i).getDesignation_code())) {

					showList.get(i).setDesignation_code(showList_description.get(j).getDESIG_DESCR());
				}
			}
		}
		model.addAttribute("showList", showList);
		return "Employee";
	}

	@GetMapping("/Add_Employee")
	public String add_employee(Model model) {
		int flag = 0;
		model.addAttribute("flag", flag);
		Employee_Model insert_st = new Employee_Model();
		model.addAttribute("insert_st", insert_st);

		ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
		model.addAttribute("showList_description", showList_description);

		return "addNewEmployee";

	}

	@PostMapping("/Add_Employee")
	public String insert_employee(Model model, Employee_Model insert_st) {
		System.out.println(insert_st);
//		Employee_Model insert_st=new Employee_Model();
//	model.addAttribute("insert_st",insert_st);

		ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
		model.addAttribute("showList_description", showList_description);
		int result = t.insert_Employee(insert_st);

		return "redirect:/Employee_show";

	}

	@GetMapping("/edit/{id}")
	public String edit_EMP(@PathVariable("id") int id, Model model) {

		model.addAttribute("id", id);
		// System.out.println("this is id : "+id);
		int flag = 1;
		model.addAttribute("flag", flag);

		Employee_Model insert_st1 = t.edit_Employee(id);

		// System.out.println("this is con"+insert_st1);
//		
		model.addAttribute("insert_st", insert_st1);
		ArrayList<Designation> showList_description = (ArrayList<Designation>) t.showTable_Designation();
		model.addAttribute("showList_description", showList_description);
//		ArrayList<Employee_Model> ParentEmpList = (ArrayList<Employee_Model>) t.showTable_Employee();
//		model.addAttribute("ParentEmpList", ParentEmpList);
		ArrayList<Parent_emp> ParentEmpList = new ArrayList<>();
		ParentEmpList = (ArrayList<Parent_emp>) t.getEmpList(insert_st1.getDesignation_code());
		model.addAttribute("ParentEmpList", ParentEmpList);

//			

		return "addNewEmployee";

	}

	@PostMapping("/edit/{id}")

	public String update_EMP(@PathVariable("id") int id, Model model, Employee_Model insert_st) {

		// System.out.println(id);

		// System.out.println("n");
		// System.out.println(insert_st);
		int result = t.update_Employee(insert_st);
		// System.out.println(result);
		if (result == 0)
			return "addNewEmployee";
		else
			return "redirect:/Employee_show";
	}

//	parent emp dropdown starts

	@GetMapping("/add_parent_emp/{id}")
	@ResponseBody
	public ArrayList<Parent_emp> getParentEmp(@PathVariable("id") String id) {

		ArrayList<Parent_emp> EmpList = new ArrayList<>();

		EmpList = t.getEmpList(id);

		return EmpList;

	}

	@GetMapping("/addNewStore")
	public String addNewStore(Model model) {
		int flag = 0;
		model.addAttribute("flag", flag);
//
		AddNewStore insert_store = new AddNewStore();
		model.addAttribute("insert_store", insert_store);

		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
		model.addAttribute("showList_division", showList_division);

		return "addNewStore";
	}

// Parent Db Point

	@GetMapping("/add_ParentDbPoint/{id}")
	@ResponseBody
	public ArrayList<ParentDbPoint_Model> getparentdbpoint(@PathVariable("id") String id) {

		ArrayList<ParentDbPoint_Model> EmpList = new ArrayList<>();
		EmpList = (ArrayList<ParentDbPoint_Model>) t.showTable_ParentDbPoint();
		System.out.println(EmpList);

		return EmpList;

	}

//	district
	@GetMapping("/add_district/{id}")
	@ResponseBody
	public ArrayList<DISTRICT> getdistrict(@PathVariable("id") String id) {

		ArrayList<DISTRICT> EmpList = new ArrayList<>();
		EmpList = t.getDistrict(id);
		// System.out.println(EmpList);

		return EmpList;

	}

//	thana  dropdown

	@GetMapping("/add_thana/{id}")
	@ResponseBody
	public ArrayList<THANA> getthana(@PathVariable("id") String id) {

		ArrayList<THANA> EmpList = new ArrayList<>();
		EmpList = t.getThana(id);
		// System.out.println(EmpList);

		return EmpList;

	}

	// Zip Dropdown

	@GetMapping("/add_Zip/{id}")
	@ResponseBody
	public ArrayList<ZIP> getZIP(@PathVariable("id") String id) {

		ArrayList<ZIP> EmpList = new ArrayList<>();
		EmpList = t.getZip(id);
		// System.out.println(EmpList);

		return EmpList;

	}

	// Add_new Store Post Mapping

	@PostMapping("/addNewStore")
	public String insert_newstore(Model model, AddNewStore insert_store) {
		System.out.println(insert_store);
//		Employee_Model insert_st=new Employee_Model();
//	model.addAttribute("insert_st",insert_st);
//		ArrayList<DbPointType_Model> showList_dbPointType = (ArrayList<DbPointType_Model>) t.showTable_Db_Point_Type();
//		model.addAttribute("showList_dbPointType", showList_dbPointType);
//		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
//		model.addAttribute("showList_division", showList_division);

		int result = t.insert_newStore(insert_store);

		return "redirect:/storedetails";

	}

	// Shop Show
	@GetMapping("/storedetails")
	public String Storedetails(Model model) {

		ArrayList<Shop_show> showList_shop = (ArrayList<Shop_show>) t.Shop_show();
		model.addAttribute("showList_shop", showList_shop);
		return "Storedetails";
	}

	// Show Shop Description

	@GetMapping("/addNewStore/view/{id}")
	public String show_shop_des(@PathVariable("id") int id, Model model) {

		model.addAttribute("id", id);
		// System.out.println("this is id : "+id);
		int check = 2;
		model.addAttribute("check", check);

		AddNewStore insert_store = t.edit_shop(id);

		// System.out.println("this is con"+insert_st1);
//		
		model.addAttribute("insert_store", insert_store);
		ArrayList<DbPointType_Model> showList_dbPointType = (ArrayList<DbPointType_Model>) t.showTable_Db_Point_Type(2);
		model.addAttribute("showList_dbPointType", showList_dbPointType);
		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
		model.addAttribute("showList_division", showList_division);

		ArrayList<ParentDbPoint_Model> ParentDbPointlist = new ArrayList<>();
//		ParentDbPointlist = (ArrayList<ParentDbPoint_Model>) t
//				.showTable_ParentDbPoint(insert_store.getDB_POINT_TYPE_CODE());
		model.addAttribute("ParentDbPointlist", ParentDbPointlist);

		ArrayList<DISTRICT> showList_district = new ArrayList<>();
		showList_district = t.getDistrict(insert_store.getDIV_CODE());
		model.addAttribute("showList_district", showList_district);

		ArrayList<THANA> ThanaList = new ArrayList<>();
		ThanaList = t.getThana(insert_store.getDIST_CODE());
		model.addAttribute("ThanaList", ThanaList);

		ArrayList<ZIP> ZipList = new ArrayList<>();
		ZipList = t.getZip(insert_store.getDIST_CODE());
		model.addAttribute("ZipList", ZipList);

		// System.out.println(showList_district);

//			

		return "addNewStore";

	}

	// Edit Shop Show
	// "/addNewStore/edit/{id}"

	// Store Empolyee Allocation
	@GetMapping("/storeAllocation")
	public String get_storeAllocation(Model model) {

//		Shop_alloc_Model insert_emp_store = new Shop_alloc_Model();
		Shopalloc_post insert_emp_store = new Shopalloc_post();
		model.addAttribute("insert_emp_store", insert_emp_store);
		// Db Point Type
		ArrayList<Shop_alloc_Model> showList_store_no_parent = (ArrayList<Shop_alloc_Model>) t
				.showTable_shopAlloc_Parent_Null();
		model.addAttribute("showList_store_no_parent", showList_store_no_parent);

		return "storeAllocation";
	}

	@PostMapping("/storeAllocation")
	public String set_storeAllocation(Model model, Shopalloc_post insert_emp_store) {

		int check = 0;
		model.addAttribute("check", check);

		System.out.println("this is postmapping");
		System.out.println(insert_emp_store.getM_id());
//		ArrayList<Add_store_alloc> showList=t.getBillCycleList(insert_emp_store.getM_id());

		ArrayList<Add_store_alloc> billCycleList = new ArrayList<Add_store_alloc>();
		ArrayList<Store_emp> showList_emp = new ArrayList<>();

		showList_emp = t.showTable_shopAlloc_emp();
		model.addAttribute("showList_emp", showList_emp);
		System.out.println(showList_emp);

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("INFO").withProcedureName("shopAlloc_store")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(insert_emp_store.getM_id());

		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("EMPDATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			billCycleList.add(new Add_store_alloc(jsonData.getString("DB_POINT_DESCR"),
					Integer.valueOf(jsonData.getString("DB_POINT_ID"))));

		}

		// System.out.println("TEST");
		// System.out.println(billCycleList);

		model.addAttribute("billCycleList", billCycleList);

//		
//		model.addAttribute("showList", showList);
//		
//		Shop_alloc_Model insert_emp_store = new Shop_alloc_Model();
//		model.addAttribute("insert_emp_store", insert_emp_store);
//		//Db Point Type
//		ArrayList<Shop_alloc_Model> showList_store_no_parent = (ArrayList<Shop_alloc_Model>) t.showTable_shopAlloc_Parent_Null();
//		model.addAttribute("showList_store_no_parent", showList_store_no_parent);

		return "storeAllocation";
	}

	// Area

	@GetMapping("/area/{id}")
	@ResponseBody
	public ArrayList<Shop_alloc_Model> getArea(@PathVariable("id") int id) {

		ArrayList<Shop_alloc_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_child(id);
		System.out.println(AreaList);

		return AreaList;

	}

	// Territory Dropdown

	@GetMapping("/territory/{id}")
	@ResponseBody
	public ArrayList<Shop_alloc_Model> getTerritory(@PathVariable("id") int id) {

		ArrayList<Shop_alloc_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_child(id);
		System.out.println(AreaList);

		return AreaList;

	}

	// Dealer Dropdown
	@GetMapping("/dealer/{id}")
	@ResponseBody
	public ArrayList<Shop_alloc_Model> getDealer(@PathVariable("id") int id) {

		ArrayList<Shop_alloc_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_child(id);
		System.out.println(AreaList);

		return AreaList;

	}

	// Beat Dropdown

	@GetMapping("/beat/{id}")
	@ResponseBody
	public ArrayList<Shop_alloc_Model> getBeat(@PathVariable("id") int id) {

		ArrayList<Shop_alloc_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_child(id);
		System.out.println(AreaList);

		return AreaList;

	}

	// Market Dropdown

	@GetMapping("/market/{id}")
	@ResponseBody
	public ArrayList<Shop_alloc_Model> getMarket(@PathVariable("id") int id) {

		ArrayList<Shop_alloc_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_child(id);
		System.out.println(AreaList);

		return AreaList;

	}

	@GetMapping("/store/{id}")
	@ResponseBody
	public ArrayList<Shopalloc_shop_Model> getStore(@PathVariable("id") int id) {

		ArrayList<Shopalloc_shop_Model> AreaList = new ArrayList<>();
		AreaList = t.showTable_shopAlloc_store(id);
		System.out.println(AreaList);

		return AreaList;

	}

	@GetMapping("store_emp/{id}")
	public String set_insert_emp_store(@PathVariable("id") String id) {

		String string = id;
		String[] parts = string.split("_");
		String part1 = parts[0]; // 004
		String part2 = parts[1];
		String[] parts3 = part2.split(",");

		for (int i = 0; i < parts3.length; i++) {

			int result = t.insert_Emp_shop_map(Integer.valueOf(part1), Integer.valueOf(parts3[i]));

			System.out.println("this is result" + result);

		}

		return "redirect:/storedetails";
	}

	@GetMapping("/storeAllocationDetails")
	public String StoreAllocationDetails(Model model) {
		ArrayList<Shop_alloc_description> showList_shopalloc_det = (ArrayList<Shop_alloc_description>) t
				.showTable_shopAlloc_desc();
		model.addAttribute("showList_shopalloc_det", showList_shopalloc_det);

		return "storeAllocationDetails";
	}

	@GetMapping("/Report_van")
	public String report_van(Model model) {
		Van_Report_Location loc_insert_st = new Van_Report_Location();
		model.addAttribute("loc_insert_st", loc_insert_st);

		ArrayList<Van_Report_Location> Van_Report_loc = (ArrayList<Van_Report_Location>) t.ShowTable_Van_Report_Loc();
		model.addAttribute("showList_van_location", Van_Report_loc);

		return "Report_Van";
	}

	@PostMapping("/Report_van")
	public String report_van_show(Model model, Van_Report_Location report) {
		System.out.println(report);

		ArrayList<Model_Van_Report> showList_shopalloc_det = (ArrayList<Model_Van_Report>) t
				.getReport_van(report.getDB_POINT_ID(), 1);
		model.addAttribute("showList_shopalloc_det", showList_shopalloc_det);
		return "redirect:/Report_van";
	}

//	productNew
	@GetMapping("/level1")
	public String getLevel1(Model model) {
		path.clear();
		breadcrumbs.clear();

		ArrayList<ProductMst> showList = t.showTableLevel1();
		model.addAttribute("showList", showList);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);

		String categoty = rootList.get(0).getCatDescr();
		model.addAttribute("id", categoty);

		String root = rootList.get(0).getParentDescr();
		model.addAttribute("root", root);

		ProductMst productmst = new ProductMst();
		model.addAttribute("level1", productmst);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		String catCode = rootList.get(0).getCatCode();
		String nextLevel = rootList.get(1).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);

		return "productNew";
	}

	@PostMapping("/level1/")
	public String inset_lvl1_data(Model model, Level2_data insert_st) {
		int result = t.insert_lvl1(insert_st);
		return "redirect:/level1/";
	}

//	level2
	@GetMapping("/level2/{id}")
	public String get_level2(@PathVariable("id") String id, Model model) {
		path.add(0, id);
		model.addAttribute("path", path);

		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(id);
		model.addAttribute("parent", parent);
		breadcrumbs.add(0, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(1).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(1).getCatCode();
		String nextLevel = rootList.get(2).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(1).getParentDescr();
		model.addAttribute("root", root);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel2(id, catCode);
		model.addAttribute("showList", showList);

		ProductMst productmst = new ProductMst();
		model.addAttribute("level2", productmst);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_DESCR(categoty);
		insert_st.setCAT_CODE(catCode);
		insert_st.setPARENT_ITEM_ID(id);
		System.out.println(path.get(path.size() - 1));

		model.addAttribute("id", id);
		return "product1";
	}

	@PostMapping("/level2/{id}")
	public String inset_lvl2_data(Model model, Level2_data insert_st) {
		int result = t.insert_lvl2(insert_st);
		return "redirect:/level2/{id}";

	}

//level3
	@GetMapping("/level3/{id}")
	public String get_level3(@PathVariable("id") String id, Model model) {
		path.add(1, id);
		model.addAttribute("path", path);
		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(id);
		model.addAttribute("parent", parent);
		breadcrumbs.add(1, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(2).getCatDescr();
		model.addAttribute("categoty", categoty);

		String catCode = rootList.get(2).getCatCode();

		String nextLevel = rootList.get(3).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(2).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(1).getParentDescr();
		model.addAttribute("brand", brand);
		path.add(id);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel3(id, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level3", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(id);
		System.out.println(path.get(path.size() - 1));

		model.addAttribute("id", id);
		return "product2";
	}

//			Level3 Data insert

	@PostMapping("/level3/{id}")
	public String inset_lvl3_data(Model model, Level3_data insert_lvl3) {
		int result = t.insert_lvl3(insert_lvl3);
		return "redirect:/level3/{id}";

	}

//level4
	@GetMapping("/level4/{id}")
	public String get_level4(@PathVariable("id") String id, Model model) {
		path.add(2, id);
		model.addAttribute("path", path);
		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(id);
		model.addAttribute("parent", parent);
		breadcrumbs.add(2, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(3).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(3).getCatCode();

		String nextLevel = rootList.get(4).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(3).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(2).getParentDescr();
		model.addAttribute("brand", brand);
		String first = rootList.get(1).getParentDescr();
		model.addAttribute("first", first);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel4(id, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level4", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(id);
		System.out.println(path.get(path.size() - 1));

		model.addAttribute("id", id);
		return "product3";
	}

//Level4 Data insert

	@PostMapping("/level4/{id}")
	public String inset_lvl4_data(Model model, Level2_data insert_lvl2) {

		int result = t.insert_lvl4(insert_lvl2);
		return "redirect:/level4/{id}";

	}

	@GetMapping("/level5/{id}")
	public String get_level5(@PathVariable("id") String id, Model model) {
		path.add(3, id);
		model.addAttribute("path", path);

		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(id);
		model.addAttribute("parent", parent);
		breadcrumbs.add(3, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(4).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(4).getCatCode();

		String nextLevel = rootList.get(4).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(4).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(3).getParentDescr();
		model.addAttribute("brand", brand);
		String first = rootList.get(2).getParentDescr();
		model.addAttribute("first", first);
		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel5(id, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level5", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(id);

		model.addAttribute("id", id);
		return "product4";
	}

	@PostMapping("/level5/{id}")
	public String inset_lvl5_data(Model model, Level2_data insert_lvl2) {

		int result = t.insert_lvl4(insert_lvl2);
		return "redirect:/level5/{id}";
	}

	@GetMapping("/productEdit/{id}")
	public String edit_location(@PathVariable("id") int id, Model model) {

		ArrayList<ProductMst> showList = t.showTableLevel1();
		model.addAttribute("showList", showList);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);

		String categoty = rootList.get(0).getCatDescr();
		model.addAttribute("id", categoty);

		String root = rootList.get(0).getParentDescr();
		model.addAttribute("root", root);

		ProductMst productmst = new ProductMst();
		model.addAttribute("level1", productmst);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		String catCode = rootList.get(0).getCatCode();
		String nextLevel = rootList.get(1).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);

		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		EditProduct edit_product = t.editProduct(id);
		model.addAttribute("edit_product", edit_product);

		return "brandedit";
	}

	@PostMapping("/productEdit/{id}")
	public String update_products(@PathVariable("id") int id, Model model, EditProduct editproduct) {
		int result = t.updateProducts(editproduct, id);
		if (result == 0)
			return "/level1";
		else
			return "redirect:/level1";
	}

	@GetMapping("/majoreCatEdit/{id}")
	public String edit_location1(@PathVariable("id") int id, Model model) {
		String paths = path.get(0);

		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(paths);
		model.addAttribute("parent", parent);
		breadcrumbs.add(0, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(1).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(1).getCatCode();
		String nextLevel = rootList.get(2).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(1).getParentDescr();
		model.addAttribute("root", root);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel2(paths, catCode);
		model.addAttribute("showList", showList);

		ProductMst productmst = new ProductMst();
		model.addAttribute("level2", productmst);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_DESCR(categoty);
		insert_st.setCAT_CODE(catCode);
		insert_st.setPARENT_ITEM_ID(paths);

		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		EditProduct edit_product = t.editProduct(id);
		model.addAttribute("edit_product", edit_product);

		return "majorecatedit";
	}

	@PostMapping("/majoreCatEdit/{id}")
	public String update_products1(@PathVariable("id") int id, Model model, EditProduct editproduct) {
		int result = t.updateProducts(editproduct, id);
		String rout = path.get(path.size() - 1);
		if (result == 0)
			return "/level2/" + rout;
		else
			return "redirect:/level2/" + rout;
	}

	@GetMapping("/majoreCatDelete/{id}")
	public String delete_majoreCat(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		int result = t.deleteproduct(id);

		String rout = path.get(path.size() - 1);
		if (result == 0)
			return "/level2/" + rout;
		else
			return "redirect:/level2/" + rout;
	}

	@GetMapping("/majoreSubCatEdit/{id}")
	public String edit_location2(@PathVariable("id") int id, Model model) {
		String paths = path.get(1);
		model.addAttribute("path", path);

		
		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(paths);
		model.addAttribute("parent", parent);
		breadcrumbs.add(1, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(2).getCatDescr();
		model.addAttribute("categoty", categoty);

		String catCode = rootList.get(2).getCatCode();

		String nextLevel = rootList.get(3).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(2).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(1).getParentDescr();
		model.addAttribute("brand", brand);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel3(paths, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level3", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(paths);
		System.out.println(path.get(path.size() - 1));

		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		EditProduct edit_product = t.editProduct(id);
		model.addAttribute("edit_product", edit_product);

		return "majorsubcatedit";
	}

	@PostMapping("/majoreSubCatEdit/{id}")
	public String update_products2(@PathVariable("id") int id, Model model, EditProduct editproduct) {
		int result = t.updateProducts(editproduct, id);
		String rout = path.get(path.size() - 1);

		if (result == 0)
			return "/level3/" + rout;
		else
			return "redirect:/level3/" + rout;
	}

	@GetMapping("/majoreSubCatDelete/{id}")
	public String delete_majoreSubCat(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		int result = t.deleteproduct(id);

		String rout = path.get(path.size() - 1);
		if (result == 0)
			return "/level3/" + rout;
		else
			return "redirect:/level3/" + rout;
	}

	@GetMapping("/minorCatEdit/{id}")
	public String edit_location3(@PathVariable("id") int id, Model model) {
		String paths = path.get(2);
		model.addAttribute("path", path);

		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(paths);
		model.addAttribute("parent", parent);
		breadcrumbs.add(2, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(3).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(3).getCatCode();

		String nextLevel = rootList.get(4).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(3).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(2).getParentDescr();
		model.addAttribute("brand", brand);
		String first = rootList.get(1).getParentDescr();
		model.addAttribute("first", first);

		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel4(paths, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level4", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(paths);

		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		EditProduct edit_product = t.editProduct(id);
		model.addAttribute("edit_product", edit_product);

		return "minorcatedit";
	}

	@PostMapping("/minorCatEdit/{id}")
	public String update_products3(@PathVariable("id") int id, Model model, EditProduct editproduct) {
		int result = t.updateProducts(editproduct, id);
		String rout = path.get(2);

		if (result == 0)
			return "/level4/" + rout;
		else
			return "redirect:/level4/" + rout;
	}

	@GetMapping("/minorCatDelete/{id}")
	public String delete_minorCat(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		int result = t.deleteproduct(id);

		String rout = path.get(2);
		if (result == 0)
			return "/level4/" + rout;
		else
			return "redirect:/level4/" + rout;
	}

	@GetMapping("/sizeCatEdit/{id}")
	public String edit_location4(@PathVariable("id") int id, Model model) {
		String paths = path.get(3);
		model.addAttribute("path", path);


		ArrayList<FindParent> parent = (ArrayList<FindParent>) t.findParents(paths);
		model.addAttribute("parent", parent);
		breadcrumbs.add(3, parent.get(0).getParentName());
		model.addAttribute("breadcrumbs", breadcrumbs);
		System.out.println(breadcrumbs);

		ArrayList<Parents> rootList = t.callRoot();
		model.addAttribute("rootList", rootList);
		String categoty = rootList.get(4).getCatDescr();
		model.addAttribute("categoty", categoty);
		String catCode = rootList.get(4).getCatCode();

		String nextLevel = rootList.get(4).getCatDescr();
		model.addAttribute("nextLevel", nextLevel);
		String root = rootList.get(4).getParentDescr();
		model.addAttribute("root", root);
		String brand = rootList.get(3).getParentDescr();
		model.addAttribute("brand", brand);
		String first = rootList.get(2).getParentDescr();
		model.addAttribute("first", first);
		ArrayList<ProductMst> showList = (ArrayList<ProductMst>) t.showTableLevel5(paths, catCode);
		model.addAttribute("showList", showList);

		ProductMst obj = new ProductMst();
		model.addAttribute("level5", obj);

		Level2 insert_st = new Level2();
		model.addAttribute("insert_st", insert_st);

		insert_st.setCAT_CODE(catCode);
		insert_st.setCAT_DESCR(categoty);
		insert_st.setPARENT_ITEM_ID(paths);
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		EditProduct edit_product = t.editProduct(id);
		model.addAttribute("edit_product", edit_product);

		return "sizeedit";
	}

	@PostMapping("/sizeCatEdit/{id}")
	public String update_products4(@PathVariable("id") int id, Model model, EditProduct editproduct) {
		int result = t.updateProducts(editproduct, id);
		String rout = path.get(3);
		System.out.println(rout);
		if (result == 0)
			return "/level5/" + rout;
		else
			return "redirect:/level5/" + rout;
	}

	@GetMapping("/sizeCatDelete/{id}")
	public String delete_sizeCat(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		int result = t.deleteproduct(id);

		String rout = path.get(2);
		System.out.println("This is the size delete" + rout);
		if (result == 0)
			return "/level5/" + rout;
		else
			return "redirect:/level5/" + rout;
	}

	@GetMapping("/productDelete/{id}")
	public String delete_location(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteproduct(id);

		return "redirect:/level1";
	}

// Location start

	@GetMapping("/location1")
	public String getNational(Model model) {
		locationpath.clear();
		locbreadcrumbs.clear();
		x_to_y.clear();

		ArrayList<National> showNational = t.showNation();
		model.addAttribute("showNational", showNational);

		String dbPointTypeDescr = showNational.get(0).getDbPointTypeDescr();
		model.addAttribute("dbPointTypeDescr", dbPointTypeDescr);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String nextLevelparentDbPointId = showNational.get(0).getDbPointId();
		model.addAttribute("nextLevelparentDbPointId", nextLevelparentDbPointId);

		String root = locMstList.get(0).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(1).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		String dbPointTypeCode = locMstList.get(0).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		InsertParentLocation insertParentLocation = new InsertParentLocation();
		model.addAttribute("insertParentLocation", insertParentLocation);
		insertParentLocation.setDbPointTypeCode(dbPointTypeCode);

		return "location1";
	}

	@PostMapping("/location1/")
	public String insetParentLocation(Model model, InsertParentLocation insertParentLocation) {
		int checkinsert = t.insertPLocation(insertParentLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location1/";
	}

	@GetMapping("/location2/{id}")
	public String getChildOne(@PathVariable("id") String id, Model model) {
		locationpath.add(0, id);
		x_to_y.add(0, id);
		model.addAttribute("locationpath", locationpath);

		int pathVariable = Integer.parseInt(id);
		model.addAttribute("pathVariable", pathVariable);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(0, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(1).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(1).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(1).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(2).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location2";
	}

	@PostMapping("/location2/{id}")
	public String insetChildLocation(@PathVariable("id") int id, Model model, InsertChildLocation insertChildLocation) {
		int checkinsert = t.insertCLocation(insertChildLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location2/{id}";
	}

	@GetMapping("/location3/{id}")
	public String getChildTwo(@PathVariable("id") String id, Model model) {
		locationpath.add(1, id);
		x_to_y.add(1, id);
		model.addAttribute("locationpath", locationpath);

		int pathVariable = Integer.parseInt(id);
		model.addAttribute("pathVariable", pathVariable);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(1, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(2).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(2).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(2).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(3).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location3";
	}

	@PostMapping("/location3/{id}")
	public String insetChildLocationTow(@PathVariable("id") int id, Model model,
			InsertChildLocation insertChildLocation) {
		int checkinsert = t.insertCLocation(insertChildLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location3/{id}";
	}

	@GetMapping("/location4/{id}")
	public String getChildThree(@PathVariable("id") String id, Model model) {
		locationpath.add(2, id);
		x_to_y.add(2, id);

		model.addAttribute("locationpath", locationpath);

		int pathVariable = Integer.parseInt(id);
		model.addAttribute("pathVariable", pathVariable);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(2, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(3).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(3).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(3).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(4).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location4";
	}

	@PostMapping("/location4/{id}")
	public String insetChildLocationThree(@PathVariable("id") int id, Model model,
			InsertChildLocation insertChildLocation) {
		int checkinsert = t.insertCLocation(insertChildLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location4/{id}";
	}

	@GetMapping("/location5/{id}")
	public String getChildFour(@PathVariable("id") String id, Model model) {
		locationpath.add(3, id);
		x_to_y.add(3, id);

		model.addAttribute("locationpath", locationpath);

		int pathVariable = Integer.parseInt(id);
		model.addAttribute("pathVariable", pathVariable);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(3, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(4).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(4).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(4).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(5).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location5";
	}

	@PostMapping("/location5/{id}")
	public String insetChildLocationFour(@PathVariable("id") int id, Model model,
			InsertChildLocation insertChildLocation) {
		int checkinsert = t.insertCLocation(insertChildLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location5/{id}";
	}

	@GetMapping("/location6/{id}")
	public String getChildFive(@PathVariable("id") String id, Model model) {
		locationpath.add(4, id);
		x_to_y.add(4, id);

		model.addAttribute("locationpath", locationpath);
		int pathVariable = Integer.parseInt(id);
		model.addAttribute("pathVariable", pathVariable);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(4, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(5).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(5).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(5).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location6";
	}

	@PostMapping("/location6/{id}")
	public String insetChildLocationFive(@PathVariable("id") int id, Model model,
			InsertChildLocation insertChildLocation) {
		int checkinsert = t.insertCLocation(insertChildLocation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location6/{id}";
	}

	@GetMapping("/location7/{id}")
	public String getChildSix(@PathVariable("id") String id, Model model) {
		locationpath.add(5, id);
		x_to_y.add(5, id);

		int flag = 0;
		model.addAttribute("flag", flag);
		int flag1 = 1;
		model.addAttribute("flag1", flag1);
		int check = 2;
		model.addAttribute("check", check);

		AddNewStore insert_store = new AddNewStore();
		model.addAttribute("insert_store", insert_store);

		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
		model.addAttribute("showList_division", showList_division);

		model.addAttribute("locationpath", locationpath);
		int pathVariable = Integer.parseInt(id);

		model.addAttribute("pathVariable", pathVariable);
		parentid = pathVariable;
		ArrayList<ParentDbPoint_Model> ParentDbPointlist = new ArrayList<>();

		ParentDbPointlist = (ArrayList<ParentDbPoint_Model>) t.showTable_ParentDbPoint();
		model.addAttribute("ParentDbPointlist", ParentDbPointlist);
		ArrayList<DbPointType_Model> showList_dbPointType = (ArrayList<DbPointType_Model>) t
				.showTable_Db_Point_Type(pathVariable);

		insert_store.setPARENT_DB_POINT_ID(pathVariable);
		model.addAttribute("showList_dbPointType", showList_dbPointType);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(5, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(6).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("title", title);

		ArrayList<Outlet> showOutlet = t.showOutlet(pathVariable);
		model.addAttribute("showOutlet", showOutlet);

		insert_store.setDB_POINT_TYPE_CODE(locMstList.get(6).getDbPointTypeCode());
		typcode = locMstList.get(6).getDbPointTypeCode();

		String tt = title;
		model.addAttribute("tt", tt);

		String root = locMstList.get(6).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location7";
	}

	@PostMapping("/location7/{id}")
	public String insetChildLocationSix(@PathVariable("id") String id, Model model, AddNewStore insert_store) {
		insert_store.setDB_POINT_TYPE_CODE(typcode);
		insert_store.setPARENT_DB_POINT_ID(parentid);
		t.insert_newStore(insert_store);

		return "redirect:/location7/{id}";
	}

	@GetMapping("/location1edit/{id}")
	public String editNational(@PathVariable("id") int id, Model model) {
		ArrayList<National> showNational = t.showNation();
		model.addAttribute("showNational", showNational);

		EditLocations editLocations = t.editLocation(id);
		model.addAttribute("editLocations", editLocations);

		String dbPoint = editLocations.getLocationDesc();
		model.addAttribute("dbPoint", dbPoint);

		String dbPointTypeDescr = showNational.get(0).getDbPointTypeDescr();
		model.addAttribute("dbPointTypeDescr", dbPointTypeDescr);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String nextLevelparentDbPointId = showNational.get(0).getDbPointId();
		model.addAttribute("nextLevelparentDbPointId", nextLevelparentDbPointId);

		String root = locMstList.get(0).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(1).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		String dbPointTypeCode = locMstList.get(0).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		InsertParentLocation insertParentLocation = new InsertParentLocation();
		model.addAttribute("insertParentLocation", insertParentLocation);
		insertParentLocation.setDbPointTypeCode(dbPointTypeCode);

		return "location1edit";
	}

	@PostMapping("/location1edit/{id}")
	public String editParentLocation(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location1/";
	}

	@GetMapping("/location1Delete/{id}")
	public String delete_location1(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		int result = t.deleteLocation(id);
		if (result == 0)
			return "/location1/";
		else
			return "redirect:/location1/";
	}

	@GetMapping("/location2edit/{id}")
	public String editChildOne(@PathVariable("id") String id, Model model) {
		String locpath = locationpath.get(0);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = Integer.parseInt(id);
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();
		System.out.println("Level 2 db point: " + dbPoint);
		locbreadcrumbs.add(0, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(1).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(1).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(1).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(2).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location2edit";
	}

	@PostMapping("/location2edit/{id}")
	public String editChild1Location(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);
		String locpath = locationpath.get(0);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location2/" + locpath;
	}

	@GetMapping("/location2Delete/{id}")
	public String delete_location2(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(0);

		return "redirect:/location2/" + locpath;
	}

	@GetMapping("/location3edit/{id}")
	public String editChildTwo(@PathVariable("id") String id, Model model) {
		String locpath = locationpath.get(1);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = Integer.parseInt(id);
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();
		System.out.println("Level 2 db point: " + dbPoint);

		locbreadcrumbs.add(1, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(2).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(2).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(2).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(3).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location3edit";
	}

	@PostMapping("/location3edit/{id}")
	public String editChild2Location(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);
		String locpath = locationpath.get(1);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location3/" + locpath;
	}

	@GetMapping("/location3Delete/{id}")
	public String delete_location3(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(1);

		return "redirect:/location3/" + locpath;
	}

	@GetMapping("/location4edit/{id}")
	public String editChildThree(@PathVariable("id") String id, Model model) {
		String locpath = locationpath.get(2);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = Integer.parseInt(id);
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(2, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(3).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(3).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(3).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(4).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location4edit";
	}

	@PostMapping("/location4edit/{id}")
	public String editChild3Location(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);
		String locpath = locationpath.get(2);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location4/" + locpath;
	}

	@GetMapping("/location4Delete/{id}")
	public String delete_location4(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(2);

		return "redirect:/location4/" + locpath;
	}

	@GetMapping("/location5edit/{id}")
	public String editChildFour(@PathVariable("id") String id, Model model) {
		String locpath = locationpath.get(3);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = Integer.parseInt(id);
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(3, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(4).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(4).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(4).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(5).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location5edit";
	}

	@PostMapping("/location5edit/{id}")
	public String editChild4Location(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);
		String locpath = locationpath.get(3);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location5/" + locpath;
	}

	@GetMapping("/location5Delete/{id}")
	public String delete_location5(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(3);

		return "redirect:/location5/" + locpath;
	}

	@GetMapping("/location6edit/{id}")
	public String editChildFive(@PathVariable("id") String id, Model model) {
		String locpath = locationpath.get(4);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = Integer.parseInt(id);
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(4, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(5).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(5).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(5).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		return "location6edit";
	}

	@PostMapping("/location6edit/{id}")
	public String editChild5Location(@PathVariable("id") int id, Model model, EditLocations editLocations) {
		int checkinsert = t.updateLocation(editLocations, id);
		String locpath = locationpath.get(4);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/location6/" + locpath;
	}

	@GetMapping("/location6Delete/{id}")
	public String delete_location6(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(4);

		return "redirect:/location6/" + locpath;
	}

	@GetMapping("/location7edit/{id}")
	public String edit_shop(@PathVariable("id") int id, Model model) {
		String locpath = locationpath.get(5);
		model.addAttribute("locationpath", locationpath);
		model.addAttribute("locpath", locpath);

		int pathVariable = Integer.parseInt(locpath);
		model.addAttribute("pathVariable", pathVariable);

		int findid = id;
		model.addAttribute("findid", findid);

		EditLocations editLocations = t.editLocation(findid);
		model.addAttribute("editLocations", editLocations);

		String dbPointdescr = editLocations.getLocationDesc();
		model.addAttribute("dbPointdescr", dbPointdescr);

		ArrayList<LocDescr> locDescr = t.findLocationDescr(pathVariable);
		String dbPoint = locDescr.get(0).getDbPointDescr();

		locbreadcrumbs.add(5, dbPoint);
		model.addAttribute("locbreadcrumbs", locbreadcrumbs);

		ArrayList<LocationMst> locMstList = t.locationMst();
		model.addAttribute("locMstList", locMstList);

		String dbPointTypeCode = locMstList.get(6).getDbPointTypeCode();
		model.addAttribute("dbPointTypeCode", dbPointTypeCode);

		ArrayList<National> showNational = t.showChildLocation(dbPointTypeCode, pathVariable);
		model.addAttribute("showNational", showNational);
		String title = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("title", title);

		String root = locMstList.get(6).getParentDescr();
		model.addAttribute("root", root);

		String nextLevel = locMstList.get(6).getDbPointTypeDescr();
		model.addAttribute("nextLevel", nextLevel);

		InsertChildLocation insertChildLocation = new InsertChildLocation();
		model.addAttribute("insertChildLocation", insertChildLocation);
		insertChildLocation.setDbPointTypeCode(dbPointTypeCode);
		insertChildLocation.setParentDbPointId(pathVariable);

		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);

		AddNewStore insert_store = t.edit_shop(id);

		model.addAttribute("insert_store", insert_store);
		ArrayList<DbPointType_Model> showList_dbPointType = (ArrayList<DbPointType_Model>) t.showTable_Db_Point_Type(2);
		model.addAttribute("showList_dbPointType", showList_dbPointType);
		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
		model.addAttribute("showList_division", showList_division);

		ArrayList<ParentDbPoint_Model> ParentDbPointlist = new ArrayList<>();
		model.addAttribute("ParentDbPointlist", ParentDbPointlist);

		ArrayList<DISTRICT> showList_district = new ArrayList<>();
		showList_district = t.getDistrict(insert_store.getDIV_CODE());
		model.addAttribute("showList_district", showList_district);

		ArrayList<THANA> ThanaList = new ArrayList<>();
		ThanaList = t.getThana(insert_store.getDIST_CODE());
		model.addAttribute("ThanaList", ThanaList);

		ArrayList<ZIP> ZipList = new ArrayList<>();
		ZipList = t.getZip(insert_store.getDIST_CODE());
		model.addAttribute("ZipList", ZipList);

		return "location7edit";
	}

	// update Store

	@PostMapping("/location7edit/{id}")
	public String update_store(@PathVariable("id") int id, Model model, AddNewStore insert_store) {
		insert_store.setPARENT_DB_POINT_ID(parentid);
		ArrayList<DbPointType_Model> showList_dbPointType = (ArrayList<DbPointType_Model>) t.showTable_Db_Point_Type(2);
		model.addAttribute("showList_dbPointType", showList_dbPointType);
		ArrayList<Division_Model> showList_division = (ArrayList<Division_Model>) t.showTable_Division();
		model.addAttribute("showList_division", showList_division);

		t.update_newStore(insert_store);
		String locpath = locationpath.get(5);

		return "redirect:/location7/" + locpath;
	}

	@GetMapping("/location7Delete/{id}")
	public String delete_location7(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		int flag = 1;
		model.addAttribute("flag", flag);
		t.deleteLocation(id);
		String locpath = locationpath.get(5);

		return "redirect:/location7/" + locpath;
	}

	// Designation start

	@GetMapping("/designation1")
	public String getDesignation1(Model model) {
		desig_breadcumbs.clear();
		employee_name.clear();
		locationpath.clear();

		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(0).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(0).getParent_descr();
		model.addAttribute("parent", parent);
		
		String nextLevel = designationMaster.get(1).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String designationCode = designationMaster.get(0).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String parentEmployeeId = "271";
		model.addAttribute("parentEmployeeId", parentEmployeeId);


		ArrayList<EmployeeShow> employeeShow = t.employee_show();
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation1";
	}
	
	@PostMapping("/designation1")
	public String designationInsert1(Model model, InsertDesignation insertDesignation) {
		
		int checkinsert = t.insertEmployee(insertDesignation);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation1";
	}
	
	@GetMapping("/designation2/{id}")
	public String getDesignation2(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(0, bloc);
		locationpath.add(0, bloc);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);
		
		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(0, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(1).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(1).getParent_descr();
		model.addAttribute("parent", parent);
		
		String nextLevel = designationMaster.get(2).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String designationCode = designationMaster.get(1).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation2";
	}
	
	
	@PostMapping("/designation2/{id}")
	public String designationInsert2(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation2/"+ locpath;
	}
	
	
	
	@GetMapping("/designation3/{id}")
	public String getDesignation3(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(1, bloc);
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);

		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(1, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(2).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(2).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(2).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(3).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation3";
	}
	
	
	@PostMapping("/designation3/{id}")
	public String designationInsert3(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation3/"+ locpath;
	}
	
	
	@GetMapping("/designation4/{id}")
	public String getDesignation4(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(2, bloc);
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);

		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(2, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(3).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(3).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(3).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(4).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation4";
	}
	
	
	@PostMapping("/designation4/{id}")
	public String designationInsert4(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation4/"+ locpath;
	}
	
	@GetMapping("/designation5/{id}")
	public String getDesignation5(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(3, bloc);
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);

		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(3, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(4).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(4).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(4).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(5).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation5";
	}
	
	
	@PostMapping("/designation5/{id}")
	public String designationInsert5(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation5/"+ locpath;
	}
	
	
	@GetMapping("/designation6/{id}")
	public String getDesignation6(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(4, bloc);
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);

		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(4, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(5).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(5).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(5).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(6).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation6";
	}
	
	
	@PostMapping("/designation6/{id}")
	public String designationInsert6(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation6/"+ locpath;
	}
	
	
	@GetMapping("/designation7/{id}")
	public String getDesignation7(@PathVariable("id") int id, Model model) {
		String bloc = String.valueOf(id); 
		desig_breadcumbs.add(5, bloc);
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);

		ArrayList<DesigDescr> desigDescr = t.empName(id);
		String emp_name = desigDescr.get(0).getEmp_name();
		employee_name.add(5, emp_name);
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		
		String title = designationMaster.get(6).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(6).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(6).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(6).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(id, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation7";
	}
	
	
	@PostMapping("/designation7/{id}")
	public String designationInsert7(@PathVariable("id") int id, Model model, InsertDesignation insertDesignation) {
		String locpath = String.valueOf(id);
		int checkinsert = t.insertEmployee(insertDesignation);
		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation7/"+ locpath;
	}
		
	@GetMapping("/designation1edit/{id}")
	public String getDesignation1edit(@PathVariable("id") int id, Model model){
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster); 
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 

		String title = designationMaster.get(0).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(0).getParent_descr();
		model.addAttribute("parent", parent);
		
		String nextLevel = designationMaster.get(1).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String designationCode = designationMaster.get(0).getDesig_code();
		model.addAttribute("designationCode", designationCode);

		ArrayList<EmployeeShow> employeeShow = t.employee_show();
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		return "designation1edit";
	}
	
	@PostMapping("/designation1edit/{id}")
	public String updateDesignation1(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation1/";
	}
	
	@GetMapping("/designation1Delete/{id}")
	public String deleteDesignation1(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		t.deleteEmployee(id);
		
		return "redirect:/designation1/";
	}
	
	@GetMapping("/designation2edit/{id}")
	public String getDesignation2edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(0);
		int path = Integer.valueOf(index);
		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(1).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(1).getParent_descr();
		model.addAttribute("parent", parent);
		
		String nextLevel = designationMaster.get(2).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String designationCode = designationMaster.get(1).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation2edit";
	}
	@PostMapping("/designation2edit/{id}")
	public String updateDesignation2(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(0);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation2/" + locpath;
	}
	
	@GetMapping("/designation2Delete/{id}")
	public String deleteDesignation2(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(0);

		t.deleteEmployee(id);
		
		return "redirect:/designation2/" + locpath;
	}
	
	
	@GetMapping("/designation3edit/{id}")
	public String getDesignation3edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(1);
		int path = Integer.valueOf(index);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(2).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(2).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(2).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(3).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation3edit";
	}
	
	
	@PostMapping("/designation3edit/{id}")
	public String updateDesignation3(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(1);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation3/" + locpath;
	}
	
	
	@GetMapping("/designation3Delete/{id}")
	public String deleteDesignation3(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(1);

		t.deleteEmployee(id);
		
		return "redirect:/designation3/" + locpath;
	}
	
	
	@GetMapping("/designation4edit/{id}")
	public String getDesignation4edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(2);
		int path = Integer.valueOf(index);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(3).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(3).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(3).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(4).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation4edit";
	}
	
	
	@PostMapping("/designation4edit/{id}")
	public String updateDesignation4(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(2);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation4/" + locpath;
	}
	
	@GetMapping("/designation4Delete/{id}")
	public String deleteDesignation4(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(2);

		t.deleteEmployee(id);
		
		return "redirect:/designation4/" + locpath;
	}
	
	@GetMapping("/designation5edit/{id}")
	public String getDesignation5edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(3);
		int path = Integer.valueOf(index);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(4).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(4).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(4).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(5).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation5edit";
	}
	
	
	@PostMapping("/designation5edit/{id}")
	public String updateDesignation5(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(3);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation5/" + locpath;
	}
	
	@GetMapping("/designation5Delete/{id}")
	public String deleteDesignation5(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(3);

		t.deleteEmployee(id);
		
		return "redirect:/designation5/" + locpath;
	}
	
	
	@GetMapping("/designation6edit/{id}")
	public String getDesignation6edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(4);
		int path = Integer.valueOf(index);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(5).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(5).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(5).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(6).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation6edit";
	}
	
	
	@PostMapping("/designation6edit/{id}")
	public String updateDesignation6(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(4);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation6/" + locpath;
	}
	
	@GetMapping("/designation6Delete/{id}")
	public String deleteDesignation6(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(4);

		t.deleteEmployee(id);
		
		return "redirect:/designation6/" + locpath;
	}
	
	
	@GetMapping("/designation7edit/{id}")
	public String getDesignation7edit(@PathVariable("id") int id, Model model) {
		ArrayList<DesignationMaster> designationMaster = t.designationMst();
		model.addAttribute("designationMaster", designationMaster);
		String index = desig_breadcumbs.get(5);
		int path = Integer.valueOf(index);
		
		model.addAttribute("desig_breadcumbs", desig_breadcumbs);		
		model.addAttribute("employee_name", employee_name);
		
		ArrayList<EditEmployee> editEmployee = t.empEdit(id);
		model.addAttribute("editEmployee", editEmployee); 
		
		String v_empName = editEmployee.get(0).getEmpName();
		model.addAttribute("v_empName", v_empName); 
		
		String v_shortName = editEmployee.get(0).getShortName();
		model.addAttribute("v_shortName", v_shortName); 
		
		String v_mobileNo = editEmployee.get(0).getMobileNo();
		model.addAttribute("v_mobileNo", v_mobileNo); 
		
		String v_email = editEmployee.get(0).getEmail();
		model.addAttribute("v_email", v_email); 
		
		String title = designationMaster.get(6).getDesig_descr();
		model.addAttribute("title", title);
		
		String parent = designationMaster.get(6).getParent_descr();
		model.addAttribute("parent", parent);
		
		String designationCode = designationMaster.get(6).getDesig_code();
		model.addAttribute("designationCode", designationCode);
		
		String nextLevel = designationMaster.get(6).getDesig_descr();
		model.addAttribute("nextLevel", nextLevel);
		
		String parentEmployeeId = String.valueOf(id);
		model.addAttribute("parentEmployeeId", parentEmployeeId);

		ArrayList<EmployeeShow> employeeShow = t.child_employee_show(path, designationCode);
		model.addAttribute("employeeShow", employeeShow);
		
		InsertDesignation insertDesignation = new InsertDesignation();
		model.addAttribute("insertDesignation", insertDesignation);
		
		insertDesignation.setDesigCode(designationCode);
		insertDesignation.setParentEmpId(parentEmployeeId);
		
		return "designation7edit";
	}
	
	
	@PostMapping("/designation7edit/{id}")
	public String updateDesignation7(@PathVariable("id") int id, Model model, EditEmployee editEmployee) {
		String locpath = desig_breadcumbs.get(5);
		int checkinsert = t.updateDesignation(editEmployee, id);

		if (checkinsert == 1) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		return "redirect:/designation7/" + locpath;
	}
	
	@GetMapping("/designation7Delete/{id}")
	public String deleteDesignation7(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id); 
		String locpath = desig_breadcumbs.get(5);

		t.deleteEmployee(id);
		
		return "redirect:/designation7/" + locpath;
	}
	
}
