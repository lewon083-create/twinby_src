package y8;

import a0.d1;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f36568e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f36569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f36570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9.c f36571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f36572d;

    public q(h9.a aVar, h9.a aVar2, d9.c cVar, com.google.android.gms.internal.consent_sdk.c cVar2, s7.g gVar) {
        this.f36569a = aVar;
        this.f36570b = aVar2;
        this.f36571c = cVar;
        this.f36572d = cVar2;
        ((Executor) gVar.f32795b).execute(new d1(17, gVar));
    }

    public static q a() {
        k kVar = f36568e;
        if (kVar != null) {
            return (q) kVar.f36560g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f36568e == null) {
            synchronized (q.class) {
                try {
                    if (f36568e == null) {
                        ti.b bVar = new ti.b();
                        context.getClass();
                        bVar.f33798b = context;
                        f36568e = bVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final p c(l lVar) {
        byte[] bytes;
        Set setUnmodifiableSet = lVar != null ? Collections.unmodifiableSet(w8.a.f35202d) : Collections.singleton(new v8.c("proto"));
        x7.b bVarA = j.a();
        lVar.getClass();
        bVarA.f35977b = "cct";
        w8.a aVar = (w8.a) lVar;
        String str = aVar.f35205a;
        String str2 = aVar.f35206b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = z.e("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        bVarA.f35978c = bytes;
        return new p(setUnmodifiableSet, bVarA.a(), this);
    }
}
