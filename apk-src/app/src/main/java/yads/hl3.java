package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f39238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl3 f39239b;

    public hl3(Context context) {
        this(ry2.a(new ry2(), context, "ViewSizeInfoStorage"), new fl3());
    }

    public static String a(il3 il3Var) {
        return il3Var.a() + "-" + il3Var.b();
    }

    public final void a(il3 il3Var, el3 el3Var) throws JSONException {
        String strA = a(il3Var);
        this.f39239b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", el3Var.f38173a.f37823a);
        jSONObject2.put("height", el3Var.f38173a.f37824b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", el3Var.f38174b.f37363a);
        jSONObject3.put("height", el3Var.f38174b.f37364b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", el3Var.f38175c.f40561a.f40931a);
        String strName = el3Var.f38175c.f40561a.f40932b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put("mode", lowerCase);
        jSONObject5.put("value", el3Var.f38175c.f40562b.f40931a);
        String lowerCase2 = el3Var.f38175c.f40562b.f40932b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put("mode", lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(el3Var.f38176d);
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String string = jSONObject.toString();
        SharedPreferences.Editor editorEdit = this.f39238a.edit();
        editorEdit.putString(strA, string);
        editorEdit.apply();
    }

    public hl3(SharedPreferences sharedPreferences, fl3 fl3Var) {
        this.f39238a = sharedPreferences;
        this.f39239b = fl3Var;
    }
}
