package p9;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.wv;
import java.util.Collections;
import java.util.List;
import t9.g0;
import t9.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wv f31257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bu f31258d = new bu(false, Collections.EMPTY_LIST);

    public a(Context context, wv wvVar) {
        this.f31255a = context;
        this.f31257c = wvVar;
    }

    public final boolean a() {
        wv wvVar = this.f31257c;
        return ((wvVar == null || !((tv) wvVar).f10728g.f11110g) && !this.f31258d.f3902b) || this.f31256b;
    }

    public final void b(String str) {
        List<String> list;
        bu buVar = this.f31258d;
        wv wvVar = this.f31257c;
        if ((wvVar == null || !((tv) wvVar).f10728g.f11110g) && !buVar.f3902b) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (wvVar != null) {
            ((tv) wvVar).b(3, str, null);
            return;
        }
        if (!buVar.f3902b || (list = buVar.f3903c) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                g0 g0Var = k.C.f31297c;
                new x(this.f31255a, "", strReplace, null).B();
            }
        }
    }
}
