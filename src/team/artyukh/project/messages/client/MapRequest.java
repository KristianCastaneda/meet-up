package team.artyukh.project.messages.client;

import org.json.JSONException;
import org.json.JSONObject;

import team.artyukh.project.BindingActivity;

public class MapRequest {
	JSONObject request = new JSONObject();

	public MapRequest(double minLat, double minLon, double maxLat, double maxLon) {
		try {
			request.put("type", "req");
			request.put("group", BindingActivity.getStringPref(BindingActivity.PREF_GROUP));
			request.put("username", BindingActivity.getStringPref(BindingActivity.PREF_USERNAME));
			request.put("minLat", Math.toDegrees(minLat));
			request.put("minLon", Math.toDegrees(minLon));
			request.put("maxLat", Math.toDegrees(maxLat));
			request.put("maxLon", Math.toDegrees(maxLon));
		} catch (JSONException e) {
		}

	}

	public String toString() {
		return request.toString();
	}
}
