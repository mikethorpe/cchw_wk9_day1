import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class GroupGeneratorController {

	public static void main(String[] args) {

		VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

		Cohort e23 = new Cohort();

		get("/random", (req, res) -> {
				HashMap<String, Object> model = new HashMap<String, Object>();
				model.put("randomStudent", e23.getRandomStudent());
				model.put("template", "randomStudent.vtl");
				return new ModelAndView(model, "layout.vtl");
			},
			velocityTemplateEngine
		);

		get("/pair", (req, res) -> {
			HashMap<String, Object> model = new HashMap<>();
			ArrayList<Student> randomStudents = e23.getTwoRandomStudents();
			model.put("randomStudentPair", randomStudents);
			model.put("template", "randomStudentPair.vtl");
			return new ModelAndView(model, "layout.vtl");
		},
			velocityTemplateEngine
		);

		get("/groups/:size", (req, res) -> {
				HashMap<String, Object> model = new HashMap<>();
				int groupSize = (Integer.parseInt(req.params(":size")));
				ArrayList<Group> groups = e23.getGroups(groupSize);
				model.put("randomGroups", groups);
				model.put("template", "randomGroups.vtl");
				return new ModelAndView(model, "layout.vtl");
			},
			velocityTemplateEngine
		);
	}
}
