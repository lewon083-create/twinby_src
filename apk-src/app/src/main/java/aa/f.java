package aa;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.z71;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f580b;

    public /* synthetic */ f(int i, Object obj) {
        this.f579a = i;
        this.f580b = obj;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        switch (this.f579a) {
            case 0:
                final l lVar = (l) this.f580b;
                final ArrayList arrayList = (ArrayList) obj;
                return vv.K(lVar.r4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new c31() { // from class: aa.g
                    @Override // com.google.android.gms.internal.ads.c31
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri : arrayList) {
                            l lVar2 = lVar;
                            if (!l.p4(uri, lVar2.A, lVar2.B) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri);
                            } else {
                                arrayList2.add(l.s4("nas", uri, str));
                            }
                        }
                        return arrayList2;
                    }
                }, lVar.f627h);
            case 1:
                l lVar2 = (l) this.f580b;
                final Uri uri = (Uri) obj;
                return vv.K(lVar2.r4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new c31() { // from class: aa.h
                    @Override // com.google.android.gms.internal.ads.c31
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !zIsEmpty ? l.s4("nas", uri2, str) : uri2;
                    }
                }, lVar2.f627h);
            default:
                pg0 pg0Var = (pg0) obj;
                t tVar = new t(new JsonReader(new InputStreamReader(pg0Var.f9047a)), pg0Var.f9048b);
                ku kuVar = (ku) this.f580b;
                try {
                    tVar.f702b = q9.r.f31959g.f31960a.l(kuVar.f7297b).toString();
                    break;
                } catch (JSONException unused) {
                    tVar.f702b = "{}";
                }
                Bundle bundle = kuVar.f7309o;
                if (!bundle.isEmpty()) {
                    try {
                        tVar.f703c = q9.r.f31959g.f31960a.l(bundle).toString();
                        break;
                    } catch (JSONException unused2) {
                    }
                }
                return vv.d(tVar);
        }
    }
}
