package ba;

import android.net.Uri;
import com.google.android.gms.internal.ads.nz;
import d8.u;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2013a;

    public /* synthetic */ a(u uVar) {
        this.f2013a = uVar.f15702c;
    }

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f2013a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public a() {
        this.f2013a = (String) nz.f8506l.r();
    }

    public a(String str) {
        this.f2013a = str;
    }
}
