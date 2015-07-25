package myBbsApp.action;

import java.util.List;

import javax.annotation.Resource;

import myBbsApp.entity.BbsTable1;
import myBbsApp.form.BbsForm;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class BbsAction {

	public JdbcManager jdbcManager;
	public String result;
	public List<BbsTable1> results;
	public List<BbsTable1> rresults;
	public String sub;
	public String del;


	@ActionForm
	@Resource
	protected BbsForm bbsForm;

	@Execute(validator = false)
	public String index() {

		this.results = jdbcManager.from(BbsTable1.class).getResultList();
		rresults = reverse(results);

//		this.sub = bbsForm.sub;

		return "input.jsp";

	}

	private List<BbsTable1> reverse(List<BbsTable1> results2) {
		// TODO 自動生成されたメソッド・スタブ

		return null;
	}

	@Execute(validator = false)
	public String result() {

		BbsTable1 bbstb = new BbsTable1();

		bbstb.id = bbsForm.id;
		bbstb.title = bbsForm.title;
		bbstb.name = bbsForm.name;
		bbstb.comment = bbsForm.comment;
		bbstb.uptime = bbsForm.uptime;


		jdbcManager.insert(bbstb).execute();

		this.results = jdbcManager.from(BbsTable1.class).getResultList();


//		this.rresults = reverse(results);
//		for (int i = 0; i < 9; ++i) {
//
//			System.out.println(results.get(i).name);
//		}

//		result = bbstb.id + ":" + bbstb.name + ":" + bbstb.comment;

//		int count1 = jdbcManager.delete(bbstb).execute();

		return "input.jsp";
	}



	@Execute(validator = false)
	public String delete() {
		BbsTable1 bbstb = new BbsTable1();

		bbstb.id = bbsForm.id;
		bbstb.title = bbsForm.title;
		bbstb.name = bbsForm.name;
		bbstb.comment = bbsForm.comment;
		bbstb.uptime = bbsForm.uptime;


		System.out.println("===============================================================================");
		System.out.println(bbsForm.id);
		System.out.println("===============================================================================");
		jdbcManager.delete(bbstb).execute();

		this.results = jdbcManager.from(BbsTable1.class).getResultList();
		this.rresults = reverse(results);


		this.del = bbsForm.del;

		return "input.jsp";
	}

}
