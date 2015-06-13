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

	@ActionForm
	@Resource
	protected BbsForm bbsForm;

	@Execute(validator = false)
	public String index() {

		return "input.jsp";

	}

	@Execute(validator = false)
    public String result() {

		BbsTable1 bbstb = new BbsTable1();

		bbstb.id = bbsForm.id;
		bbstb.name = bbsForm.name;
		bbstb.comment = bbsForm.comment;

		int count =
			    jdbcManager
			        .insert(bbstb)
			        .execute();

		List<BbsTable1> results =
			    jdbcManager
			        .from(BbsTable1.class)
			        .getResultList();

		for(int i = 0; i < 9; ++i){

			System.out.println(results.get(i).name);
		}
		result = bbstb.id + ":" + bbstb.name + ":" + bbstb.comment;

        return "result.jsp";
    }


}
