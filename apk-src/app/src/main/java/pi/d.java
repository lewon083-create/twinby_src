package pi;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements ei.b, j, h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f31479d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f31480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31481c = false;

    public static e c(fd.i iVar) {
        String str = iVar.f16772a;
        String str2 = iVar.f16773b;
        String str3 = iVar.f16776e;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = iVar.f16778g;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = iVar.f16774c;
        String str6 = iVar.f16777f;
        String str7 = iVar.f16775d;
        e eVar = new e();
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        eVar.f31482a = str;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        eVar.f31483b = str2;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        eVar.f31484c = str3;
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        eVar.f31485d = str4;
        eVar.f31486e = null;
        eVar.f31487f = str5;
        eVar.f31488g = str6;
        eVar.f31489h = null;
        eVar.i = str7;
        eVar.f31490j = null;
        eVar.f31491k = null;
        eVar.f31492l = null;
        eVar.f31493m = null;
        eVar.f31494n = null;
        return eVar;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        j.a(aVar.f16383c, this);
        h.b(aVar.f16383c, this);
        this.f31480b = aVar.f16381a;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f31480b = null;
        j.a(aVar.f16383c, null);
        h.b(aVar.f16383c, null);
    }
}
