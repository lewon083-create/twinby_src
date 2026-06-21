package aa;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.tw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f616f;

    public /* synthetic */ k(l lVar, tw twVar, int i, Bundle bundle) {
        this.f612b = 0;
        this.f614d = lVar;
        this.f615e = twVar;
        this.f613c = i;
        this.f616f = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f612b) {
            case 0:
                l lVar = (l) this.f614d;
                tw twVar = (tw) this.f615e;
                Bundle bundle = (Bundle) this.f616f;
                return lVar.q4(lVar.f623d, twVar.f10737b, twVar.f10738c, twVar.f10739d, twVar.f10740e, this.f613c, twVar.f10742g, bundle, twVar);
            case 1:
                String str = (String) this.f614d;
                Context context = (Context) this.f615e;
                Object[] objArr = {(d2.d) this.f616f};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return d2.g.b(str, context, Collections.unmodifiableList(arrayList), this.f613c);
            default:
                try {
                    return d2.g.b((String) this.f614d, (Context) this.f615e, (ArrayList) this.f616f, this.f613c);
                } catch (Throwable unused) {
                    return new d2.f(-3);
                }
        }
    }

    public /* synthetic */ k(String str, Context context, Object obj, int i, int i10) {
        this.f612b = i10;
        this.f614d = str;
        this.f615e = context;
        this.f616f = obj;
        this.f613c = i;
    }
}
