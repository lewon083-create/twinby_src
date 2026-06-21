package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fx3 extends xv3 {
    public fx3(iw3 iw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(iw3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.jw3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        qw3 qw3Var;
        if (!TextUtils.isEmpty(str) && (qw3Var = qw3.f42411c) != null) {
            for (zv3 zv3Var : Collections.unmodifiableCollection(qw3Var.f42412a)) {
                if (this.f44816c.contains(zv3Var.f45559h)) {
                    ka kaVar = zv3Var.f45556e;
                    if (this.f44818e >= kaVar.f40131f) {
                        kaVar.f40130e = 2;
                        lx3.f40715a.a((WebView) kaVar.f40127b.get(), "setNativeViewHierarchy", str, kaVar.f40126a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (ow3.c(this.f44817d, this.f40001b.f39662a)) {
            return null;
        }
        iw3 iw3Var = this.f40001b;
        JSONObject jSONObject = this.f44817d;
        iw3Var.f39662a = jSONObject;
        return jSONObject.toString();
    }
}
